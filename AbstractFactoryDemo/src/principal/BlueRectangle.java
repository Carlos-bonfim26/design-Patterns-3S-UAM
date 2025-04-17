/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author profslpa
 */
public class BlueRectangle extends Rectangle{

    public BlueRectangle(float base, float height) {
        super(base, height,"Azul");
    }

    @Override
    public void draw() {
        System.out.println("Retangulo " + getColor() + " e altura de " + getHeight() + "cm e base "+getBase());
    }
    
}
