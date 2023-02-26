/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuongNhanVien;
import java.util.Scanner;
/**
 *
 * @author Ngoc Nhi
 */
public class NhanVien {
    public String tenNhanVien;
    public double luongCoBan;
    public double heSoLuong; 
    public double luongMax;
    public double Luong;
    
    public NhanVien() {
        tenNhanVien=null;
        luongCoBan=0;
        heSoLuong=0;
        luongMax=0;
    }

    public NhanVien(String tenNhanVien,double luongCoBan,double heSoLuong,double luongMax){
    this.tenNhanVien=tenNhanVien;
    this.luongCoBan=luongCoBan;
    this.heSoLuong=heSoLuong;
    this.luongMax=luongMax;
 
    }
    public NhanVien(double Luong) {
        Luong = luongCoBan * heSoLuong;    
    }
    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public double getLuongCoban() {
        return luongCoBan;
    }

    public void setLuongCoban(double luongCoban) {
        this.luongCoBan = luongCoban;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double getLuongMax() {
        return luongMax;
    }

    public void setLuongMax(double luongMax) {
        this.luongMax = luongMax;
    }
    
    public void inTTin(){
        System.out.println("Ten nhan vien: "+tenNhanVien);
        System.out.println("Luong co ban: "+luongCoBan);
        System.out.println("He so luong: "+heSoLuong);
        System.out.println("Luong Max: "+ luongMax);
    }
    
    public boolean tangLuong(double a){
        if(((heSoLuong+a)*luongCoBan)>luongMax){
            System.out.println("He so luong khong hop le!!");
            return false;
        } else {
            heSoLuong+=a;
            return true;
        }

    }
    public double tinhLuong(){
        return luongCoBan*heSoLuong;
    }
    
}
