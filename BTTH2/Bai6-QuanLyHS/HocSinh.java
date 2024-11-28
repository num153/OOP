import java.text.ParseException;
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

    public double getDTB() {
        return (diemToan + diemVan + diemAnh) / 3.0;
    }

    public String getHocLuc() {
        double d = getDTB();
        if (d >= 8)
            return "Gioi";
        else if (d >= 6.5)
            return "Kha";
        else if (d >= 5.0)
            return "TB";
        else
            return "Yeu";
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
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            df.setLenient(false); // kiem tra date co hop le khong (true) thi se tu fix, (false) se thong bao loi


            HocSinh hs1 = new HocSinh(
                    "Nguyen Van A",
                    df.parse("01/06/2005"),
                    "Ha Noi",
                    8.5,
                    7.0,
                    9.0);

            HocSinh hs2 = new HocSinh(
                    "Le Thi B",
                    df.parse("15/07/2006"),
                    "Da Nang",
                    6.0,
                    5.5,
                    7.5);

            System.out.println("Hoc sinh 1:" + hs1);
            System.out.println("Hoc sinh 1:" + hs2);
            System.out.println("Tuoi cua hs1: " + hs1.getTuoi());
            System.out.println("Tuoi cua hs2: " + hs2.getTuoi());
            System.out.println("Hoc luc hs2: " + hs2.getHocLuc() + String.format(" %.2f",hs2.getDTB()));

        } catch (ParseException e) {
            System.err.println("Lỗi định dạng ngày: " + e.getMessage());
        }
    }

}
