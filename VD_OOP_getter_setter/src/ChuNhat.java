import java.net.spi.InetAddressResolver.LookupPolicy;

public class ChuNhat {
	//dữ liệu của lớp
	private double dai;
	private double rong;
	
	//hàm tạo
	public ChuNhat() {
		dai = 10;
		rong = 5;
	}
	//hàm tạo 
	public ChuNhat(double dai, double rong) {
		this.dai=dai;
		this.rong=rong;
	}
//	public ChuNhat(double daiM, double rongM) {
//		dai=daiM;
//		rong=rongM;
//	}
	//các getter
	double getDai() {
		return dai;
	}
	double getRong() {
		return rong;
	}
	//các setter
//	void setDai(double daiM) {
//		dai=daiM;
//	}
//	void setRong(double rongM) {
//		rong=rongM;
//	}
	void setDai(double dai) {
		this.dai=dai;
	}
	void setRong(double rong) {
		this.rong=rong;
	}
	//các phương thức khác
	//tóm tắt thông tin của đối tượng thành một chuỗi để in ra
	public String toString() {
		String s="Hình này có chiều dài =";
		s=s+dai;
		s=s+"và chiều rộng = " + rong;
		//String s="Hình này có chiều dài =" + dai +"và chiều rộng là:" + rong;
		return s;
	}
	
}
