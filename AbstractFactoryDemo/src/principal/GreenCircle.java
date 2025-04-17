package principal;

public class GreenCircle extends Circle{
    
    public GreenCircle(float radios) {
        super(radios, "Verde");
    }

    @Override
    public void draw() {
           System.out.println("Circulo " + getColor()+ " e raio "+ getRadios()) ;
    }
}
