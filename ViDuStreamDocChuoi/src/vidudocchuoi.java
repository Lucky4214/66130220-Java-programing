	import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
public class vidudocchuoi {

	public static void main(String[] args) throws IOException {
		FileInputStream fInput	= new FileInputStream("baitho.txt");
		
		
		
				//khai báo biến đối tượng InputStreamReader
				InputStreamReader ipReader = new InputStreamReader(fInput);
				//Khai báo biến đối tượng buffer
				BufferedReader bufReader = new BufferedReader(ipReader);
				//đọc dữ liệu từ ban phím, cất biến vào chuỗi 
				String line1 = bufReader.readLine();
				//in ra dòng đọc được
				System.out.print(line1);
			}
	}
