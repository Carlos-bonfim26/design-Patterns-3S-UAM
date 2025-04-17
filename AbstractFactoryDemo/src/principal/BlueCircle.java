/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author profslpa
 */
public class BlueCircle extends Circle{

    public BlueCircle(float radios) {
        super(radios,"Azul");
    }

    @Override
    public void draw() {
        System.out.println("Circulo " + getColor()+ " e raio "+ getRadios()) ;
    }
    
}
