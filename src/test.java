import java.lang.reflect.Array;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVienFulltime(1, "vinh1", 22, 1001, "vinhnguyen1", 1100, 2100, 3100000);
        NhanVien nv2 = new NhanVienFulltime(2, "vinh2", 22, 1001, "vinhnguyen1", 1200, 2200, 3200000);
        NhanVien nv3 = new NhanVienFulltime(3, "vinh3", 22, 1001, "vinhnguyen1", 1300, 2300, 3300000);
        NhanVien nv4 = new NhanVienPasttime(4, "vinh4", 22, 1001, "vinhnguyen1", 100);
        NhanVien nv5 = new NhanVienPasttime(5, "vinh5", 22, 1001, "vinhnguyen1", 200);
        NhanVien nv6 = new NhanVienPasttime(6, "vinh6", 22, 1001, "vinhnguyen1", 300);

        NhanVien listnv[] = {nv1, nv2, nv3, nv4, nv5, nv6};

        int tongtb = 0;

        for (NhanVien tb : listnv
        ) {
            tongtb += tb.getluong();
        }
        System.out.println("Tong luong trung binh cua nhan vien ca cong ty = " + tongtb / listnv.length);


        System.out.println("Danh sach nhan vien toan thoi gian co muc luong nho hon muc luong tb la :" );
        for (int i = 0; i < listnv.length; i++) {
            if (listnv[i].getluong() < (tongtb / listnv.length)) {
                System.out.println(listnv[i].getName());
            }
        }

        double tongluongnvPart = 0;
        for (NhanVien luong : listnv
        ) {
            if (luong instanceof NhanVienPasttime) {
                NhanVienPasttime x = (NhanVienPasttime) luong;
                tongluongnvPart += x.getluong();
            }
        }
        System.out.println("luong nhan vien part = " + tongluongnvPart);

        NhanVien[] listdcnvfulltime ={nv1,nv2,nv3};

        Arrays.sort(listnv);
        System.out.println("DS luong nv fulltime theo thu tu tang dan :");
        for (NhanVien c: listdcnvfulltime
             ) {
            System.out.println(" Ten nhan vien : " + c.getName() + " Luong nhan vien = " + c.getluong() );
        }
    }
}
