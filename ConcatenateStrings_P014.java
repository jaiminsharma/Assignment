package Assignment;

import java.util.Scanner;

public class ConcatenateStrings_P014 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        String addition = str1 + str2;
        System.out.println("Concatenated string: " + addition);


	}

}
