package principal;

public class BlueTrapeze extends Trapeze{

    public BlueTrapeze(float obliqueSides, float largeBase, float smallBase){
        super(obliqueSides, "Azul", largeBase, smallBase);
    }

    @Override
    public void draw(){
        System.out.println("Trapézio "+ getColor() + " e dos lados oblíquos de "+ getObliqueSides() + " base menor de "+ getSmallBase()+ " e base maior de "+ getLargeBase());
    }
}
