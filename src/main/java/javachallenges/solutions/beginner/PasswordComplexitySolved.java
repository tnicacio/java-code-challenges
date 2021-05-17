package javachallenges.solutions.beginner;

public class PasswordComplexitySolved {

	public static boolean isPasswordComplex(String password) {
		//return solutionWithBuilInMethods(password);
        return password.length() >= 6 &&
                password.matches(".*\\d.*") &&
                password.matches(".*[a-z].*") &&
                password.matches(".*[A-Z].*");
	}
	
	public static boolean solutionWithBuilInMethods(String password) {

		int passwordLength = password.length();
		if (passwordLength < 6) {
			return false;
		}

		boolean hasLowercaseLetter = false;
		boolean hasUppercaseLetter = false;
		boolean hasNumber = false;


		for (int i = 0; i < passwordLength || 
				(!hasLowercaseLetter
						&& !hasUppercaseLetter
						&& !hasNumber); i++) {

			char current = password.charAt(i);

			if (Character.isDigit(current)) {
				hasNumber = true;
			} else if (Character.isUpperCase(current)) {
				hasUppercaseLetter = true;
			} else if (Character.isLowerCase(current)) {
				hasLowercaseLetter = true;
			}
		}

		return hasNumber && hasUppercaseLetter && hasLowercaseLetter;
	}
}
