package com.bombardier.macs;

import java.util.Collections;
import java.util.Map;
import java.util.stream.Stream;

import com.bombardier.macs.config.MacsProperties;
import com.bombardier.macs.util.HelperClass;

public class Constants {

	public static final MacsProperties macsProperties = new MacsProperties();
	public static final String DOT = ".";
	public static final String DASH = "-";
	public static final String TYPE_DASH = "DASH";
	public static final String TYPE_METHOD = "METHOD";
	public static final String TYPE_PHANTOM = "PHANTOM";
	public static final String TYPE_KIT = "KIT";
	public static final String TYPE_PAM = "PAM";

	public static final String WORKCENTER_ACTIVE = "T";
	public static final String WORKCENTER_INACTIVE = "F";

	// TODO move cache time limit to external source
	public static final String WORKSPACE_CACHE_KEY = "macs.cache.key.workspace";
	public static final long WORKSPACE_MAX_CACHE_TIME = 1000 * 60 * 60 * 48; // Refresh
																				// workspace
																				// data
																				// from
																				// SAP
																				// every
																				// 48h
	public static final String WORKCENTER_CACHE_KEY_TEMPLATE = "macs.cache.key.workcenters-{0}-{1}-{2}";
	public static final long WORKCENTER_MAX_CACHE_TIME = 1000 * 60 * 60 * 4; // Refresh
																				// workcenter
																				// data
																				// from
																				// SAP
																				// every
																				// 4h
	public static final String PARTS_CACHE_KEY_TEMPLATE = "macs.cache.key.parts|_|{0}|_|{1}|_|{2}";
	public static final String PARTS_CACHE_KEY_REGEX = "macs\\.cache\\.key\\.parts\\|_\\|(.*?)\\|_\\|(.*?)\\|_\\|(.*)";
	public static final long PARTS_MAX_CACHE_TIME = 1000 * 60 * 60 * 4; // Refresh
																		// part
																		// data
																		// from
																		// SAP
																		// every
																		// 4h

	public static final String SUMME_INVALID_DATA = "SUMME";
	public static final String POUND_INVALID_DATA = "#";

	// Variables for query_view filters
	public static final String PARAM_VAR_SIGN = "VAR_SIGN";
	public static final String PARAM_VAR_SIGN_VALUE = "I";
	public static final String PARAM_VAR_NAME = "VAR_NAME";
	public static final String PARAM_VAR_OPERATOR = "VAR_OPERATOR";
	public static final String OPERATOR_EQ = "EQ";
	public static final String PARAM_VAR_VALUE_LOW_EXT = "VAR_VALUE_LOW_EXT";

	public static final String PART_MACSCONF_IN_CAHIER_RELEASED_TO_SAP = "PART_MACSCONF_IN_CAHIER_RELEASED_TO_SAP";
	public static final String PART_MACSCONF_IN_CAHIER_NOT_RELEASED_TO_SAP = "PART_MACSCONF_IN_CAHIER_NOT_RELEASED_TO_SAP";
	public static final String PART_MACSCONF_REPLACED = "PART_MACSCONF_REPLACED";
	public static final String PART_MACSCONF_NOTFOUND = "PART_MACSCONF_NOTFOUND";
	public static final String PART_MACSCONF_NOT_FULLY_CONSUMED = "PART_MACSCONF_NOT_FULLY_CONSUMED";

	public static final String DRAWING_MACSCONF_MATCH_EBOM = "DRAWING_MACSCONF_MATCH_EBOM";
	public static final String DRAWING_MACSCONF_NOMATCH_EBOM = "DRAWING_MACSCONF_NOMATCH_EBOM";
	public static final String DRAWING_MACSCONF_NOTFOUND = "DRAWING_MACSCONF_NOTFOUND";
	public static final String DRAWING_WIP_MATCH_EBOM = "DRAWING_WIP_MATCH_EBOM";
	public static final String DRAWING_WIP_NOMATCH_EBOM = "DRAWING_WIP_NOMATCH_EBOM";

	public static final String DRAWING_VERSION_MACSCONF_MATCH_EBOM = "DRAWING_VERSION_MACSCONF_MATCH_EBOM";
	public static final String DRAWING_VERSION_MACSCONF_NOMATCH_EBOM = "DRAWING_VERSION_MACSCONF_NOMATCH_EBOM";
	public static final String DRAWING_VERSION_MACSCONF_NOT_FOUND = "DRAWING_VERSION_MACSCONF_NOT_FOUND";
	public static final String DRAWING_VERSION_WIP_MATCH_EBOM = "DRAWING_VERSION_WIP_MATCH_EBOM";
	public static final String DRAWING_VERSION_WIP_NOMATCH_EBOM = "DRAWING_VERSION_WIP_NOMATCH_EBOM";

