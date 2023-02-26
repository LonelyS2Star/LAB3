/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2LAB3;

/**
 *
 * @author Ngoc Nhi
 */
public class student {
    private String stID;
    private String stName;
    private String stClass;
    
public student(){
        stID=null;
        stName=null;
        stClass=null;
    }
    public student(String  stID, String stName, String stClass){
            this.stID=stID;
            this.stName=stName;
            this.stClass=stClass;
    }
   public student(student s){
        this.stID=s.stID;
        this.stName=s.stName;
        this.stClass=s.stClass;
    }
    public String getstID() {
    return stID;
    }
    public String getstName() {
        return stName; 
    }
    public String getstClass() {
        return stClass;
    }
    private void setstID(String stID){
        this.stID=stID;
    }
    private void setstName(String stName){
        this.stName=stName;
                }
    private void setstClass(String stClass){
        this.stClass=stClass;
    }

    public String toString() {
        return "student{" + "stID=" + stID + ", stName=" + stName + ", stClass=" + stClass + '}';
    }
}