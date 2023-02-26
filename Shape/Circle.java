/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shape;

/**
 *
 * @author Ngoc Nhi
 */
public class Circle {
    private float banKinh;
    private float pi=3.14f;
    private float chuVi;
    private float dienTich;
    
    public Circle(float banKinh){
            this.banKinh=banKinh;
    }

    public float getChuVi() {
        return chuVi;
    }

     public float getDienTich() {
        return dienTich;
    }
   
    public void tinhChuVi() {
        chuVi = 2 * pi * banKinh;
    }
    public void tinhDienTich() {
        dienTich = pi * banKinh * banKinh;
    }
    
            
}
