package principal;

public class GreenSquare extends Square{
    public GreenSquare(float side) {
        super(side, "Verde");
    }

    @Override
    public void draw() {
          System.out.println("Quadrado "+ getColor() + " e de lados "+ getSide());
    }
}
