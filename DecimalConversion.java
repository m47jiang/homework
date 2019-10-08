import java.util.Scanner;

public class DecimalConversion {
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int decimal, program;

		System.out.println("Enter a positive integer: ");
		decimal = keyboard.nextInt();

		int counter, remainder;
		String binary = "";
		String hexadecimal = "";
		char[] lastDigit = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

		while (decimal < 0) {
			System.out.println("Enter a positive integer: ");
			decimal = keyboard.nextInt();
		}

		System.out.println("Enter 0 for binary or 1 for hexadecimal ");
		program = keyboard.nextInt();

		if (program == 0) {
				while (decimal > 0) {
		            remainder = decimal % 2;
		            binary = remainder + "" + binary;
		            decimal = decimal / 2;
		    }
		    System.out.println("The binary conversion is: " + binary);
		}
		else if (program == 1) {
				while (decimal >= 16) {
		            remainder = decimal % 16;
		            hexadecimal = remainder + "" + hexadecimal;
		            decimal = decimal / 16;
		    }
		    hexadecimal = hexadecimal + "" + lastDigit[decimal];
		    System.out.println("The hexadecimal conversion is: " + hexadecimal);
		}
		else {
			System.out.println("Enter 0 for binary or 1 for hexadecimal ");
	 		program = keyboard.nextInt();
		}
	}
}