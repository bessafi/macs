package com.bombardier.macs.util.retriever;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.bombardier.macs.Constants;
import com.bombardier.macs.Constants.MinimumCheckType;
import com.bombardier.macs.MacsException;
import com.bombardier.macs.model.Cahier;
import com.bombardier.macs.model.CahierDrawing;
import com.bombardier.macs.model.WorkcenterPart;
import com.bombardier.macs.util.HelperClass;
import com.bombardier.macs.util.SapClient;
import com.bombardier.sap.client.minimumcheck.BomMinimumCheck;
import com.bombardier.sap.client.minimumcheck.Entries;
import com.bombardier.sap.client.minimumcheck.MinimumCheckResponse;
import com.bombardier.sap.client.minimumcheck.ObjectDependenciesMinimumCheck;
import com.bombardier.sap.client.minimumcheck.RoutingMinimumCheck;
import com.bombardier.sap.client.minimumcheck._BomMinimumCheck_Items;
import com.bombardier.sap.client.minimumcheck._RoutingMinimumCheck_Items;

public class SapMinimumCheckRetriever extends SapClient {

	public static boolean getCahierMinimumCheck(Cahier cahier, MinimumCheckType minimumCheckType) throws MacsException {
		try {
			boolean minimumCheckStatus;
			minimumCheckStatus = getCahierMinimumCheckInternal(cahier, minimumCheckType);

			return minimumCheckStatus;
		} catch (Exception e) {
			MacsException me = new MacsException(e);
			throw me;
		}
	}

	private static boolean getCahierMinimumCheckInternal(Cahier cahier, MinimumCheckType minimumCheckType)
			throws MacsException {
		try {
			MinimumCheckResponse response = null;
			switch (minimumCheckType) {
			case BOM:
				BomMinimumCheck requestDataBom = wipCahierToBomMinCheckRequest(cahier);
				response = makeMinimumCheckCall(requestDataBom);
				break;
			case DEPENDENCY:
				ObjectDependenciesMinimumCheck requestDataObjectDependency = wipCahierToOdMinCheckRequest(cahier);
				response = makeMinimumCheckCall(requestDataObjectDependency);
				break;

			case ROUTING:
				RoutingMinimumCheck requestDataRouting = wipCahierToRoutingMinCheckRequest(cahier);
				response = makeMinimumCheckCall(requestDataRouting);
				break;

			default:
				break;
			}
			return response != null ? parseResponse(response) : false;

		} catch (Exception e) {
			MacsException me = new MacsException(e);
			throw me;
		}
	}

	private static RoutingMinimumCheck wipCahierToRoutingMinCheckRequest(Cahier cahier) {
		RoutingMinimumCheck requestData = new RoutingMinimumCheck();

		List<_RoutingMinimumCheck_Items> items = new ArrayList<_RoutingMinimumCheck_Items>();

		requestData.setMaterialNbr(cahier.getName());
		// requestData.setPlant(cahier.getWcId());

		Set<String> processedDrawings = new HashSet<String>();

		Set<WorkcenterPart> parts = cahier.getCahierParts();
		Set<CahierDrawing> drawings = cahier.getDrawings();

		if (drawings != null && !drawings.isEmpty()) {
			for (CahierDrawing drawing : drawings) {

				_RoutingMinimumCheck_Items item = new _RoutingMinimumCheck_Items();
				item.setWorkCenter(cahier.getWorkcenter() != null ? cahier.getWorkcenter().getWcNumber() : "");
				item.setDocNum(drawing.getNumber());
				item.setDocVersion(drawing.getRevision());
				items.add(item);
			}
		}

		if (parts != null && !parts.isEmpty()) {
			for (WorkcenterPart part : parts) {

				WorkcenterPart parent = part.getParent();

				if (parent != null && !HelperClass.isNullOrBlankOrInvalid(parent.getDrawing()) && !processedDrawings
						.contains(parent.getDrawing() + (parent.getRevision() != null ? parent.getRevision() : ""))) {
					processedDrawings
							.add(parent.getDrawing() + (parent.getRevision() != null ? parent.getRevision() : ""));

					_RoutingMinimumCheck_Items item = new _RoutingMinimumCheck_Items();
					item.setWorkCenter(cahier.getWorkcenter() != null ? cahier.getWorkcenter().getWcNumber() : "");
					item.setDocNum(parent.getDrawing());
					item.setDocVersion(parent.getRevision());
					items.add(item);
				}
			}
		}

		requestData.setItems(
				items != null && !items.isEmpty() ? items.toArray(new _RoutingMinimumCheck_Items[items.size()]) : null);

		return requestData;
	}

	private static ObjectDependenciesMinimumCheck wipCahierToOdMinCheckRequest(Cahier cahier) {
		ObjectDependenciesMinimumCheck requestData = new ObjectDependenciesMinimumCheck();

		requestData.setMaterialNbr(cahier.getName());
		// requestData.setPlant(cahier.getWcId());

		Set<WorkcenterPart> parts = cahier.getCahierParts();

		if (parts != null && !parts.isEmpty()) {
			for (WorkcenterPart part : parts) {

				// WorkcenterPart parent = part.getParent();

				// TODO format will change, will become a list of strings as
				// opposed to just one
				// TODO check if it is string itself or string of parent

				// (parent != null && parent.getString() != null) {
				// requestData.setNameOfDependency(parent.getString());
				// }
				if (!HelperClass.isNullOrBlankOrInvalid(part.getString())) {
					requestData.setNameOfDependency(part.getString());
				}
			}
		}

		return requestData;
	}

	private static BomMinimumCheck wipCahierToBomMinCheckRequest(Cahier cahier) {
		BomMinimumCheck requestData = new BomMinimumCheck();

		List<_BomMinimumCheck_Items> items = new ArrayList<_BomMinimumCheck_Items>();

		requestData.setMaterialNbr(cahier.getName());
		// requestData.setPlant(cahier.getWcId());

		Set<WorkcenterPart> parts = cahier.getCahierParts();

		if (parts != null && !parts.isEmpty()) {
			for (WorkcenterPart part : parts) {

				_BomMinimumCheck_Items item = new _BomMinimumCheck_Items();
				item.setComponent(!HelperClass.isNullOrBlankOrInvalid(part.getMaterialNo()) ? part.getMaterialNo()
						: part.getNumber());
				items.add(item);
			}
			requestData.setItems(
					items != null && !items.isEmpty() ? items.toArray(new _BomMinimumCheck_Items[items.size()]) : null);
		}

		return requestData;
	}

	private static boolean parseResponse(MinimumCheckResponse response) {
		boolean success = false;
		if (response.getEntries() != null) {
			for (Entries entries : response.getEntries()) {
				if (entries != null) {
					switch (entries.getID()) {
					case Constants.CAHIER_MINIMUM_CHECK_SUCCESS_STATUS:
						success = true;
						break;
					default:
						success = false;
						break;
					}
				}
			}
		} else {
			success = true; // TODO remove this temporary code
		}
		return success;
	}
}
