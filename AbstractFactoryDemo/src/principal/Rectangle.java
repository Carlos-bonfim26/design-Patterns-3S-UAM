/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author profslpa
 */
public abstract class Rectangle extends Shape{
    private float base;
    private float height;

    public Rectangle(float base, float height, String color) {
        super(color);
        this.base = base;
        this.height = height;
    }
   

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    
}
