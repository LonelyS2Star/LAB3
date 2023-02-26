/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTVector;

/**
 *
 * @author Ngoc Nhi
 */
public class main {
    public static void main(String[] args) {
        VecTo vt= new VecTo(1,2,3);
        vt.mul(vt);
        System.out.println(vt.getX()+" "+vt.getY()+" "+vt.getZ());
    }

}
