public abstract class NhanVien implements Comparable<NhanVien> {
    private double employCode;
    private String name;
    private int age;
    private int numberPhone;
    private String email;

    public NhanVien() {
    }

    public NhanVien(double employCode, String name, int age, int numberPhone, String email) {
        this.employCode = employCode;
        this.name = name;
        this.age = age;
        this.numberPhone = numberPhone;
        this.email = email;
    }

    public double getEmployCode() {
        return employCode;
    }

    public void setEmployCode(double employCode) {
        this.employCode = employCode;
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

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
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
}
