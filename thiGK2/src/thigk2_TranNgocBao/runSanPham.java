package thigk2_TranNgocBao;
import java.util.ArrayList;
import java.util.Scanner;
public class runSanPham {
	// tạo danh sách và nhập từ bàn phím
	public static ArrayList<SanPham> taoDanhSachSanPham() {
		Scanner sc = new Scanner(System.in);
	//	ArrayList<SanPham> ds = new ArrayList<>();
		//hard-code 3 sản phẩm và in ra màn hình
			ArrayList<SanPham> ds = new ArrayList<>();
			SanPham sp1 = new SanPham("SP01", "Dầu gội", "Mỹ phẩm", 590000.0);
			SanPham sp2 = new SanPham("SP02", "Omega 3", "Thực phẩm chức năng", 120000.0);
			SanPham sp3 = new SanPham("SP03", "Dầu ăn", "Thực phẩm", 45000.0);
			ds.add(sp1);
			ds.add(sp2);
			ds.add(sp3);
			return ds;
	}
		//nhap số lượng sản phẩm từ bàn phím
		public static ArrayList<SanPham> nhapDanhSachSanPham() {
			Scanner sc = new Scanner(System.in);
			ArrayList<SanPham> ds = new ArrayList<>();
			System.out.print("Nhập số lượng sản phẩm: ");
			int n = Integer.parseInt(sc.nextLine());
			for (int i = 0; i < n; i++) {
				System.out.println("\n--- Nhập sản phẩm thứ " + (i + 1) + " ---");
				System.out.print("Mã sản phẩm: ");
				String ma = sc.nextLine();
				System.out.print("Tên sản phẩm: ");
				String ten = sc.nextLine();
				System.out.print("Loại sản phẩm: ");
				String loai = sc.nextLine();
				System.out.print("Giá sản phẩm: ");
				Double gia = Double.parseDouble(sc.nextLine());
				SanPham sp = new SanPham(ma, ten, loai, gia);
				ds.add(sp);
			}
			return ds;
		}
	//hàm phân loại thực phẩm chức năg
	public static void inThucPhamChucNang(ArrayList<SanPham> ds) {
		System.out.println("\nSẢN PHẨM THỰC PHẨM CHỨC NĂNG");
		for (SanPham sp : ds) {
			if (sp.getLoaiSanPham().equalsIgnoreCase("THỰC PHẨM CHỨC NĂNG")) {
				System.out.println(sp);
			}
		}
	}
	//chạy main
	public static void main(String[] args) {
			// danh sách có sẵn
			ArrayList<SanPham> dsSanPham = taoDanhSachSanPham();
			// nhập thêm từbàn phím
			ArrayList<SanPham> dsNhapThem = nhapDanhSachSanPham();
			// gộp lại
			dsSanPham.addAll(dsNhapThem);
			// in ds
			System.out.println("\n= DANH SÁCH SẢN PHẨM =");
			for (SanPham sp : dsSanPham) {
				System.out.println(sp);
			}
			// lọc thực phẩm chức năng
			inThucPhamChucNang(dsSanPham);
		}
	}
