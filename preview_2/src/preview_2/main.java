package preview_2;
import java.io.*;

import java.util.ArrayList;

import com.sun.source.tree.WhileLoopTree;

public class main {

	public static void main(String[] args) {
		ArrayList<DSHS> ds = new ArrayList<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader("dshs.txt"));
			String line;
			while((line = br.readLine()) != null) {
				String[] part = line.split(",");
				String ten = part[0];
				Double diem = Double.parseDouble(part[1]);
				ds.add(new DSHS(ten, diem));
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.print("Lỗi đọc file!!");
		}
		for(DSHS hs : ds) {
			System.out.println(hs.tenMon +"----" + hs.diem);
		}
	}

}
