
import java.util.Scanner;

class ThiSinh {

    String hoTen, ngaySinh;
    double diem1, diem2, diem3;

    void nhap() {
        Scanner sc=new Scanner(System.in);
        hoTen = sc.nextLine();
        ngaySinh = sc.nextLine();
        diem1 = sc.nextDouble();
        diem2 = sc.nextDouble();
        diem3 = sc.nextDouble();
    }

    double tongDiem() {
        return diem1 + diem2 + diem3;
    }

    void xuat() {
        System.out.printf("%s %s %.1f\n", hoTen, ngaySinh, tongDiem());
    }
}

public class KhaiBaoLopThiSinh {

    public static void main(String[] args) {

        ThiSinh ts = new ThiSinh();
        ts.nhap();
        ts.xuat();
    }
}
