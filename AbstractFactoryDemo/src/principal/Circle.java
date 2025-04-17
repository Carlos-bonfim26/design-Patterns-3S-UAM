/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author profslpa
 */
public abstract class Circle extends Shape{

   private float radios;

    public Circle(float radios, String color) {
        super(color);
        this.radios = radios;
    }

    public float getRadios() {
        return radios;
    }

    public void setRadios(float radios) {
        this.radios = radios;
    }
    
}
