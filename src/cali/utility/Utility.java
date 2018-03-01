package cali.utility;

import cronus.cali.SerializableKeyValuePairOfStringString;

public class Utility {

	public static boolean isStringInt(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException ex) {
			return false;
		}
	}

	public static String[][] getData(SerializableKeyValuePairOfStringString[] data) {
		return getData(new SerializableKeyValuePairOfStringString[][] { data });
	}

	public static String[][] getData(SerializableKeyValuePairOfStringString[][] data) {
		// Invalid data; return null immediately
		if (data == null || data[0] == null || data[0][0] == null) {
			return null;
		}

		String[] headers = new String[data[0].length];
		for (int i = 0; i < headers.length; i++) {
			headers[i] = data[0][i].getKey();
		}

		String[][] arr = dataToArray(data);
		String[][] newArr = new String[arr.length + 1][arr[0].length];

		for (int i = 1; i < newArr.length; i++) {
			newArr[i] = arr[i - 1];
		}
		newArr[0] = headers;

		return newArr;
	}

	public static String[][] dataToArray(SerializableKeyValuePairOfStringString[][] data) {
		// Invalid data; return null immediately
		if (data == null || data[0] == null || data[0][0] == null) {
			return null;
		}

		String[][] arr = new String[data.length][data[0].length];

		for (int i = 0; i < data.length; i++) {
			SerializableKeyValuePairOfStringString[] inner = data[i];
			for (int j = 0; j < inner.length; j++) {
				arr[i][j] = inner[j].getValue();
			}
		}
		return arr;
	}

	public static boolean isSubPart(String[] contents, String s) {
		for (int i = 0; i < contents.length; i++) {
			String content = contents[i];
			if (!content.equals(s) && content.contains(s)) {
				return true;
			}
		}
		return false;
	}

	public static boolean isEmpty(String... values) {
		for (int i = 0; i < values.length; i++) {
			String value = values[i];
			if (value == null || value.equals("")) {
				return true;
			}
		}
		return false;
	}

}
