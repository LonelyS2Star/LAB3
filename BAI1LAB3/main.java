/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1LAB3;

/**
 *
 * @author Ngoc Nhi
 */
public class main {
    public static void main(String[] args){
        Triangle triangleOne = new Triangle();
        
        triangleOne.width = 152;
        triangleOne.hegth = 163;
        triangleOne.setHegth(167);
        triangleOne.setWidth(170);
        
       // System.out.println("Chieu rong: " + triangleOne.width);
       // System.out.println("Chieu cao: " + triangleOne.hegth); 
        
       // System.out.println("Chieu rong: " + triangleOne.getWidth());
        //System.out.println("Chieu cao: " + triangleOne.getHeght());
            Fraction f= new Fraction(1,20);
            Fraction a=new Fraction(f);
            Fraction b=f.reduce();
            System.out.println(a.getDenominator());
            System.out.println(b.getNumerator()+"/"+b.getDenominator()); 
    }
    
}
