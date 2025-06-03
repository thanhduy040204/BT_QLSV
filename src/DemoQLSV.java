import java.util.Scanner;

public class DemoQLSV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tên của bạn: ");
        String name = sc.nextLine();

        System.out.println("Nhập mã số sinh viên: ");
        String id = sc.nextLine();

        System.out.println("Nhập điểm môn toán: ");
        double math = Double.parseDouble(sc.nextLine());

        System.out.println("Nhập điểm môn lý: ");
        double ly = Double.parseDouble(sc.nextLine());

        System.out.println("Nhập điểm môn hóa: ");
        double hoa = Double.parseDouble(sc.nextLine());

        SinhVien sv = new SinhVien(name,id,math,ly,hoa);
        System.out.println("-----KẾT QUẢ-----");
        sv.hienThiThongTin();

    }
}
