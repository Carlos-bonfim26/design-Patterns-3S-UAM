package principal;

public class GreenRectangle extends Rectangle{
    
    public GreenRectangle(float base, float height) {
        super(base, height, "Verde");
    }

    @Override
    public void draw() {
       System.out.println("Retangulo " + getColor() + " e altura de " + getHeight() + "cm e base "+getBase());
    }
}
