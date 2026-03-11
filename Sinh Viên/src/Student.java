public class Student {
	private String ten;
	private int age;
	private String maSV;
	private double DTB;

//public Student() {
//	this.ten = "chưa có tên";
//	this.age = "18";
//	this.maSV = "SV000";
//	this.DTB = "0,0";
//}

public Student(String ten, int age, String maSV) {
	this.ten = ten;
	this.setAge(age);
	this.maSV = maSV;
	this.DTB = 0.0;
}
public String getTen() {
	return ten;
}
public int getAge() {
	return age;
}
public String getMaSV() {
	return maSV;
}
public double getDiemTB() {
	return DTB;
}

public void setTen(String ten){
	if (ten != null && !ten.trim().isEmpty()) {
		this.ten = ten;
	}else {
		System.out.println("Ten khong hop le!");
	}
}
	public void setAge(int age) {
		if(age >=18 && age <=50) {
			this.age = age;
		}else {
			System.out.print("Tuoi khong hop le!");
		}
	}
public void setMaSV (String maSV) {
	if(maSV != null && maSV.startsWith("SV")) {
		this.maSV = maSV;
	}else {
		System.out.print("Ma so khong hop le!");
	}
}
public void setDiemTB(double DTB) {
		if (DTB >= 0.0 && DTB <=10 ) {
			this.DTB = DTB;
		}else {
			System.out.print("Diem khong hop le");
		}
}
public void HienThiThongTin() {
	System.out.println("Ten:" + this.ten);
	System.out.println("Tuoi:" + this.age);
	System.out.println("Ma so SV:" + this.maSV);
	System.out.println("Diem trung binh:" + this.DTB);
	System.out.println("Xep loai:" + this.xeploai());
}
private String xeploai() {
	if(DTB >= 8.0) return "Gioi";
	else if(DTB>=6.5) return "Kha";
	else if(DTB >=5) return "Trung Binh";
	else return "Yeu";
}
}


	


