import java.util.List;
import java.util.Scanner;

public class SinhVien {
    //tạo các thuộc tính
    private String tenSV;
    private String maSV;
    private double toan;
    private double ly;
    private double hoa;
    //hàm nhập thông tin sinh viên
    public void nhapThongTinSinhVien(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tên sinh viên: ");
        this.tenSV = sc.nextLine();

        System.out.println("Nhập mã số sinh viên: ");
        this.maSV = sc.nextLine();

        System.out.println("Nhập điểm toán: ");
        this.toan = Double.parseDouble(sc.nextLine());

        System.out.println("Nhập điểm lý: ");
        this.ly = Double.parseDouble(sc.nextLine());

        System.out.println("Nhập điểm hoá: ");
        this.hoa = Double.parseDouble(sc.nextLine());
    }
    // hàm tính ĐTB
    public double tinhDiemTrungBinh(){
        return (toan+ly+hoa)/3;
    }
    // hàm in thông tin điểm và xếp loại
    public void inThongTinVaXepLoai(){
        double dtb = tinhDiemTrungBinh();
        System.out.println("Tên sinh viên: "+this.tenSV+
                " - MSSV: "+this.maSV+
                " - ĐTB: "+dtb);
        if(dtb >= 9 ){
            System.out.println("Xếp loại 'Xuất sắc'");
        } else if (dtb >=8 && dtb <9) {
            System.out.println("Xếp loại 'Giỏi'");
        } else if (dtb >= 7 && dtb < 8) {
            System.out.println("Xếp loại 'Khá'");
        }else if (dtb >= 6 && dtb < 7) {
            System.out.println("Xếp loại 'Tiên tiến'");
        }else if (dtb >= 5 && dtb < 6) {
            System.out.println("Xếp loại 'Trung bình'");
        }else {
            System.out.println("Xếp loại 'Yếu'");
        }

    }
    // hàm tìm kiếm sinh viên DTB cao nhất trong danh sách
    public static SinhVien timKiemSinhVienCoDiemTrungBinhCaoNhat(List<SinhVien> danhSach){
        SinhVien svMax = danhSach.get(0);
        double diemMax = svMax.tinhDiemTrungBinh();
        for(int i = 1; i < danhSach.size(); i++){
            double dtb = danhSach.get(i).tinhDiemTrungBinh();
            if(dtb >= diemMax){
                diemMax = dtb;
                svMax = danhSach.get(i);
            }
        }
        return svMax;
    }
    // hàm xử lý liệt kê các sinh viên yêú
    public static void danhSachSinhVienXepLoaiYeu(List<SinhVien> xepLoaiYeu){
        System.out.println("-----Danh Sách Sinh Viên Xếp Loại Yếu-----");
        for(SinhVien  sv : xepLoaiYeu){
            if(sv.tinhDiemTrungBinh() < 5){
                System.out.println("Tên sinh viên: "+sv.getTenSV()+
                        " - MSSV: "+sv.getMaSV()+" - ĐTB: "+sv.tinhDiemTrungBinh());
            }
        }
    }
    // hàm xử lý tìm kiếm theo tên
    public static void timSinhVienTheoTen(List<SinhVien> danhSach, String tenCanTim){
        System.out.println("-----Kết quả tìm kiếm theo tên: " + tenCanTim + "-----");
        boolean timThay = false;
        for(SinhVien sv : danhSach){
            if(sv.getTenSV().equalsIgnoreCase(tenCanTim)){
                timThay = true;
                System.out.println("Tên sinh viên: "+sv.getTenSV()+
                        " - MSSV: "+sv.getMaSV()+" - ĐTB: "+sv.tinhDiemTrungBinh());
            }
        }
        if(!timThay){
            System.out.println("Không tìm thấy tên sinh viên nào có tên: "+tenCanTim);
        }
    }

    // hàm xử lý tìm kiếm theo mã
    public static void timMaSinhVien(List<SinhVien> danhSach, String maSinhVienCanTim){
        System.out.println("-----Kết quả tìm kiếm theo MSSV: "+maSinhVienCanTim + "-----");
        boolean timThay = false;
        for(SinhVien  sv : danhSach){
            if(sv.getMaSV().equalsIgnoreCase(maSinhVienCanTim)){
                timThay = true;
                System.out.println("Tên sinh viên: "+sv.getTenSV()+
                        " - MSSV: "+sv.getMaSV()+" - ĐTB: "+sv.tinhDiemTrungBinh());
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên nào có mã số: "+maSinhVienCanTim);
    }
    // hàm xử lý xóa theo mã
    public static void xoaSinhVienTheoMa(List<SinhVien> danhSach, String maCanXoa){
        boolean daxoa = false;
        for(int i = 0; i < danhSach.size(); i++){
            if(danhSach.get(i).getMaSV().equalsIgnoreCase(maCanXoa)){
                daxoa = true;
                System.out.println(">> Đã xóa sinh vien có MSSV: "+maCanXoa);
                break;
            }
        }
        if(!daxoa){
            System.out.println(">>Không tìm thấy sinh viên nào có MSSV: "+maCanXoa);
        }

    }


    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getLy() {
        return ly;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }
}
