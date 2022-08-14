public class NhanVienFulltime extends NhanVien {
    public double bonusMoney;
    public double tienphat;
    public double luongcung;

    public NhanVienFulltime(double bonusMoney, double tienphat, double luongcung) {
        this.bonusMoney = bonusMoney;
        this.tienphat = tienphat;
        this.luongcung = luongcung;
    }

    public NhanVienFulltime(double employCode, String name, int age, int numberPhone, String email, double bonusMoney, double tienphat, double luongcung) {
        super(employCode, name, age, numberPhone, email);
        this.bonusMoney = bonusMoney;
        this.tienphat = tienphat;
        this.luongcung = luongcung;
    }

    public double getBonusMoney() {
        return bonusMoney;
    }

    public void setBonusMoney(double bonusMoney) {
        this.bonusMoney = bonusMoney;
    }

    public double getTienphat() {
        return tienphat;
    }

    public void setTienphat(double tienphat) {
        this.tienphat = tienphat;
    }

    public double getLuongcung() {
        return luongcung;
    }

    public void setLuongcung(double luongcung) {
        this.luongcung = luongcung;
    }

    public double getluong() {
        return  luongcung + (bonusMoney - tienphat);
    }
}
