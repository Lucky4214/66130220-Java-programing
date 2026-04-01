package Bao_TN;

import java.util.Scanner;

public class run {

	public static void main(String[] args) {
		//Tạo mới 2 học sinh, hard code dữ liệu 
		HocSinh hs1 = new HocSinh();
		String tenHS1 = "Trần Ngọc Bảo";
		hs1.setTenHS(tenHS1);
		short tuoiHS1=10;
		hs1.setTuoiHS(tuoiHS1);
		String lopHS1 = "9A";
		hs1.setLopHS(lopHS1);
		
		HocSinh hs2 = new HocSinh("Trần Ngọc B", (short)17, "12A2");
		//in ra màn hình
		System.out.print(hs1.toString());
		System.out.println("\nTên học sinh 2 là:" + hs2.getTenHS());
		System.out.print("Tuổi học sinh 2 là:" + hs2.getTuoiHS());
		System.out.println("\nLớp của học sinh 2 là:" + hs2.getLopHS());
		
		//=========Nhập dữ liệu từ bàn phím
		Scanner banPhim = new Scanner(System.in);
		//Nhập dữ liệu cho học sinh thứu 3
		HocSinh hs3 = new HocSinh();
		//hỏi user nhập thông tin
		System.out.print("Nhập tên của học sinh thứ 3:");
		String tenHS3=banPhim.nextLine();
		//gói vào biến hs3
		hs3.setTenHS(tenHS3);
		
		System.out.print("Nhập tuổi của học sinh thứ 3:");
		Short tuoiHS3=banPhim.nextShort();
		//gói vào biến hs3
		hs3.setTuoiHS(tuoiHS3);
		
		System.out.print("Nhập lớp của học sinh thứ 3:");
		String lopHS3=banPhim.nextLine();
		//gói vào biến hs3
		hs3.setLopHS(lopHS3);
		// in ra màn hình
		System.out.print(hs3.toString());
	}

}
