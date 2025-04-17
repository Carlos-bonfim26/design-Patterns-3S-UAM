package principal;

public class GreenTrapeze extends Trapeze{
    public GreenTrapeze(float obliqueSides, float largeBase, float smallBase){
        super(obliqueSides, "Verde", largeBase, smallBase);
    }

    @Override
    public void draw(){
        System.out.println("Trapézio "+ getColor() + " e dos lados oblíquos de "+ getObliqueSides() + " base menor de "+ getSmallBase()+ " e base maior de "+ getLargeBase());
    }
}
