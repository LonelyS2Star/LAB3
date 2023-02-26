/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2LAB3;

/**
 *
 * @author Ngoc Nhi
 */
public class book {
    private String boCode;
    private String boTitle;
    private String boAuthor;
        
    book(){
        boCode=null;
        boTitle=null;
        boAuthor=null;
    }
    
    public book(String boCode, String boTitle, String boAuthor){
            this.boCode =boCode;
            this.boTitle=boTitle;
            this.boAuthor=boAuthor;
    }
    book(book b){
        boCode=b.boCode;
        boTitle=b.boTitle;
        boAuthor=b.boAuthor;
    }

    public String getBoCode() {
        return boCode;
    }

    public String getBoTitle() {
        return boTitle;
    }

    public String getBoAuthor() {
        return boAuthor;
    }

    public void setBoCode(String boCode) {
        this.boCode = boCode;
    }

    public void setBoTitle(String boTitle) {
        this.boTitle = boTitle;
    }

    public void setBoAuthor(String boAuthor) {
        this.boAuthor = boAuthor;
    }

    @Override
    public String toString() {
        return "book{" + "boCode=" + boCode + ", boTitle=" + boTitle + ", boAuthor=" + boAuthor + '}';
    }

 
    
}