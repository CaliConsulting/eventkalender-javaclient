import cronus.cali.SerializableKeyValuePairOfStringString;

public class Oklar {


public static String getData(SerializableKeyValuePairOfStringString[][] jdata) {
	String output = "";
	for (int i = 0; i < jdata.length; i++) {
		SerializableKeyValuePairOfStringString[] s = jdata[i];
		for (int k = 0; k < s.length; k++) {
			SerializableKeyValuePairOfStringString s1 = s[k];
			if ( 1==1) {
				s1.getKey();
			output += System.lineSeparator();
			output += "- " + s1.getValue();
		}
	 }
	}

	return output;
}
}