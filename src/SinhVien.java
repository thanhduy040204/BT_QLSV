
public class SinhVien {
    String name, Id;
    double toan,ly,hoa;

    public SinhVien(String name, String Id,double toan,double ly,double hoa) {
        this.name = name;
        this.Id = Id;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;

    }




    public double tinhDiemTrungBinh(){
        return (toan + ly + hoa) / 3;
    }

    public String xepLoai(){
        double dtb = tinhDiemTrungBinh();
        if(dtb >= 9){
            return "Xuất sắc";
        }else if (dtb >= 8 && dtb < 9){
            return "Giỏi";
        }else if (dtb >= 7 && dtb < 8){
            return "Khá";
        } else if (dtb >= 6  && dtb < 7) {
            return "Trung Bình";
        }else {
            return "Yếu";
        }
    }

    public void hienThiThongTin(){
        System.out.println("Tên của bạn là: "+name);
        System.out.println("Mã số sinh viên là: "+Id);
        System.out.println("Điểm môn toán: "+toan);
        System.out.println("Điểm môn lý: "+ly);
        System.out.println("Điểm môn hóa: "+hoa);
        System.out.println("Điểm trung bình: "+tinhDiemTrungBinh());
        System.out.println("Xếp loại: "+xepLoai());
    }
}
