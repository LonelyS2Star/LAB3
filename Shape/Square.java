/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shape;

public class Square {
    private int DoDaiCanh;
    private String MauSac;

    public Square() {
        DoDaiCanh=0;
        MauSac=null;
    }

    public Square(int DoDaiCanh, String MauSac) {
        this.DoDaiCanh = DoDaiCanh;
        this.MauSac = MauSac;
    }
    public Square(Square sq){
        DoDaiCanh=sq.DoDaiCanh;
        MauSac=sq.MauSac;
    }

    public int getDoDaiCanh() {
        return DoDaiCanh;
    }

    public void setDoDaiCanh(int DoDaiCanh) {
        this.DoDaiCanh = DoDaiCanh;
    }

    public String getMauSac() {
        return MauSac;
    }

    public void setMauSac(String MauSac) {
        this.MauSac = MauSac;
    }

    public float S(){
        return DoDaiCanh*DoDaiCanh;
    }
    @Override
    public String toString(){
        return "Do dai canh: "+DoDaiCanh+" mau: "+MauSac;
    }


}
