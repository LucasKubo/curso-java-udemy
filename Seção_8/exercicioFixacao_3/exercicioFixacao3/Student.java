package exercicioFixacao3;

public class Student {
	private String name;
	private double grade1, grade2, grade3;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setGrade1(double grade1) {
		this.grade1 = (grade1 > 0 && grade1 <= 30)?  grade1 : -1;
	}
	public void setGrade2(double grade2) {
		this.grade2 = (grade2 > 0 && grade2 <= 35)?  grade2 : -1;
	}
	public void setGrade3(double grade3) {
		this.grade3 = (grade3 > 0 && grade3 <= 35)?  grade3 : -1;
	}
	
	public String getName() {
		return name;
	}
	public double getGrade1() {
		return grade1;
	}
	public double getGrade2() {
		return grade2;
	}
	public double getGrade3() {
		return grade3;
	}
	public double finalGrade() {
		return grade1+grade2+grade3;
	}
	
	public String situation() {
		if (finalGrade() >= 60) {
			return "PASS";
		}
		return "FAILED\n" + "MISSING " + String.format("%.2f", (60 - finalGrade())) + " POINTS";
	}
	
	public String toString() {
		return "FINAL GRADE = " + String.format("%.2f", finalGrade()) + "\n" + situation();
	}
}
