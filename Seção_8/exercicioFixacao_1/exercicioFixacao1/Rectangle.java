package exercicioFixacao1;

public class Rectangle {
	private double width;
	private double height;
	
	public Rectangle() {}
	
	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double area(){
		return width * height;
	}
	
	public double perimeter() {
		return 2*(width+height);
	}
	
	public double diagonal() {
		return Math.sqrt((Math.pow(height, 2) + Math.pow(width, 2)));
	}
	
	public String toString() {
		return "AREA = " + String.format("%.2f", area())+ "\n" +
				"PERIMETER = " + String.format("%.2f", perimeter())+ "\n" +
				"DIAGONAL = " + String.format("%.2f", diagonal());
 	}
}
