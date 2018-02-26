package com.bombardier.macs.util.retriever;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.bombardier.macs.Constants;
import com.bombardier.macs.MacsException;
import com.bombardier.macs.json.model.CahierSuggestion;
import com.bombardier.macs.model.Cahier;
import com.bombardier.macs.model.CahierDrawing;
import com.bombardier.macs.model.WorkcenterPart;
import com.bombardier.macs.util.HelperClass;
import com.bombardier.macs.util.SapClient;
import com.bombardier.sap.client.mbom.Drawing;
import com.bombardier.sap.client.mbom.MBom;
import com.bombardier.sap.client.mbom.MBomResponse;
import com.bombardier.sap.client.mbom._MBomResponse_Entries;
import com.bombardier.sap.client.mbom.__MBomResponse_Result_Entries;

public class SapCahierSuggestionRetriever extends SapClient {
/*
	public static List<CahierSuggestion> getCahierSuggestion(Cahier cahier) throws MacsException {
		try {
			List<CahierSuggestion> cahierSuggestions;

			cahierSuggestions = getCahierSuggestionInternal(cahier);

			return cahierSuggestions;

		} catch (Exception e) {
			MacsException me = new MacsException(e);
			throw me;
		}
	}

	private static List<CahierSuggestion> getCahierSuggestionInternal(Cahier cahier) throws MacsException {
		try {

			com.bombardier.sap.client.mbom.MBom requestData = wipCahierToCahierSuggestionRequest(cahier);

			MBomResponse response = makeMbomCall(requestData);

			return parseResponse(response);

		} catch (Exception e) {
			MacsException me = new MacsException(e);
			throw me;
		}
	}

	private static List<CahierSuggestion> parseResponse(MBomResponse response) {
		List<CahierSuggestion> cahierSuggestions = null;

		if (validateResponse(response)) {
			cahierSuggestions = new ArrayList<CahierSuggestion>();
			if (response.getResult() != null) {
				for (__MBomResponse_Result_Entries cahierSuggestionResult : response.getResult()) {

					CahierSuggestion cahierSuggestion = new CahierSuggestion(cahierSuggestionResult.getPlantNo(),
							cahierSuggestionResult.getMaterialNo(), cahierSuggestionResult.getCompatibility());
					cahierSuggestions.add(cahierSuggestion);
				}
			}
		}

		return cahierSuggestions;
	}

	private static boolean validateResponse(MBomResponse response) {

		boolean success = false;
		if (response != null && response.getEntries() != null) {
			for (_MBomResponse_Entries entries : response.getEntries()) {
				if (entries != null) {
					switch (entries.getID()) {
					case Constants.CAHIER_SUGGESTION_SUCCESS_STATUS:
						success = true;
						break;
					default:
						success = false;
						break;
					}
				}
			}
		}
		return success;
	}
*/
	private static MBom wipCahierToCahierSuggestionRequest(Cahier cahier) {

		MBom cahierSuggestionData = new MBom();
		// TODO remove hardcoding, waiting for material number from SAP field to
		// be added
		Set<String> q_cahierBom = new HashSet<String>();
		Set<String> q_objectDependencies = new HashSet<String>();
		List<Drawing> q_drawings = new ArrayList<Drawing>();

		Set<WorkcenterPart> cahierParts = cahier.getCahierParts();
		Set<CahierDrawing> cahierDrawings = cahier.getDrawings();

		//addPropertiesFromCahierParts(q_cahierBom, q_objectDependencies, q_drawings, cahierParts);

		//addCreatedDrawings(q_drawings, cahierDrawings);

		cahierSuggestionData.setBomNo((q_cahierBom != null && !q_cahierBom.isEmpty())
				? (q_cahierBom.toArray(new String[q_cahierBom.size()]))
				: new String[] { ""/*
									 * "100103605", "100103610", "100103675",
									 * "100103676", "100103677", "100103678",
									 * "100103679"
									 */ });
		if (q_drawings != null && !q_drawings.isEmpty()) {
			Drawing[] requestDrawings = new Drawing[q_drawings.size()];
			q_drawings.toArray(requestDrawings);
			cahierSuggestionData.setDrawing(requestDrawings);
		} else {
			// Drawing dw = new Drawing();

			// dw.setDocumentNo("2606198292");
			// dw.setVersion("D");
			cahierSuggestionData.setDrawing(new Drawing[] { new Drawing() });
		}
		if (q_objectDependencies != null && !q_objectDependencies.isEmpty()) {
			String[] requestDependencies = new String[q_objectDependencies.size()];
			q_drawings.toArray(requestDependencies);
			cahierSuggestionData.setDependencyName(requestDependencies);
		}

		cahierSuggestionData.setWorkCenter(cahier.getWorkcenter().getWcNumber());

		return cahierSuggestionData;
	}

	/*private static void addCreatedDrawings(List<Drawing> drawings, Set<CahierDrawing> cahierDrawings) {
		if (cahierDrawings != null && !cahierDrawings.isEmpty()) {
			for (CahierDrawing cahierDrawing : cahierDrawings) {
				if (!HelperClass.isNullOrBlankOrInvalid(cahierDrawing.getNumber())) {
					Drawing dw = new Drawing();
					dw.setDocumentNo(cahierDrawing.getNumber().trim());
					if (!HelperClass.isNullOrBlankOrInvalid(cahierDrawing.getRevision())) {
						dw.setVersion(cahierDrawing.getRevision().trim());
					}
					drawings.add(dw);
				}
			}
		}
	}

	private static void addPropertiesFromCahierParts(Set<String> cahierBom, Set<String> objectDependencies,
			List<Drawing> drawings, Set<WorkcenterPart> cahierParts) {
		Set<String> processedDrawings = new HashSet<String>();
		if (cahierParts != null && !cahierParts.isEmpty()) {
			for (WorkcenterPart part : cahierParts) {
				cahierBom.add(!HelperClass.isNullOrBlankOrInvalid(part.getMaterialNo()) ? part.getMaterialNo()
						: part.getNumber());

				WorkcenterPart parent = part.getParent();

				if (parent != null && !HelperClass.isNullOrBlankOrInvalid(parent.getDrawing()) && !processedDrawings
						.contains(parent.getDrawing() + (parent.getRevision() != null ? parent.getRevision() : ""))) {
					processedDrawings
							.add(parent.getDrawing() + (parent.getRevision() != null ? parent.getRevision() : ""));

					Drawing dw = new Drawing();
					dw.setDocumentNo(parent.getDrawing().trim());
					if (!HelperClass.isNullOrBlankOrInvalid(parent.getRevision())) {
						dw.setVersion(parent.getRevision().trim());
					}
					drawings.add(dw);
				}

				if (!HelperClass.isNullOrBlankOrInvalid(part.getString())) {
					objectDependencies.add(part.getString().trim());
				}
			}
		}
	}*/
}
