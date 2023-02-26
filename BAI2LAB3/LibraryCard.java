/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2LAB3;

/**
 *
 * @author Ngoc Nhi
 */
public class LibraryCard {
    private long lbCode;
    private String owner;
    private int borrowCount;
    
    public LibraryCard(){
        this.lbCode = 0;
        this.owner = null;
        this.borrowCount = 0;
    }
    
    public LibraryCard(long lbCode, String owner, int borrowCount){
        this.lbCode = lbCode;
        this.owner = owner;
        this.borrowCount = borrowCount;
    }
    
    public long getLbCode(){
        return this.lbCode;
    }
    
    public String getOwner(){
        return this.owner;
    }
    
    public int getBorrowCount(){
        return this.borrowCount;
    }
    
    public void setLbCode(long code){
        this.lbCode = code;
    }
    
    public void setOwner(String owner){
        this.owner = owner;
    }
    
    public void checkOut(int num){
        this.borrowCount = num;
    }
    
    @Override
    public String toString(){
        return "Code: " + this.lbCode + ", Owner: " + this.owner + ", BorrowCount: " + this.borrowCount;
    }

}
