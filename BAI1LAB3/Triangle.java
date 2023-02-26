/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1LAB3;

/**
 *
 * @author Ngoc Nhi
 */
public class Triangle {
    public float width=0.0f;
    public float hegth=0.0f;
    
    Triangle(){
        this.width=0;
        this.hegth=0;
    };
    Triangle(float width,float hegth){
        this.width=width;
        this.hegth=hegth;
    };
    //SETTER
    public void setWidth(float width){
        this.width=width;
    }
    public void setHegth(float hegth){
        this.hegth=hegth;
    }
    //GETTER
    public float getWidth(){
            return this.width;
    }
    public float getHeght(){
        return this.hegth;
    }
    @Override
    public String toString() {
        return "Triangle{" + "width=" + width + ", hegth=" + hegth + '}';
    }


    
 
}

