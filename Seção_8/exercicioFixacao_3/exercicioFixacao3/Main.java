package exercicioFixacao3;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		@SuppressWarnings("unused")
		String name;
		double grade1,grade2,grade3;
		Student s1 = new Student();
		
		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.print("Grade 1: ");
		grade1 = sc.nextDouble();
		System.out.print("Grade 2: ");
		grade2 = sc.nextDouble();
		System.out.print("Grade 3: ");
		grade3 = sc.nextDouble();
		
		s1.setGrade1(grade1);
		s1.setGrade2(grade2);
		s1.setGrade3(grade3);
		
		if(s1.getGrade1() != -1 && s1.getGrade2() != -1 && s1.getGrade3() != -1 ) {
			System.out.println(s1);
		}else {
			System.out.println("Error: incorrect value of some grade");
		}
	}

}
