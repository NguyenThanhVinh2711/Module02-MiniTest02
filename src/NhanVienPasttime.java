public class NhanVienPasttime extends NhanVien {
    public double sogiolamviec;

    public NhanVienPasttime(double sogiolamviec) {
        this.sogiolamviec = sogiolamviec;
    }

    public NhanVienPasttime(double employCode, String name, int age, int numberPhone, String email, double sogiolamviec) {
        super(employCode, name, age, numberPhone, email);
        this.sogiolamviec = sogiolamviec;
    }

    public double getSogiolamviec() {
        return sogiolamviec;
    }

    public void setSogiolamviec(double sogiolamviec) {
        this.sogiolamviec = sogiolamviec;
    }
    public double getluong(){
        return sogiolamviec*100000;
    }
}
