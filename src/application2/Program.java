package application2;

import java.util.Locale;
import java.util.Scanner;
import entities2.Students;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Students std = new Students();
		
		std.name = sc.nextLine();
		std.grade1 = sc.nextDouble();
		std.grade2 = sc.nextDouble();
		std.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL NOTE = %.2f%n",std.finalNote());
		
		if (std.finalNote()<60.00) {
			System.out.println("FAILED");
			System.out.println("MISSING = "+std.missingNote());
		}
		else {
			System.out.println("PASS");
		}
		
		
		
		
		
		sc.close();
	}

}
