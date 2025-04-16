package prototypepatterndemo;

public class PrototypePatternDemo {

    public static void main(String[] args) throws CloneNotSupportedException {
        ShapeCache.loadCache();
        
        Shape clonedShape1 = (Shape) ShapeCache.getShape("1");
        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        Shape cloenedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape: " + clonedShape1.getType());
        System.out.println("Shape: " + clonedShape2.getType());

        System.out.println("Shape: " + cloenedShape3.getType());
    }
    
}
