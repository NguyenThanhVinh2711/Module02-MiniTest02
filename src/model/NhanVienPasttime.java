package model;

import java.io.Serializable;

public class NhanVienPasttime extends NhanVien implements Serializable {
    public double sogiolamviec;

    public NhanVienPasttime(double id, String name, int age, int numberPhone, String email, double sogiolamviec) {
        super(id, name, age, numberPhone, email);
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

    @Override
    public String toString() {
        return "NhanVienPasttime{" +
                "sogiolamviec=" + sogiolamviec +
                '}';
    }
}
