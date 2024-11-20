import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HocSinh {
    private static int count = 0;
    private String maSo;
    private String hoTen;
    private Date ngaySinh;
    private String queQuan;
    private double diemToan;
    private double diemVan;
    private double diemAnh;

    public HocSinh(String hoTen, Date ngaySinh, String queQuan, double diemToan, double diemVan, double diemAnh) {
        if (count == 9999) {
            throw new IllegalStateException("DS qua gioi han roi em");
        }
        this.maSo = String.format("HS-%04d", ++count);
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
        this.diemAnh = diemAnh;
    }

    @Override
    public String toString() {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return String.format(
                "Ma so: %s\nHo Ten: %s\nNgay sinh: %s\nQue quan: %s\nDiem toan: %.1f\nDiem Van: %.1f\nDiem Anh: %.1f\n",
                this.maSo, this.hoTen, df.format(this.ngaySinh), this.queQuan, this.diemToan, this.diemVan,
                this.diemAnh);
    }

    public int getTuoi() {
        Calendar thisYear = Calendar.getInstance();
        Calendar birthYear = Calendar.getInstance();
        birthYear.setTime(ngaySinh);
        return thisYear.get(Calendar.YEAR) - birthYear.get(Calendar.YEAR);
    }

    public String getMaSo() {
        return maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public double getDiemVan() {
        return diemVan;
    }

    public double getDiemAnh() {
        return diemAnh;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public void setDiemVan(double diemVan) {
        this.diemVan = diemVan;
    }

    public void setDiemAnh(double diemAnh) {
        this.diemAnh = diemAnh;
    }

    public static void main(String[] args) {
        try {
            // Định dạng ngày tháng
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

            // Tạo đối tượng học sinh đầu tiên
            HocSinh hs1 = new HocSinh(
                    "Nguyen Van A",
                    dateFormat.parse("01/06/2005"),
                    "Ha Noi",
                    8.5,
                    7.0,
                    9.0);

            // Tạo đối tượng học sinh thứ hai
            HocSinh hs2 = new HocSinh(
                    "Le Thi B",
                    dateFormat.parse("15/07/2006"),
                    "Da Nang",
                    6.0,
                    5.5,
                    7.5);

            // In thông tin các học sinh
            System.out.println("Thông tin học sinh 1:");
            System.out.println(hs1);
            System.out.println("Thông tin học sinh 2:");
            System.out.println(hs2);
            System.out.println("Tuoi cua hs1: " + hs1.getTuoi());
            System.out.println("Tuoi cua hs2: " + hs2.getTuoi());

        } catch (Exception e) {
            // Xử lý lỗi khi định dạng ngày không hợp lệ
            System.err.println("Lỗi định dạng ngày: ");
        }
    }

}
