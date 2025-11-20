import java.util.Scanner;

class NhanVien {

    String maNV;
    String hoTen;
    String gioiTinh;
    String ngaySinh;
    String diaChi;
    String maSoThue;
    String ngayKyHopDong;
}

public class KhaiBaoLopNhanVien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien nv = new NhanVien();

        nv.maNV = "00001";
        nv.hoTen = sc.nextLine();
        nv.gioiTinh = sc.nextLine();
        nv.ngaySinh = sc.nextLine();
        nv.diaChi = sc.nextLine();
        nv.maSoThue = sc.nextLine();
        nv.ngayKyHopDong = sc.nextLine();

        System.out.printf("%s %s %s %s %s %s %s\n",
                nv.maNV,
                nv.hoTen,
                nv.gioiTinh,
                nv.ngaySinh,
                nv.diaChi,
                nv.maSoThue,
                nv.ngayKyHopDong);
        
        
    }
}