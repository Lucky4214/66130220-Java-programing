

public class run {

	public static void main(String[] args) {
		//tạo mới đối  tượng
		ChuNhat cn1 = new ChuNhat();
		ChuNhat cn2 = new ChuNhat(20,15);
		ChuNhat hv = new ChuNhat(20,20);
		//lấy dữ liệu cn1
		double cn1_dai=cn1.getDai();
		double cn1_rong=cn1.getRong();	
		System.out.print("Hình cn1 có chiều dài là:" + cn1_dai);
		System.out.print("\nHình cn1 có chiều rộng là:" + cn1_rong);
		//thay đổi chiều dài cn1
		cn1.setDai(50);
		System.out.print("\nSau khi thay đổi chiều dài là:\n");
		cn1_dai=cn1.getDai();
		cn1_rong=cn1.getRong();
		System.out.print("chiều dài mới là:" + cn1_dai);
		System.out.println("\nHình cn1 có chiều rộng là:" + cn1_rong);
		
		//sử dụng toString
		System.out.println(cn1.toString());
	}

}