	public static final String PART_WIP_FULLY_CONSUMED = "TOBEASSIGNED";
	public static final String PART_WIP_NOT_FULLY_CONSUMED = "NOTASSIGNED";
	public static final String PART_WIP_IN_CAHIER_RELEASED_TO_SAP = "ASSIGNED";
	public static final String PART_WIP_IN_CAHIER_NOT_RELEASED_TO_SAP = "PARTIALLY_ASSIGNED";
	public static final String PART_WIP_REPLACED = "REPLACED";

	public static final String DRAWING_WIP_FULLY_CONSUMED = "TOBEASSIGNED";
	public static final String DRAWING_WIP_NOT_FULLY_CONSUMED = "NOTASSIGNED";
	public static final String DRAWING_WIP_RELEASED_TO_SAP = "ASSIGNED";

	public static final String REVISION_WIP_FULLY_CONSUMED = "TOBEASSIGNED";
	public static final String REVISION_WIP_NOT_FULLY_CONSUMED = "NOTASSIGNED";
	public static final String REVISION_WIP_RELEASED_TO_SAP = "ASSIGNED";

	public static final String CAHIER_CONFIRMATION_SUCCESS_STATUS = "S";
	public static final String CAHIER_MINIMUM_CHECK_SUCCESS_STATUS = "S";
	public static final String CAHIER_SUGGESTION_SUCCESS_STATUS = "S";
	public static final String CAHIER_SUGGESTION_BOM_DEFAULT_VALUE = "";
	public static final int CAHIER_SEQUENCE_NUMBER_MIN_LENGTH = 4;
	public static final char CAHIER_SEQUENCE_NUMBER_PADDING_CHAR = '0';
	public static final int PI_PART_DEFAULT_QUANTITY = 1;
	public static final int PI_PART_DEFAULT_QUANTITY_IF_FULLY_CONSUMED = 0;
	public static final CharSequence PI_ERROR_NO_APPLICABLE_DATA = "NO_APPLICABLE_DATA";

	public static final String DRAWING_AND_REVISION_REGEX = "^(.+?)\\[(.*?)\\]$";

	public enum MinimumCheckType {
		BOM, DEPENDENCY, ROUTING
	}

	public static Map<String, String> partStatusPiToWipMap() {
		return Collections.unmodifiableMap(Stream
				.of(HelperClass.entry(SUMME_INVALID_DATA, SUMME_INVALID_DATA),
						HelperClass.entry(POUND_INVALID_DATA, PART_WIP_NOT_FULLY_CONSUMED),
						HelperClass.entry(PART_MACSCONF_NOTFOUND, PART_WIP_NOT_FULLY_CONSUMED),
						HelperClass.entry(PART_MACSCONF_NOT_FULLY_CONSUMED, PART_WIP_NOT_FULLY_CONSUMED),
						HelperClass.entry(PART_MACSCONF_IN_CAHIER_RELEASED_TO_SAP, PART_WIP_IN_CAHIER_RELEASED_TO_SAP),
						HelperClass.entry(PART_MACSCONF_IN_CAHIER_NOT_RELEASED_TO_SAP,
								PART_WIP_IN_CAHIER_NOT_RELEASED_TO_SAP),
						HelperClass.entry(PART_MACSCONF_REPLACED, PART_WIP_REPLACED),
						HelperClass.entry(DRAWING_MACSCONF_MATCH_EBOM, DRAWING_WIP_RELEASED_TO_SAP),
						HelperClass.entry(DRAWING_MACSCONF_NOMATCH_EBOM, DRAWING_WIP_NOT_FULLY_CONSUMED),
						HelperClass.entry(DRAWING_MACSCONF_NOTFOUND, DRAWING_WIP_NOT_FULLY_CONSUMED),
						HelperClass.entry(DRAWING_VERSION_MACSCONF_MATCH_EBOM, REVISION_WIP_RELEASED_TO_SAP),
						HelperClass.entry(DRAWING_VERSION_MACSCONF_NOMATCH_EBOM, REVISION_WIP_NOT_FULLY_CONSUMED),
						HelperClass.entry(DRAWING_VERSION_MACSCONF_NOT_FOUND, REVISION_WIP_NOT_FULLY_CONSUMED))
				.collect(HelperClass.entriesToMap()));
	}

}
