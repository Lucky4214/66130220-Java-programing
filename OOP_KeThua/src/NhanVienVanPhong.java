
public class NhanVienVanPhong extends NhanVien{
	private double soGioLamThem;
	private double luongThemMoiGio;
	// Hàm tạo
	public NhanVienVanPhong(String maNV, String hoTen, double luongCoBan, double soGioLamThem, double luongThemMoiGio) {
		super(maNV, hoTen, luongCoBan);
		this.soGioLamThem = soGioLamThem;
		this.luongThemMoiGio = luongThemMoiGio;
	}
	//Các phương thức khác
	@Override
	public double tinhLuong() {
		return super.getLuongCoBan() + soGioLamThem * luongThemMoiGio;
	}
	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Số giờ làm thêm:" + soGioLamThem);
		System.out.print("Lương mỗi giờ:" + luongThemMoiGio);
		System.out.print("\nLương được nhận là:" + tinhLuong());
		
	}
	@Override
	public String toString() {
		String chuoiXuat = super.toString();
		chuoiXuat = chuoiXuat + "Số giờ làm thêm: " + this.soGioLamThem;
		chuoiXuat = chuoiXuat + "\nLương mỗi giờ:" + this.luongThemMoiGio;
		chuoiXuat = chuoiXuat + "\nLương được nhận là: " + this.tinhLuong();
		return chuoiXuat;
		//return "NhanVien [maNV=" + maNV + ", hoTen=" + hoTen + ", luongCoBan=" + luongCoBan + "]";
		
	}
	
	//Getter/setter
}
