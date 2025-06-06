import java.util.Scanner;

public class DemoQLSV {
    public static void main(String[] args) {
//
//        /*  CÁCH GIẢI 1*/
//        //tạo ra danh sách sinh viên rỗng
//        List<SinhVien> listSinhVien = new ArrayList<SinhVien>();
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Số lượng sinh viên muốn nhập: ");
//        int soLuong = Integer.parseInt(sc.nextLine());
//        for(int i = 0; i < soLuong; i++) {
//            SinhVien sinhVien = new SinhVien();
//
//            System.out.println("Nhập tên sinh vien: ");
//            sinhVien.setTenSV(sc.nextLine());
//
//            System.out.println("Nhập mã sinh viên: ");
//            sinhVien.setMaSV(sc.nextLine());
//
//            System.out.println("Nhập điểm môn toán: ");
//            sinhVien.setToan(Double.parseDouble(sc.nextLine()));
//
//            System.out.println("Nhập điểm môn lý: ");
//            sinhVien.setLy(Double.parseDouble(sc.nextLine()));
//
//            System.out.println("Nhập điểm môn hóa: ");
//            sinhVien.setHoa(Double.parseDouble(sc.nextLine()));
//
//            listSinhVien.add(sinhVien);
//        }
//        //foreach: Tự đọng duyệt hết mảng
//        //cú pháp: for(Biến_đại_diện_cho_phần_tử_duyệt qua : mảng_Cần_duyệt)
//        //cách 1
//        for(SinhVien item : listSinhVien){
//            System.out.println("Tên sinh viên: "+item.getTenSV());
//            double dtb = ((item.getToan()) + item.getLy() + item.getHoa()) / 3;
//            System.out.println("Điểm trung bình: "+dtb);
//        }
//
//        //cách 2 dùng foreach
////        listSinhVien.forEach(item->{
////            System.out.println("Tên sinh viên: "+item.getTenSV());
////            double dtb = ((item.getToan()) + item.getLy() + item.getHoa()) / 3;
////            System.out.println("Điểm trung bình: "+dtb);
////        });
//

        /* CÁCH GIẢI 2*/
        List<SinhVien> listSinhVien = new ArrayList<SinhVien>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tên của bạn: ");
        String name = sc.nextLine();

        System.out.println("Nhập mã số sinh viên: ");
        String id = sc.nextLine();

        System.out.println("Nhập điểm môn toán: ");
        double toan = Double.parseDouble(sc.nextLine());

        System.out.println("Nhập điểm môn lý: ");
        double ly = Double.parseDouble(sc.nextLine());

        System.out.println("Nhập điểm môn hóa: ");
        double hoa = Double.parseDouble(sc.nextLine());

        SinhVien sv = new SinhVien(name,id,toan,ly,hoa);
        System.out.println("-----KẾT QUẢ-----");
        sv.hienThiThongTin();

    }
}
