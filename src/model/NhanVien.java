package model;

import java.io.Serializable;

public abstract class NhanVien implements Comparable<NhanVien> , Serializable {
    private double id;
    private String name;
    private int age;
    private int numberPhone;
    private String email;

    public NhanVien(String employCode, String name, int age, int numberPhone, String email) {
    }

    public NhanVien(double employCode, String name, int age, int numberPhone, String email) {
        this.id = employCode;
        this.name = name;
        this.age = age;
        this.numberPhone = numberPhone;
        this.email = email;
    }

    public double getEmployCode() {
        return id;
    }

    public void setEmployCode(double employCode) {
        this.id = employCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberPhone(int phoneNumber) {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail(String email) {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public abstract double getluong();

    @Override
    public int compareTo(NhanVien o) {
        double a=this.getluong() - o.getluong() ;
        if (a>0)
            return 1;
        else if (a<0)
            return -1;
        else return 0;

    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", numberPhone=" + numberPhone +
                ", email='" + email + '\'' +
                '}';
    }
}
