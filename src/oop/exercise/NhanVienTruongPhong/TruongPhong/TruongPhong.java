package oop.exercise.NhanVienTruongPhong.TruongPhong;

import oop.exercise.NhanVienTruongPhong.NhanVien.NhanVien;

public class TruongPhong extends NhanVien {
    public double trachNhiem;
    public TruongPhong (String hoTen, double luong, double trachNhiem){}
    public void xuat(){
        super.hoTen = "Tuấn";
        super.luong = 500;
        super.xuat();
        double thuNhap = super.getThuNhap();
    }
}