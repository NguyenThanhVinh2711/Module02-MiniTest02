package controller;

import model.NhanVien;
import model.NhanVienFulltime;
import model.NhanVienPasttime;
import java.io.*;
import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

import static storage.ReadAndWriteFile.readFile;
import static storage.ReadAndWriteFile.writeFile;

public class Manager  {
    public static List<NhanVien> nhanVienList = readFile("danhsachnhanvien.txt");

    public static void addNhanVienFullTime() {
        Scanner scannerS = new Scanner(System.in);
        Scanner scannerI = new Scanner(System.in);
        Scanner scannerD = new Scanner(System.in);

        System.out.println("Nhap ma nhan vien ");
        double id = scannerD.nextDouble();

        System.out.println("Nhap ho va ten");
        String name = scannerS.nextLine();

        System.out.println("Nhap tuoi");
        int age = scannerI.nextInt();

        System.out.println("Nhap so dien thoai");
        int phoneNumber = scannerI.nextInt();

        System.out.println("Nhap email ");
        String email = scannerS.nextLine();

        System.out.println("Nhap tien thuong");
        double tienThuong = scannerD.nextDouble();

        System.out.println("Nhap tien phat");
        double tienPhat = scannerD.nextDouble();

        System.out.println("Nhap luong cung");
        double luongCung = scannerD.nextDouble();

        NhanVienFulltime nhanVienFulltime = new NhanVienFulltime(id, name, age, phoneNumber, email, tienThuong, tienPhat, luongCung);

        nhanVienList.add(nhanVienFulltime);
        writeFile("danhsachnhanvien.txt",nhanVienList);
    }

    public static void addNhanVienPartTime() {
        Scanner scannerS = new Scanner(System.in);
        Scanner scannerI = new Scanner(System.in);
        Scanner scannerD = new Scanner(System.in);

        System.out.println("Nhap ma nhan vien ");
        double id = scannerD.nextDouble();

        System.out.println("Nhap ho va ten");
        String name = scannerS.nextLine();

        System.out.println("Nhap tuoi");
        int age = scannerI.nextInt();

        System.out.println("Nhap so dien thoai");
        int phoneNumber = scannerI.nextInt();

        System.out.println("Nhap email ");
        String email = scannerS.nextLine();

        System.out.println("Nhap so gio lam viec");
        double hourWork = scannerD.nextDouble();

        NhanVienPasttime nhanVienPartTime = new NhanVienPasttime(id, name, age, phoneNumber, email, hourWork);
        nhanVienList.add(nhanVienPartTime);
        writeFile("danhsachnhanvien.txt",nhanVienList);
    }

    public static void displayDanhSachNhanVien() {
        for (NhanVien nhanVien : nhanVienList
        ) {
            System.out.println(nhanVien);
        }
    }

    public static void deleteNhanvien() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id nhan vien can xoa");
        int id = scanner.nextInt();

        for (int i = 0; i < nhanVienList.size(); i++) {
            if (id == nhanVienList.get(i).getEmployCode()) {
                nhanVienList.remove(nhanVienList.get(i));
            }
        }
    }

    public static void editNhanvien() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id nhan vien can sua");
        int id = scanner.nextInt();

        for (NhanVien nhanVien : nhanVienList) {
            if (id == nhanVien.getEmployCode()) {

                Scanner scannerS = new Scanner(System.in);
                Scanner scannerI = new Scanner(System.in);

                System.out.println("Nhap id can sua");
                int idEdit = scannerI.nextInt();

                System.out.println("Nhap ho va ten");
                String name = scannerS.nextLine();

                System.out.println("Nhap tuoi");
                int age = scannerI.nextInt();

                System.out.println("Nhap so dien thoai");
                int phoneNumber = scannerI.nextInt();

                System.out.println("Nhap email ");
                String email = scannerS.nextLine();

                nhanVien.setEmployCode(idEdit);
                nhanVien.setName(name);
                nhanVien.setAge(age);
                nhanVien.setNumberPhone(phoneNumber);
                nhanVien.setEmail(email);


            }
        }
    }

    public static void menu() {
        System.out.println("1.Them nhan vien fulltime.  ");
        System.out.println("2.Them nhan vien pasttime.  ");
        System.out.println("3.Xoa nhan vien.  ");
        System.out.println("4.Hien thi danh sach nhan vien.  ");
        System.out.println("5.Sua danh thong tin nhan vien theo id. ");
        System.out.println("0.Exit. ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap lua chon cua ban:");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                addNhanVienFullTime();
                break;
            case 2:
                addNhanVienPartTime();
                break;
            case 3:
                deleteNhanvien();
                break;
            case 4:
                displayDanhSachNhanVien();
                break;
            case 5:
                editNhanvien();
            case 0:
                System.exit(0);
        }
    }
}

