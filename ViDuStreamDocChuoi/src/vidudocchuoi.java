	import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class vidudocchuoi {

	public static void main(String[] args) throws IOException {
				//khai báo biến đối tượng InputStreamReader
				InputStreamReader ipReader = new InputStreamReader(System.in);
				//Khai báo biến đối tượng buffer
				BufferedReader bufReader = new BufferedReader(ipReader);
				//in câu hướng dẫn user
				System.out.print("Nhập một chuỗi bất kì:");
				//đọc dữ liệu từ ban phím, cất biến vào chuỗi 
				String docduoc = bufReader.readLine();
				//in ra dòng đọc được
				System.out.print(docduoc);
			}
	}
