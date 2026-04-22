	package preview_3;
	
	import java.util.ArrayList;
	import java.io.*;
	
	public class main {
	
		public static void main(String[] args)  {
			ArrayList<ListHS> dsHs = new ArrayList<>();
			//doc file
			try {
				BufferedReader br = new BufferedReader(new FileReader("DSHS.txt"));
				String line;
				br.readLine();	
				while((line = br.readLine()) != null) {
					String[] part = line.split(";");
					//lấy dữ liệu
					Integer number = Integer.parseInt(part[0].trim());
					String fullName = part[1].trim();
					Integer year = Integer.parseInt(part[2].trim());
					String sex = part[3].trim();
					dsHs.add(new ListHS(number, fullName, year, sex));
				}
				br.close();
			} catch (Exception e) {
				System.out.print("Lỗi đọc file !!!");
				   e.printStackTrace();
			}
			System.out.printf("%-5s %-25s %-10s %-10s\n", "STT", "Họ_Tên", "Năm_Sinh", "Giới_Tính");
			for(ListHS hs : dsHs) {
				System.out.printf("%-5d %-25s %-10d %-10s\n",hs.number,hs.fullName,hs.year,hs.sex);
			}
			
		}
	
	}
