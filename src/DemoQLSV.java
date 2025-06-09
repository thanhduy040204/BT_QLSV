import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DemoQLSV {
    public static void main(String[] args) {
        // tạo 1 danh sách sinh viên rỗng
        List<SinhVien> danhSachSinhVien = new ArrayList<SinhVien>();
        Scanner sc = new Scanner(System.in);
        //cho người dùng nhập số lượng sinh viên
        System.out.println("Số lượng sinh viên cần nhập: ");
        int soLuong = Integer.parseInt(sc.nextLine());
        // vòng for sẽ lặp cho đến khi đủ số lượng sinh viên người dùng cần
        for(int i = 0; i < soLuong; i++) {
            SinhVien sv = new SinhVien();
            sv.nhapThongTinSinhVien();
            danhSachSinhVien.add(sv);
        }
        //dùng forEach để lặp điểm trung bình và xếp loại của từng sinh viên
        danhSachSinhVien.forEach(item ->{
            item.tinhDiemTrungBinh();
            item.inThongTinVaXepLoai();
        });
        //Sinh viên có ĐTB lớn nhất
        SinhVien svMax = SinhVien.timKiemSinhVienCoDiemTrungBinhCaoNhat(danhSachSinhVien);
        System.out.println("==> Sinh viên có đểm trung bình cao nhất là: "+svMax.getTenSV()+
                " - MSSV: "+svMax.getMaSV()+" - Điểm trung bình là: "+svMax.tinhDiemTrungBinh());
        //Danh sách sinh viên xếp loại yếu
        SinhVien.danhSachSinhVienXepLoaiYeu(danhSachSinhVien);
        //tra cứu tên sinh viên
        System.out.println("Nhập tên sinh viên cần tìm: ");
        String tenCanTim = sc.nextLine();
        SinhVien.timSinhVienTheoTen(danhSachSinhVien, tenCanTim);
        //tra cứu MSSV
        System.out.println("Nhập mã sinh viên cần tìm: ");
        String maCanTim = sc.nextLine();
        SinhVien.timMaSinhVien(danhSachSinhVien, maCanTim);
        // Xóa sinh viên theo yêu cầu
        System.out.println("Nhập mã số sinh viên cần xóa: ");
        String maCanXoa = sc.nextLine();
        SinhVien.xoaSinhVienTheoMa(danhSachSinhVien, maCanXoa);
    }
}
