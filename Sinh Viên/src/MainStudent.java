public class MainStudent {
	public static void main(String[] args) {
//		Student sv = new Student();
//		sv1.setTen("Tran Ngoc Bao");
//        sv1.setTuoi(20);
//        sv1.setMaSV("SV001");
//        sv1.setDiemTB(8.5);
//        sv1.hienThiThongTin();
//		 System.out.println("\n---\n");
		Student sv1 = new Student("Tran Ngoc Bao",20,"SV001");
		sv1.setDiemTB(8.0);
		sv1.HienThiThongTin();
		System.out.println("\n---\n");
		//test
		Student sv3 = new Student("Tran Van B",30,"SV003");
        sv3.setAge(15);  
        sv3.setDiemTB(12.5);  
        sv3.setMaSV("ABC123");  
       //truy cap qua getter
        System.out.println("\nTên sv1: " + sv1.getTen());
    //    System.out.println("Điểm TB sv2: " + sv2.getDiemTB());	
	}
}
