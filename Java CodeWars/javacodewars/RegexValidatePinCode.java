package javacodewars;

public class RegexValidatePinCode {
	public static void main(String[] args) {
		System.out.println(validatePin("000000"));
	}
	
	public static boolean validatePin(String pin) {
		/*
		 * \d searches for all digit character [0-9] and returns true
		 * \d{4} on a length of 4 digits e.g: 1234 -> returns true
		 * same with {6}
		 * | is or
		 */
		return pin.matches("\\d{4}|\\d{6}");
	
	}
}
