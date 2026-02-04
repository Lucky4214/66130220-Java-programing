
package review;

import java.util.Scanner;

public class review_1 {

	public static void main(String[] args) {
		int a = 5, b = 10;
		double c = 10.5;
		
		int tong = a+b;
		double sothuc = c/a;
		
		System.out.println("tong:" + tong);
		System.out.println("ket qua la:" + sothuc);
		
		double C = 30.5;
		double F = (C*9/5)+32;
		System.out.println("nhiệt độ F là:" + F);
		
		double weight = 51.5;
		double height = 1.6;
		double BMI = weight / (height * height);
		System.out.println("Cân nặng là:" + weight +"kg");
		System.out.println("Chiều cao là:" + height +"m");
		System.out.println("BMI là:" + BMI);
		
		if(BMI < 18.5) {
			System.out.println("thiếu cân");
		}else if(BMI < 20) {
			System.out.println("bình thường");
		}else if(BMI < 30) {
			System.out.println("thừa cân");
		}else {
			System.out.println("béo phì");
		}
		
		System.out.println("nhập số giờ");
		Scanner hour = new Scanner(System.in);
		int hlam = hour.nextInt();
		System.out.println("nhập lương theo số giờ");
		Scanner salary = new Scanner(System.in);
		double luong = salary.nextDouble();
		
		if(hlam>40) {
			int tangca = hlam - 40;
			double total = 40 * luong + tangca*1.5*luong;
			System.out.println("tiền lương khi được tăng ca là:" + total);
		}else {
			double total = hlam * luong;
			System.out.println("tiền lương ko tang ca" + total);
		}
	}

}
