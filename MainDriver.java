import java.util.Scanner;

public class MainDriver {

	public static void main(String[] args) {

		VowelCounter counter = new VowelCounter();
		Scanner userInput = new Scanner(System.in);

		System.out.println("Enter a line of characters (press enter by its self to quit): ");
		String str = userInput.nextLine();
		counter.processLine(str);

		while (str != "") {
			counter.printSummary();
			break;
		}
	}

}
