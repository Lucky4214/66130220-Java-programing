public class Product {
    private String maSP;
    private String tenSP;
    private double gia;
    private int soLuong;
    public Product() {
        this.maSP = "SP000";
        this.tenSP = "Chua co ten";
        this.gia = 0.0;
        this.soLuong = 0;
    }

    // Constructor có tham số
    public Product(String maSP, String tenSP, double gia, int soLuong) {
        this.setMaSP(maSP);
        this.setTenSP(tenSP);
        this.setGia(gia);
        this.setSoLuong(soLuong);
    }

    // Getter
    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public double getGia() {
        return gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    // Setter có validation
    public void setMaSP(String maSP) {
        if (maSP != null && !maSP.trim().isEmpty()) {
            this.maSP = maSP;
        } else {
            System.out.println("Ma san pham khong hop le!");
        }
    }

    public void setTenSP(String tenSP) {
        if (tenSP != null && !tenSP.trim().isEmpty()) {
            this.tenSP = tenSP;
        } else {
            System.out.println("Ten san pham khong hop le!");
        }
    }

    public void setGia(double gia) {
        if (gia > 0) {
            this.gia = gia;
        } else {
            System.out.println("Gia phai > 0!");
        }
    }

    public void setSoLuong(int soLuong) {
        if (soLuong >= 0) {
            this.soLuong = soLuong;
        } else {
            System.out.println("So luong phai >= 0!");
        }
    }

    public double tinhThanhTien() {
        return this.gia * this.soLuong;
    }
    public void hienThiThongTin() {
        System.out.println("Ma SP: " + this.maSP);
        System.out.println("Ten SP: " + this.tenSP);
        System.out.println("Gia: " + this.gia);
        System.out.println("So luong: " + this.soLuong);
        System.out.println("Thanh tien: " + this.tinhThanhTien());
    }
}