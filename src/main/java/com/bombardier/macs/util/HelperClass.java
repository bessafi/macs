package com.bombardier.macs.util;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.bombardier.macs.Constants;
import com.bombardier.sap.client.queryview.__QueryViewData_Parameter_Item;

public class HelperClass {

	public static <K, V> Map.Entry<K, V> entry(K key, V value) {
		return new AbstractMap.SimpleEntry<>(key, value);
	}

	public static <K, U> Collector<Map.Entry<K, U>, ?, Map<K, U>> entriesToMap() {
		return Collectors.toMap((e) -> e.getKey(), (e) -> e.getValue());
	}

	public static <K, U> Collector<Map.Entry<K, U>, ?, ConcurrentMap<K, U>> entriesToConcurrentMap() {
		return Collectors.toConcurrentMap((e) -> e.getKey(), (e) -> e.getValue());
	}

	public static int TryParseInt(String value) {
		int parsedValue;
		try {
			parsedValue = Integer.parseInt(value);
		} catch (NumberFormatException e) {
			parsedValue = -1;
		}
		return parsedValue;
	}

	public static boolean isNullOrBlankOrInvalid(String str) {
		return str == null || str.trim().isEmpty() || str.trim().equals(Constants.POUND_INVALID_DATA);
	}

	public static String nullifyIfInvalid(String str) {
		return isNullOrBlankOrInvalid(str) ? null : str.trim();
	}

	public static String nullifyIfInvalidTrimStart(String str, String trimValue) {
		return isNullOrBlankOrInvalid(str) ? null : str.trim().replaceAll("^" + trimValue + "+", "");
	}

	public static String leftPad(String str, int minSize, char paddingChar) {
		StringBuilder sb = new StringBuilder(str);
		while (sb.length() < minSize) {
			sb.insert(0, paddingChar);
		}
		return sb.toString();
	}

	public static String buildInternalPartId(String projectId, String externalPartId) {
		return projectId + "." + externalPartId;
	}

	/**
	 * Each filter that needs to be applied need to have four parameters in the
	 * XML. A parameter with name VAR_SIGN that is always set to "I". A
	 * parameter named VAR_OPERATOR that is always set to "EQ". A parameter
	 * named VAR_NAME for which the value is our filter name A parameter named
	 * VAR_VALUE_LOW_EXT for which the value is our filter value. If those
	 * parameters need to be repeated we need to add a suffix to each parameter
	 * name: VAR_SIGN_1 and VAR_OPERATOR_1
	 * 
	 * @param index
	 * @param filterName
	 * @param filterValue
	 * @return
	 */
	public static List<__QueryViewData_Parameter_Item> createQueryViewFilter(int index, String filterName,
			String filterValue) {
		List<__QueryViewData_Parameter_Item> parameters = new ArrayList<__QueryViewData_Parameter_Item>();
		String strIndex = (index > 0 ? "_" + index : "");

		__QueryViewData_Parameter_Item param0 = new __QueryViewData_Parameter_Item();
		param0.setName(Constants.PARAM_VAR_SIGN + strIndex);
		param0.setValue(Constants.PARAM_VAR_SIGN_VALUE);
		parameters.add(param0);

		__QueryViewData_Parameter_Item param1 = new __QueryViewData_Parameter_Item();
		param1 = new __QueryViewData_Parameter_Item();
		param1.setName(Constants.PARAM_VAR_OPERATOR + strIndex);
		param1.setValue(Constants.OPERATOR_EQ);
		parameters.add(param1);

		__QueryViewData_Parameter_Item param2 = new __QueryViewData_Parameter_Item();
		param2 = new __QueryViewData_Parameter_Item();
		param2.setName(Constants.PARAM_VAR_NAME + strIndex);
		param2.setValue(filterName);
		parameters.add(param2);

		__QueryViewData_Parameter_Item param3 = new __QueryViewData_Parameter_Item();
		param3 = new __QueryViewData_Parameter_Item();
		param3.setName(Constants.PARAM_VAR_VALUE_LOW_EXT + strIndex);
		param3.setValue(filterValue);
		parameters.add(param3);

		return parameters;
	}

}
