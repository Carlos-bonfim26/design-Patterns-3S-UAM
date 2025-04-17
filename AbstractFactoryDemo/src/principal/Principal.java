/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

/**
 *
 * @author profslpa
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AbstractFactory blueFactory = FactoryProdutor.getFactory("AZUL");
        AbstractFactory greenFactory = FactoryProdutor.getFactory("Verde");
       
         blueFactory.getTrapeze(9, 6, 12).draw();

         greenFactory.getSquare(5).draw();

    }
    
}
