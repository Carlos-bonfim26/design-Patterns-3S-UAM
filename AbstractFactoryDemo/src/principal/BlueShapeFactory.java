/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author profslpa
 */
public class BlueShapeFactory extends AbstractFactory {

    @Override
    public Shape getCircle(float radius) {
        return new BlueCircle(radius);
    }

    @Override
    public Shape getRectangle(float base, float height) {
        return new BlueRectangle(base, height);
    }

    @Override
    public Shape getSquare(float side) {
        return new BlueSquare(side);
    }

    @Override
    public Shape getTrapeze(float obliqueSides, float largeBase, float smallBase){
        return new BlueTrapeze(obliqueSides, largeBase, smallBase);
    }
}