package review_basic;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten san pham:");
		String Ten = sc.nextLine();
		System.out.print("Nhap gia san pham:");
		Double Gia = Double.parseDouble(sc.nextLine());
		System.out.print("Nhap so luong san pham:");
		Integer SoLuong = Integer.parseInt(sc.nextLine());
		product sp1 = new product(Ten, Gia, SoLuong );
		System.out.println("Thong tin san pham la:" + sp1);
	}

}
