package Bao_TN;

import java.security.PublicKey;

public class HocSinh {
	//Các thuộc tính
	private String tenHS;
	private short tuoiHS;
	private String lopHS;
	//Các hàm tạo
	 public HocSinh() {
		 
	 }
	 
	 public HocSinh(String tenHS, short tuoiHS, String lopHS) {
		super();
		this.tenHS = tenHS;
		this.tuoiHS = tuoiHS;
		this.lopHS = lopHS;
	}
	 //getter setter
	 public String getTenHS() {
		 return tenHS;
	 }
	 public void setTenHS(String tenHS) {
		 this.tenHS = tenHS;
	 }
	 public short getTuoiHS() {
		 return tuoiHS;
	 }
	 public void setTuoiHS(short tuoiHS) {
		 this.tuoiHS = tuoiHS;
	 }
	 public String getLopHS() {
		 return lopHS;
	 }
	 public void setLopHS(String lopHS) {
		 this.lopHS = lopHS;
	 }
	 //toString
	 @Override
	 public String toString() {
		return "HocSinh [tenHS=" + tenHS + ", tuoiHS=" + tuoiHS + ", lopHS=" + lopHS + "]";
	 }
	 
	 
}
