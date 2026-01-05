import java.util.Scanner;


class SinhVien{

    private String maSV;
    private String hoTen;
    private String lop;
    private String ngaySinh;
    private float gpa;


    SinhVien() {
        this.maSV = "";
        this.hoTen = "";
        this.lop = "";
        this.ngaySinh = "";
        this.gpa = 0.0f;
    }


    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    
    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    

    public void chuanHoaNgaySinh() {
        String[] parts = this.ngaySinh.split("/");
        if (parts[0].length() == 1) {
            parts[0] = "0" + parts[0];
        }
        if (parts[1].length() == 1) {
            parts[1] = "0" + parts[1];
        }
        this.ngaySinh = parts[0] + "/" + parts[1] + "/" + parts[2];
    }
    
    public void xuatThongTin() {
        System.out.printf("%s %s %s %s %.2f\n", 
                          this.maSV, 
                          this.hoTen, 
                          this.lop, 
                          this.ngaySinh, 
                          this.gpa);
    }
}

public class KhaiBaoLopSinhVien {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            SinhVien sv = new SinhVien();
            sv.setHoTen(sc.nextLine());
            sv.setLop(sc.nextLine());
            sv.setNgaySinh(sc.nextLine());
            sv.setGpa(sc.nextFloat());
            sv.setMaSV("B20DCCN001");
            sv.chuanHoaNgaySinh();
            sv.xuatThongTin();
        }
    }
}