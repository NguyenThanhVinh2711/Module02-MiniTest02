package storage;

import model.NhanVien;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static List<NhanVien> readFile(String path) {
        List<NhanVien> nhanVienList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            nhanVienList = (List<NhanVien>) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return nhanVienList;
    }

    public static void writeFile(String path, List<NhanVien> nhanVienList) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(nhanVienList);
            oos.close();
            fos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
