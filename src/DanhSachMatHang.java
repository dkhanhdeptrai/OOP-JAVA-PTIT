
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class MatHang {

    private String ma, ten, donvi;
    private int mua, ban;
    private static int sMa = 1;

    public MatHang() {
    }

    public MatHang(String ten, String donvi, int mua, int ban) {
        this.ma = String.format("MH%03d", sMa++);
        this.ten = ten;
        this.donvi = donvi;
        this.mua = mua;
        this.ban = ban;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDonvi() {
        return donvi;
    }

    public void setDonvi(String donvi) {
        this.donvi = donvi;
    }

    public int getMua() {
        return mua;
    }

    public void setMua(int mua) {
        this.mua = mua;
    }

    public int getBan() {
        return ban;
    }

    public void setBan(int ban) {
        this.ban = ban;
    }

    public static int getsMa() {
        return sMa;
    }

    public static void setsMa(int sMa) {
        MatHang.sMa = sMa;
    }

    public int getLoiNhuan() {
        return ban - mua;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + donvi + " " + mua + " " + ban + " " + getLoiNhuan();
    }

}

public class DanhSachMatHang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = Integer.parseInt(sc.nextLine());
        List<MatHang> list = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String ten = sc.nextLine();
            String donvi = sc.nextLine();
            int mua = Integer.parseInt(sc.nextLine());
            int ban = Integer.parseInt(sc.nextLine());
            list.add(new MatHang(ten, donvi, mua, ban));
        }
        Collections.sort(list, (MatHang o1, MatHang o2) -> o2.getLoiNhuan() - o1.getLoiNhuan());
        list.forEach(mh -> System.out.println(mh));
    }
}
