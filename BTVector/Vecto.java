/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTVector;

/**
 *
 * @author Ngoc Nhi
 */
public class VecTo {
    private int x;
    private int y;
    private int z;

    public VecTo() {
        x=0;
        y=0;
        z=0;
    }

    public VecTo(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public VecTo(VecTo vt) {
        x=vt.x;
        y=vt.y;
        z=vt.z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    public VecTo add(VecTo a){
        x+=a.x;
        y+=a.y;
        z+=a.z;
        return new VecTo(x,y,z);
    }
    public VecTo sub(VecTo a){
        x-=a.x;
        y-=a.y;
        z-=a.z;
        return new VecTo(x,y,z);
    }
    public VecTo mulK(float k){
        x*=k;
        y*=k;
        z*=k;
        return new VecTo(x,y,z);
    }
    public VecTo mul(VecTo a){
        x*=a.x;
        y*=a.y;
        z*=a.z;
        return new VecTo(x,y,z);
    }
}
