package com.bombardier.macs.util.retriever;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.bombardier.macs.Constants;
import com.bombardier.macs.MacsException;
import com.bombardier.macs.model.Cahier;
import com.bombardier.macs.model.CahierDrawing;
import com.bombardier.macs.model.WorkcenterPart;
import com.bombardier.macs.util.HelperClass;
import com.bombardier.macs.util.SapClient;
import com.bombardier.sap.client.cahier.CahierHeader;
import com.bombardier.sap.client.cahier.CahierParts;
import com.bombardier.sap.client.cahier.CahierString;
import com.bombardier.sap.client.cahier.Entries;
import com.bombardier.sap.client.cahier.WorkUnit;

public class SapCahierConfirmationRetriever extends SapClient {
/*
	public static boolean getCahierConfirmation(Cahier cahier) throws MacsException {
		try {
			boolean confirmationSuccess;
			confirmationSuccess = getCahierConfirmationInternal(cahier);

			return confirmationSuccess;
		} catch (Exception e) {
			MacsException me = new MacsException(e);
			throw me;
		}
	}

	private static boolean getCahierConfirmationInternal(Cahier cahier) throws MacsException {
		try {
			com.bombardier.sap.client.cahier.Cahier requestData = wipCahierToCahierConfirmationRequest(cahier);

			Entries[] response = makeCahierCall(requestData);

			return parseResponse(response);

		} catch (Exception e) {
			MacsException me = new MacsException(e);
			throw me;
		}
	}

	private static boolean parseResponse(Entries[] response) {
		boolean success = false;
		for (Entries entries : response) {
			if (entries != null) {
				switch (entries.getID()) {
				case Constants.CAHIER_CONFIRMATION_SUCCESS_STATUS:
					success = true;
					break;
				default:
					success = false;
					break;
				}
			}
		}
		return success;
	}

	private static com.bombardier.sap.client.cahier.Cahier wipCahierToCahierConfirmationRequest(Cahier cahier) {
		com.bombardier.sap.client.cahier.Cahier confirmationCahierData = new com.bombardier.sap.client.cahier.Cahier();
		CahierHeader q_cahierHeader = new CahierHeader();
		List<CahierParts> q_cahierParts = new ArrayList<CahierParts>();
		List<CahierString> q_cahierStrings = new ArrayList<CahierString>();
		List<com.bombardier.sap.client.cahier.CahierDrawing> q_cahierDrawings = new ArrayList<com.bombardier.sap.client.cahier.CahierDrawing>();
		WorkUnit q_workUnit = new WorkUnit();

		Set<WorkcenterPart> parts = cahier.getCahierParts();
		Set<CahierDrawing> drawings = cahier.getDrawings();
		Set<String> processedDrawings = new HashSet<String>();

		if (parts != null && !parts.isEmpty()) {
			for (WorkcenterPart part : parts) {
				// TODO validate fields + add more
				CahierParts cahierPart = new CahierParts();
				// cahierPart.setItemNum(part.getNumber());
				cahierPart.setItemNum(!HelperClass.isNullOrBlankOrInvalid(part.getMaterialNo()) ? part.getMaterialNo()
						: part.getNumber());
				cahierPart.setStatus(toNumericalStatusCode(part.getStatusNbrAssgn()));
				cahierPart.setQuantity(BigDecimal.valueOf(part.getQty()));

				WorkcenterPart parent = part.getParent();

				CahierString cahierString = new CahierString();
				cahierString.setString(part.getString());
				q_cahierStrings.add(cahierString);

				if (parent != null && parent.getDrawing() != null && !processedDrawings
						.contains(parent.getDrawing() + (parent.getRevision() != null ? parent.getRevision() : ""))) {
					processedDrawings
							.add(parent.getDrawing() + (parent.getRevision() != null ? parent.getRevision() : ""));
					com.bombardier.sap.client.cahier.CahierDrawing cahierDrawing = new com.bombardier.sap.client.cahier.CahierDrawing();
					cahierDrawing.setDrawing(parent.getDrawing());
					cahierDrawing.setVersion(parent.getRevision());
					q_cahierDrawings.add(cahierDrawing);

				}

				q_cahierParts.add(cahierPart);

			}
		}

		if (drawings != null && !drawings.isEmpty()) {
			for (CahierDrawing drawing : drawings) {
				if (!HelperClass.isNullOrBlankOrInvalid(drawing.getNumber())) {
					com.bombardier.sap.client.cahier.CahierDrawing dw = new com.bombardier.sap.client.cahier.CahierDrawing();
					dw.setDrawing(drawing.getNumber().trim());
					if (!HelperClass.isNullOrBlankOrInvalid(drawing.getRevision())) {
						dw.setVersion(drawing.getRevision().trim());
					}
					q_cahierDrawings.add(dw);
				}
			}
		}
		// todo once new wsdl received, update to include many drawings
		//confirmationCahierData.setRouting(q_cahierDrawings != null && !q_cahierDrawings.isEmpty() ? q_cahierDrawings.toArray(new com.bombardier.sap.client.cahier.CahierDrawing[q_cahierDrawings.size()]): null);
		// q_routing.setDrawings(
		// q_cahierDrawings.toArray(new
		// com.bombardier.sap.client.cahier.CahierDrawing[q_cahierDrawings.size()]));

		// TODO have to either bring lists to db or have ui sending the proper
		// values for header as currently only id is in db and that id has no
		// meaning for PI
		q_cahierHeader.setMaterialNumber(cahier.getName());
		q_cahierHeader.setPlant(cahier.getWorkcenter().getWcNumber());
		confirmationCahierData.setHeader(q_cahierHeader);
		confirmationCahierData.setBOM(q_cahierParts.toArray(new CahierParts[q_cahierParts.size()]));
		confirmationCahierData.setObjectDependency(q_cahierStrings.toArray(new CahierString[q_cahierStrings.size()]));

		confirmationCahierData.setWorkUnit(q_workUnit);

		return confirmationCahierData;
	}

	private static BigInteger toNumericalStatusCode(String statusNbrAssgn) {
		// TODO Auto-generated method stub
		return null;
	}*/

}
