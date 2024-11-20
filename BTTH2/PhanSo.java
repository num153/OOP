public class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo() {
        this.tuSo = 0;
        this.mauSo = 1;
    }

    public PhanSo(int tuSo, int mauSo) {
        if (mauSo == 0) {
            throw new IllegalArgumentException("Mau so phai khac 0");
        }
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public static int Ucln(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return Ucln(b, a % b);
        }
    }

    public PhanSo rutGon() {
        int u = Ucln(tuSo, mauSo);
        int t = tuSo / u;
        int m = mauSo / u;
        if (m < 0) {
            t = -t;
            m = -m;
        }
        return new PhanSo(t, m);
    }

    public PhanSo cong(PhanSo ps) {
        int t = this.tuSo * ps.mauSo + this.mauSo * ps.tuSo;
        int m = this.mauSo * ps.mauSo;
        return new PhanSo(t, m);
    }
    

    @Override
    public String toString() {
        if (tuSo == 0) {
            return "0";
        }
        if (mauSo == 1) {
            return String.format("%d", tuSo);
        }
        return String.format("%d/%d", tuSo, mauSo);
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        if (mauSo == 0) {
            throw new IllegalArgumentException("Mau so phai khac 0");
        }
        this.mauSo = mauSo;
    }
}
