
package factorypatterndemo;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        
        Shape shape1 = shapeFactory.getShape("circle");
        Shape shape2 = shapeFactory.getShape("rectangle");
        Shape shape3 = shapeFactory.getShape("square");
        
        shape1.draw();
        System.out.println("");
        shape2.draw();
        System.out.println("");
        shape3.draw();
    }
    
}
