package Bao_TN;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class runMain {

	public static void main(String[] args) {
		//Khai báo biến danh sách chứa các số nguyên
		ArrayList<Integer> dsSoNguyen = new ArrayList<Integer>();
		//Nhap 10 phần tử 
		Scanner banPhim = new Scanner(System.in);
		for(int i=0;i<10;i++) {
		//Nhập 1 phần tử
			//in ra một hướng dẫn cho ng dùng
//		System.out.print("Moi nhap phan tử thứ:" + i + ":");
		System.out.print("a[" + i + "]=");
			//cho ng dùng nhập, cất vào biến tạm
		Integer tam = banPhim.nextInt();
			//Thêm vào cuối danh sách
		dsSoNguyen.add(tam); 
	}
		//in ra màn hình danh sách 
		System.out.println("Danh sách là:");
//		for (int i=0;i<dsSoNguyen.size();i++) {
//			//Lấy ra phần tử thứ i, cất vào biến tạm
//			Integer tam = dsSoNguyen.get(i);
//			System.out.print(tam+" ");
//		}
		for(Integer x: dsSoNguyen) {
			System.out.print(x+" ");
		}
		//đếm số phần tử chẵn
		int soLuongPTchan = 0;
		for(Integer x: dsSoNguyen) {
			if(x%2==0) soLuongPTchan =soLuongPTchan+1;
		}
		System.out.print("Số lượng phần tử chẵn là:" + soLuongPTchan);
		//tính tổng các phần tử
		int TongAll=0;
		for(Integer x: dsSoNguyen) {
			TongAll = TongAll +x;
		}
		System.out.print("\nTổng tất cả phần tử là:" + TongAll);

	}
}
