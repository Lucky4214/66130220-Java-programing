package thigk2_TranNgocBao;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
public class bai_3 {
	// đọc file
		public static ArrayList<Double> docFile(String tenFile) {
			ArrayList<Double> ds = new ArrayList<>();
			//đặt trong try catch để kiểm tra
			try {
				BufferedReader br = new BufferedReader(new FileReader("Data.txt"));
				String line;
				while ((line = br.readLine()) != null) {
					ds.add(Double.parseDouble(line));
				}
				br.close();
			} catch (Exception e) {
				System.out.println("Lỗi đọc file: " + e.getMessage());
			}
			return ds;
		}
		// in danh sách
		public static void inDanhSach(ArrayList<Double> ds) {
			System.out.println("\nDANH SÁCH SỐ");
			for (Double x : ds) {
				System.out.println(x);
			}
		}
		// kiểm tra X có tồn tại không
		public static void kiemTraX(ArrayList<Double> ds, double x) {
			if (ds.contains(x)) {
				System.out.println("\nX = " + x + " CÓ trong danh sách");
			} else {
				System.out.println("\nX = " + x + " KHÔNG có trong danh sách");
			}
		}
		// main
		public static void main(String[] args) {
			ArrayList<Double> ds = docFile("data.txt");
			inDanhSach(ds);
			Scanner sc = new Scanner(System.in);
			System.out.print("\nNhập X (ngày sinh): ");
			double x = sc.nextDouble();
			kiemTraX(ds, x);
			sc.close();
		}
}
