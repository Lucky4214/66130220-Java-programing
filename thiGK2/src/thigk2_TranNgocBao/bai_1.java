package thigk2_TranNgocBao;
import java.util.Scanner;
public class bai_1 {
	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				// nhập tọa độ
				System.out.print("Nhập x1: ");
				int x1 = sc.nextInt();
				System.out.print("Nhập y1: ");
				int y1 = sc.nextInt();
				System.out.print("Nhập x2: ");
				int x2 = sc.nextInt();
				System.out.print("Nhập y2: ");
				int y2 = sc.nextInt();
				// tính chiều dài và rộng
				int dai = Math.abs(x2 - x1);
				int rong = Math.abs(y2 - y1);
				// tính chu vi và diện tích
				int chuVi = 2 * (dai + rong);
				int dienTich = dai * rong;
				// in kết quả
				System.out.println("\nKết quả là");
				System.out.print("Chiều dài: " + dai);
				System.out.print("\nChiều rộng: " + rong);
				System.out.print("\nChu vi: " + chuVi);
				System.out.print("\nDiện tích: " + dienTich);
				sc.close();
			}
	}
