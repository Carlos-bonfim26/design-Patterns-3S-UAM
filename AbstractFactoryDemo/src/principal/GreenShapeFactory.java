package principal;

public class GreenShapeFactory extends AbstractFactory{
    @Override
    public Shape getCircle(float radius) {
        return new GreenCircle(radius);
    }

    @Override
    public Shape getRectangle(float base, float height) {
        return new GreenRectangle(base, height);
    }

    @Override
    public Shape getSquare(float side) {
        return new GreenSquare(side);
    }
    @Override
    public Shape getTrapeze(float obliqueSides, float largeBase, float smallBase){
        return new GreenTrapeze(obliqueSides, largeBase, smallBase);
    }
}
