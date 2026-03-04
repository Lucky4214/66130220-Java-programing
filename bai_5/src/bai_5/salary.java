package bai_5;
import java.util.Scanner;
public class salary {
	public static void main(String[] args) {
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
			double  total = hlam * luong;
			System.out.println("tiền lương ko tang ca: " + total);

		}
	}
}


