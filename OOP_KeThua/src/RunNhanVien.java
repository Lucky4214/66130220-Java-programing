
public class RunNhanVien {
	public static void main (String[] args) {
		NhanVien nv1 = new NhanVien("001","Trần Ngọc Bảo", 5000);
	//	nv1.hienThiThongTin();
		//System.out.println(nv1.toString());
		
		NhanVienVanPhong nvVanPhong1 = new NhanVienVanPhong("002","Trần Ngọc Bảo",500000,4,200000);
		System.out.print(nvVanPhong1.toString());
		//nvVanPhong1.hienThiThongTin();
	
		
	}
}
