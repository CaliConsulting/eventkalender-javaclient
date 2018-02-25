package cali.utility;

import java.rmi.RemoteException;

import javax.swing.JTextPane;

public class ExceptionHandler {

	// private static final int CANNOT_INSERT_NULL = 515;
	// private static final int CHECK_CONSTRAINT_CONFLICT = 547;
	// private static final int DATA_TYPE_CONVERSION_ERROR = 8114;
	// private static final int LOGIN_FAILED = 4060;
	// private static final int NON_MATCHING_TABLE_DEFINITION = 213;
	// private static final int PRIMARY_KEY_VIOLATION = 2627;
	// private static final int RAISE_ERROR = 50000;
	// private static final int TRUNCATED_DATA = 8152;
	// private static final int WRONG_CREDENTIALS = 18456;

	public static void getErrorMessage(Exception e, JTextPane pane) {
		String message = getErrorMessage(e);
		if (pane != null) {
			pane.setText(message);
		}
	}

	public static String getErrorMessage(Exception e) {
		String message = "";
		// if (e instanceof SQLException) {
		// message = getSQLErrorMessage((SQLException) e);
		// } else {
		// message = getGenericErrorMessage(e);
		// }

		message = getGenericErrorMessage(e);

		return message;
	}

	// public static String getSQLErrorMessage(SQLException e) {
	// String message = "";
	// switch (e.getErrorCode()) {
	// case CANNOT_INSERT_NULL:
	// message = getCannotInsertNullMapping(e.getMessage());
	// break;
	// case CHECK_CONSTRAINT_CONFLICT:
	// message = getCheckConstraintConflictMapping(e.getMessage());
	// break;
	// case DATA_TYPE_CONVERSION_ERROR:
	// message = getDataTypeConversionErrorMapping(e.getMessage());
	// break;
	// case LOGIN_FAILED:
	// message = "Kunde inte öppna databas; inloggning till databasen misslyckades";
	// break;
	// case NON_MATCHING_TABLE_DEFINITION:
	// message = "Databasen accepterar inte indatan";
	// break;
	// case PRIMARY_KEY_VIOLATION:
	// message = getPrimaryKeyViolationMapping(e.getMessage());
	// break;
	// case RAISE_ERROR:
	// message = e.getMessage();
	// break;
	// case TRUNCATED_DATA:
	// message = "Ett indata-fält överskrider maximala tillåtna längden";
	// break;
	// case WRONG_CREDENTIALS:
	// message = getWrongCredentialsMapping(e.getMessage());
	// break;
	// default:
	// message = e.getMessage();
	// break;
	// }
	// return message;
	// }
	//
	// private static String getCannotInsertNullMapping(String message) {
	// int begin = message.indexOf('\'') + 1;
	// int end = message.indexOf('\'', begin);
	//
	// String offendingColumn = message.substring(begin, end).replaceAll("\\s", "");
	// String translation =
	// Translator.getInstance().getTranslation(offendingColumn);
	//
	// return translation + " kan inte vara tomt, var vänlig ange in ett värde";
	// }
	//
	// private static String getCheckConstraintConflictMapping(String message) {
	// int begin = message.indexOf('"') + 1;
	// int end = message.indexOf('"', begin);
	//
	// String offendingConstraint = message.substring(begin, end).replaceAll("\\s",
	// "");
	//
	// String[] parts = message.split(" ");
	// String lastPart = parts[parts.length - 1];
	// if (offendingConstraint.startsWith("NOT_EMPTY")) {
	// String offendingColumn = lastPart.substring(lastPart.indexOf("'") + 1,
	// lastPart.lastIndexOf("'"));
	// String translation =
	// Translator.getInstance().getTranslation(offendingColumn);
	// return "Fältet för " + translation + " får inte lov att vara tomt";
	// } else {
	// switch (offendingConstraint) {
	// case "STUDIED_STUDENT_FK":
	// return "En student med detta personnummer finns inte";
	// case "STUDIES_STUDENT_FK":
	// return "En student med detta personnummer finns inte";
	// default:
	// return null;
	// }
	// }
	// }
	//
	// private static String getDataTypeConversionErrorMapping(String message) {
	// String[] parts = message.replace(".", "").split(" ");
	// return "Fel vid konvertering av datatyp " + parts[parts.length - 3] + " till
	// " + parts[parts.length - 1];
	// }
	//
	// private static String getPrimaryKeyViolationMapping(String message) {
	// int beginValue = message.indexOf('(') + 1;
	// int endValue = message.indexOf(')', beginValue);
	// String value = message.substring(beginValue, endValue).replaceAll("\\s", "");
	// String[] parts = value.split(",");
	//
	// int beginOffendingKey = message.indexOf('\'') + 1;
	// int endOffendingKey = message.indexOf('\'', beginOffendingKey);
	// String offendingKey = message.substring(beginOffendingKey, endOffendingKey);
	// switch (offendingKey) {
	// case "STUDENT_PK":
	// return "Student med personnummer " + parts[0] + " finns redan";
	// case "STUDIES_PK":
	// return "Student med personnummer " + parts[0] + " läser redan kurs " +
	// parts[1];
	// case "STUDIED_PK":
	// return "Student med personnummer " + parts[0] + " har redan slutfört kurs " +
	// parts[1];
	// case "COURSE_PK":
	// return "Kurs med kurskod " + parts[0] + " finns redan";
	// default:
	// return null;
	// }
	// }
	//
	// private static String getWrongCredentialsMapping(String message) {
	// int begin = message.indexOf('\'') + 1;
	// int end = message.indexOf('\'', begin);
	//
	// String user = message.substring(begin, end);
	//
	// return "Kunde inte logga in i databasen med användaren '" + user + "'";
	// }

	private static String getGenericErrorMessage(Exception e) {
		String message = "";
		if (e instanceof NumberFormatException) {
			message = "Fältet accepterar inte denna indata, var god kontrollera formattering på tal och text";
		} else if (e instanceof NullPointerException) {
			message = "Var god ange värden för alla fält";
		} else if (e instanceof RemoteException) {
			message = "Fel uppstod vid kommunikation med webbtjänsten";
		} else {
			message = e.getMessage();
		}
		return message;
	}

}
