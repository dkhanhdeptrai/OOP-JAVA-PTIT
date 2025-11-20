import java.util.Scanner;


class SinhVien1 {

    private String maSV;
    private String hoTen;
    private String lop;
    private String ngaySinh;
    private float gpa;

    // 1. Hàm khởi tạo không tham số gán giá trị mặc định
    // Hàm này vẫn truy cập được vào private vì nó ở bên trong lớp
    SinhVien1() {
        this.maSV = "";
        this.hoTen = "";
        this.lop = "";
        this.ngaySinh = "";
        this.gpa = 0.0f;
    }
    
    // 2. Vì thuộc tính là private, ta cần các hàm public
    // để gán giá trị (setter) và lấy giá trị (getter)

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
    
    // Hàm để chuẩn hóa
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
        // Hàm khởi tạo SinhVien() được gọi ở đây
        try (Scanner sc = new Scanner(System.in)) {
            // Hàm khởi tạo SinhVien() được gọi ở đây
            SinhVien sv = new SinhVien();
            
            // 3. Sử dụng các hàm "set" để gán giá trị
            // vì không thể truy cập trực tiếp sv.hoTen
            sv.setHoTen(sc.nextLine());
            sv.setLop(sc.nextLine());
            sv.setNgaySinh(sc.nextLine());
            sv.setGpa(sc.nextFloat());
            
            sv.setMaSV("B20DCCN001");
            
            // Yêu cầu sinh viên tự chuẩn hóa
            sv.chuanHoaNgaySinh();
            
            // Yêu cầu sinh viên tự in thông tin
            sv.xuatThongTin();
        }
    }
}