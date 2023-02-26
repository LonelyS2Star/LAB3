/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuongNhanVien;

/**
 *
 * @author Ngoc Nhi
 */
public class main{  
    public static void main(String[] args) {
        NhanVien nv=new NhanVien("Nguyen Van A",120,2,100000000);

        System.out.println(nv.tangLuong(5));
        System.out.println(nv.getHeSoLuong());
        System.out.println(nv.tinhLuong());

    }
}