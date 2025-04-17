/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author carlos bonfim
 */
public abstract class AbstractFactory {
    public abstract Shape getCircle(float radius);
    
    public abstract Shape getRectangle(float base, float height);
    
    public abstract Shape getSquare(float side);

    public abstract Shape getTrapeze(float obliqueSides, float largeBase, float smallBase);
}
