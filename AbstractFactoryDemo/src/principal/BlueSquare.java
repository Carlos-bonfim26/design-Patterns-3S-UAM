/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author profslpa
 */
public class BlueSquare extends Square{

    public BlueSquare(float side) {
        super(side, "Azul");
        
    }

    @Override
    public void draw() {
        System.out.println("Quadrado "+ getColor() + " e de lados "+ getSide());
    }
    
}
