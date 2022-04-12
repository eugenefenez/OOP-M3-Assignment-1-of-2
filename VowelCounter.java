import java.util.Arrays;

public class VowelCounter {

	char[] vowels = { 'A', 'E', 'I', 'O', 'U' };
	int[][] count = new int[vowels.length][2];

	public boolean doTheyMatch(char c1, char c2) {
		if (c1 == c2)
			return true;
		else
			return false;
	}

	public void processLine(String str) {

		char[] charArr = str.toCharArray();

		for (int i = 0; i < charArr.length; ++i) {
			for (int j = 0; j < vowels.length; ++j) {

				char capitalChar = Character.toUpperCase(charArr[i]);

				boolean isMatch = this.doTheyMatch(capitalChar, vowels[j]);

				if (isMatch) {
					if (Character.isUpperCase(charArr[i])) {

						count[j][1]++;

					} else {
						count[j][0]++;

					}
				} // end is match
			} // end for
		} // end for
	} // end method

	public void printSummary() {

		for (int i = 0; i < count.length; ++i) {
			System.out.print(vowels[i]);
			System.out.print(": ");
			System.out.print(count[i][0] + " lowercase, ");
			System.out.print(count[i][1] + " Uppercase, ");
			System.out.println(count[i][0] + count[i][1] + " total");

		} // end for

	} // end method

}// end class
