/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author profslpa
 */
public class RedShapeFactory extends AbstractFactory{
    @Override
    public Shape getCircle(float radius) {
        return new RedCircle(radius);
    }

    @Override
    public Shape getRectangle(float base, float height) {
        return new RedRectangle(base, height);
    }

    @Override
    public Shape getSquare(float side) {
        return new RedSquare(side);
    }
    @Override
    public Shape getTrapeze(float obliqueSides, float largeBase, float smallBase){
        return new RedTrapeze(obliqueSides, largeBase, smallBase);
    }
}
