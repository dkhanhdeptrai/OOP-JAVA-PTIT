import java.util.*;

class PhongMay {

  protected String ma, ten, hangSX;
  protected double giaNhap;

  private static int sMa = 1;

  public PhongMay(String ten, String hangSX, double giaNhap) {
    this.ma = String.format("TB%03d", sMa++);
    this.ten = ten;
    this.hangSX = hangSX;
    this.giaNhap = giaNhap;
  }

  public double getGia() {
    return giaNhap;
  }

  public String getMa() {
    return ma;
  }

  public void setGiaNhap(double giaNhap) {
    this.giaNhap = giaNhap;
  }

  public String toString() {
    return ma + " " + ten + " " + hangSX + " " + giaNhap;
  }
}

class MayTinh extends PhongMay {

  private final String CPU;
  private final int RAM;

  public MayTinh(String ten, String hangSX, double giaNhap, String CPU, int RAM) {
    super(ten, hangSX, giaNhap);
    this.CPU = CPU;
    this.RAM = RAM;
  }

  @Override
  public double getGia() {
    return giaNhap + 500 * RAM;
  }

  @Override
  public String toString() {
    return super.toString() + " " + CPU + " " + RAM + " " + getGia();
  }
}

class MayIn extends PhongMay {

  private final String loaiIn;
  private final int tocDo;

  public MayIn(String ten, String hangSX, double giaNhap, String loaiIn, int tocDo) {
    super(ten, hangSX, giaNhap);
    this.loaiIn = loaiIn;
    this.tocDo = tocDo;
  }

  @Override
  public double getGia() {
    return giaNhap + 300 * tocDo;
  }

  @Override
  public String toString() {
    return super.toString() + " " + loaiIn + " " + tocDo + " " + getGia();
  }
}

class QLPhongMay {

  List<PhongMay> lst = new ArrayList<>();

  public void inp(Scanner ip) {
    int n = Integer.parseInt(ip.nextLine());
    for (int i = 0; i < n; i++) {
      String loai = ip.nextLine();
      String ten = ip.nextLine();
      String hangSX = ip.nextLine();
      double giaNhap = Double.parseDouble(ip.nextLine());
      if (loai.equalsIgnoreCase("COMPUTER")) {
        String CPU = ip.nextLine();
        int RAM = Integer.parseInt(ip.nextLine());
        lst.add(new MayTinh(ten, hangSX, giaNhap, CPU, RAM));
      } else {
        String loaiIn = ip.nextLine();
        int tocDo = Integer.parseInt(ip.nextLine());
        lst.add(new MayIn(ten, hangSX, giaNhap, loaiIn, tocDo));
      }
    }
  }

  public void suaGiaTheoMa(Scanner ip) {
    System.out.println("Nhap ma can sua:");
    String ma = ip.nextLine();
    System.out.println("Nhap gia moi:");
    double giaMoi = Double.parseDouble(ip.nextLine());
    boolean found = false;
    for (PhongMay p : lst) {
      if (p.getMa().equalsIgnoreCase(ma)) {
        p.setGiaNhap(giaMoi);
        System.out.println("DONE!");
        found = true;
        break;
      }
    }
    if (!found) {
      System.out.println("NOT FOUND!");
    }
  }

  public void xoaTheoMa(Scanner ip) {
    System.out.println("Nhap ma can xoa:");
    String ma = ip.nextLine();
    boolean found = false;
    for (int i = 0; i < lst.size(); i++) {
      if (lst.get(i).getMa().equalsIgnoreCase(ma)) {
        lst.remove(i);
        System.out.println("DONE!");
        found = true;
        break;
      }
    }
    if (!found) {
      System.out.println("NOT FOUND!");
    }
  }

  public void timTheoMa(Scanner ip) {
    System.out.println("Nhap ma can tim:");
    String ma = ip.nextLine();
    boolean found = false;
    for (PhongMay p : lst) {
      if (p.getMa().equalsIgnoreCase(ma)) {
        System.out.println(p);
        found = true;
        break;
      }
    }
    if (!found) {
      System.out.println("NOT FOUND!");
    }
  }

  public void xoaAllMayIn() {
    Iterator<PhongMay> it = lst.iterator();
    while (it.hasNext()) {
      if (it.next() instanceof MayIn) {
        it.remove();
      }
    }
  }

  public void outp() {
    for (PhongMay p : lst) {
      System.out.println(p);
    }
  }
}

public class Bai3_QLyPhongMay {

  public static void main(String[] args) {
    Scanner ip = new Scanner(System.in);
    QLPhongMay ql = new QLPhongMay();
    ql.inp(ip);
    System.out.println("DS Thiet Bi:");
    ql.outp();

    ql.suaGiaTheoMa(ip);
    System.out.println("DS thiet bi sau khi sua:");
    ql.outp();

    ql.xoaTheoMa(ip);
    System.out.println("DS thiet bi sau khi xoa:");
    ql.outp();

    ql.timTheoMa(ip);

    ql.xoaAllMayIn();
    System.out.println("DS sau khi xoa het may in:");
    ql.outp();
  }
}
/*
6
COMPUTER
May tinh van phong
Dell
10000
Core i5
8
PRINTER
May in laser
HP
5000
Laser
20
COMPUTER
May tinh gaming
Asus
15000
Core i7
16
PRINTER
May in phun mau
Canon
4000
Inkjet
15
COMPUTER
May tinh hoc tap
Lenovo
8000
Core i3
4
PRINTER
May in van phong
Brother
4500
Laser
18
 */
