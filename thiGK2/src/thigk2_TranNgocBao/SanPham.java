package thigk2_TranNgocBao;

public class SanPham {
	private String maSanPham;
	private String tenSanPham;
	private String loaiSanPham;
	private Double giaSanPham;
	//getter/setter
	public String getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(String maSanPham) {
		this.maSanPham = maSanPham;
	}
	public String getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	public String getLoaiSanPham() {
		return loaiSanPham;
	}
	public void setLoaiSanPham(String loaiSanPham) {
		this.loaiSanPham = loaiSanPham;
	}
	public Double getGiaSanPham() {
		return giaSanPham;
	}
	public void setGiaSanPham(Double giaSanPham) {
		this.giaSanPham = giaSanPham;
	}
	//constructor
	public SanPham(String maSanPham, String tenSanPham, String loaiSanPham, Double giaSanPham) {
		super();
		this.maSanPham = maSanPham;
		this.tenSanPham = tenSanPham;
		this.loaiSanPham = loaiSanPham;
		this.giaSanPham = giaSanPham;
	}
	//tostring
	@Override
	public String toString() {
		return "SanPham [maSanPham = " + maSanPham + ", tenSanPham = " + tenSanPham + ", loaiSanPham = " + loaiSanPham
				+ ", giaSanPham = " + giaSanPham + "]";
	}
}
