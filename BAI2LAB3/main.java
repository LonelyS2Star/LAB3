/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2LAB3;

/**
 *
 * @author Ngoc Nhi
 */
public class main {
    public static void main(String[] args) {
//        Student st=new Student();
//        st.setStID("abc");
//        System.out.println(st.toString());
          book b=new book("nguyen","van","a");
          book c=new book(b);
          System.out.println(c.getBoAuthor()+c.getBoCode());
    }
}