package thigk2_TranNgocBao;

public class runSanPham {

	public static void main(String[] args) {
		SanPham sp1 = new SanPham("SAUTMA", "DẦU GỘI", "SỮA TẮM", 590.000);
		SanPham sp2 = new SanPham("NUANA", "DẦU ĂN", "THỰC PHẨM", 45.000);
		SanPham sp3 = new SanPham("THCUO", "DẦU GIÓ", "THUỐC", 100.000);
		System.out.print("Thông tin sản phẩm thứ nhất là\n");
		System.out.print(sp1.toString());
		System.out.print("\nThông tin sản phẩm thứ hai là\n");
		System.out.print(sp2.toString());
		System.out.print("\nThông tin sản phẩm thứ ba là\n");
		System.out.print(sp3.toString());
}
}
