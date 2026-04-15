package review_basic;

public class product {
	private String name;
	private Double price;
	private Integer quanlity;
	//constructor
	public product(String name,Double price,Integer quanlity) 
	{
		this.name = name;
		this.price = price;
		this.quanlity = quanlity;
	}
	//getter
	public String getTen() {
		return name;
	}
	public Double getGia() {
		return price;
	}
	public int getSoLuong() {
		return quanlity;
	}
	//setter
	public void setTen(String ten) {
		name = ten;
	}
	public void setGia(Double gia) {
		price = gia;
	}
	public void setSoLuong(Integer soluong) {
		quanlity = soluong;
	}
	@Override
	public String toString() {
		return "\nTenSP:" + name +  "\nGiaSP:" + price + "\nSoLuongSP:" + quanlity;
	}
}
