/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author profslpa
 */
public class FactoryProdutor {
    public static AbstractFactory getFactory(String color) {
        if (color.equalsIgnoreCase("AZUL")) {
            return new BlueShapeFactory();
        } else if (color.equalsIgnoreCase("VERMELHO")) {
            return new RedShapeFactory();
        } else if(color.equalsIgnoreCase("Verde")){
            return new GreenShapeFactory();
        }
        else {
            return null;
        }
    }
}
