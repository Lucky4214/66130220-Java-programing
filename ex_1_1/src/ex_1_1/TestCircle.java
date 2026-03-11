package ex_1_1;

public class TestCircle {  
	   public static void main(String[] args) {
	      circle c1 = new circle();
	      System.out.println("The circle has radius of " 
	         + c1.getRadius() + " and area of " + c1.getArea());
	      circle c2 = new circle(2.0);
	      System.out.println("The circle has radius of " 
	         + c2.getRadius() + " and area of " + c2.getArea());
	   }
	}