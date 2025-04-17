/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author profslpa
 */
public class RedCircle extends Circle{

    public RedCircle(float radios) {
        super(radios, "Vermelho");
    }

    @Override
    public void draw() {
           System.out.println("Circulo " + getColor()+ " e raio "+ getRadios()) ;
    }
    
}
