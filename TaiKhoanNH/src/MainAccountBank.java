
public class MainAccountBank {
	    public static void main(String[] args) {
	    	AccountBank tk1 = new AccountBank("001", "Tran Ngoc Bao", 100000);
	        tk1.guiTien(50000);
	        tk1.rutTien(30000);
	        System.out.println("Số dư cuối: " + tk1.getSoDu());

	    }

	}

