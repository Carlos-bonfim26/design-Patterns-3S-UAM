/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author profslpa
 */
public class RedSquare extends Square{

    public RedSquare(float side) {
        super(side, "Vermelho");
    }

    @Override
    public void draw() {
          System.out.println("Quadrado "+ getColor() + " e de lados "+ getSide());
    }
    
}
