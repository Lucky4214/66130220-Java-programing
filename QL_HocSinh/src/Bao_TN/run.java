package Bao_TN;

import java.util.ArrayList;
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
		
		
		//Nhap danh sach N học sinh
		ArrayList<HocSinh> dsHocSinh= new ArrayList<HocSinh>();
		// nhập N
		int N = 3; 
		for(int i=0;i<N;i++) {
			HocSinh hsi= new HocSinh();
			System.out.print("Nhập tên của học sinh thứ 3:" + i);
			String tenHSi=banPhim.nextLine();
			hsi.setTenHS(tenHSi);
			System.out.print("Nhập tuổi của học sinh thứ 3:" + i);
			Short tuoiHSi=banPhim.nextShort();
			hsi.setTuoiHS(tuoiHSi);
			System.out.print("Nhập lớp của học sinh thứ 3:" + i);
			String lopHSi=banPhim.nextLine();
			hsi.setLopHS(lopHSi);
			
			//đưa vào danh sách
			dsHocSinh.add(hs1);
		}
		//inn ra
		for(int i =0; i<N; i++) {
			System.out.print(dsHocSinh.get(i).toString());
		}
		// bổ sunng thêm
			HocSinh hsThem = new HocSinh();
			Scanner banPhim = new Scanner(System.in);
			//hỏi user nhập thông tin
			System.out.print("Nhập tên của học sinh them:");
			String tenthem=banPhim.nextLine();
			hs3.setTenHS(tenthem);
			
			System.out.print("Nhập tuổi của học sinh thêm:");
			Short tuoithem=banPhim.nextShort();
			hs3.setTuoiHS(tuoithem);
			
			System.out.print("Nhập lớp của học sinh thêm:");
			String lopthem=banPhim.nextLine();
			hs3.setLopHS(lopthem);
			//thêm vào danh sách
			dsHocSinh.add(hsThem) ;
			
			//inn ra
			for(int i =0; i<N; i++) {
				System.out.print(dsHocSinh.get(i).toString());
			}
			
	}

}
