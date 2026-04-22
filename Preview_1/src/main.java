import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		ArrayList<MonHoc> danhSach = new ArrayList<>();
		danhSach.add(new MonHoc("Toán", 7.5));
        danhSach.add(new MonHoc("Lí", 7.5));
        danhSach.add(new MonHoc("Hóa", 7.5));
        danhSach.add(new MonHoc("Sinh", 7.25));
        danhSach.add(new MonHoc("Văn", 9.6));
        danhSach.add(new MonHoc("Ngoại ngữ", 6.2));
        //in tiêu đề 
        System.out.printf("%-15s %-10s\n", "Môn", "Điểm");
        System.out.println("-------------------------");
        //in danh sách
        for(MonHoc mHoc : danhSach) {
        	System.out.printf("%-15s %-10.2f\n",mHoc.tenMon, mHoc.diem);
        	
        }

	}

}
