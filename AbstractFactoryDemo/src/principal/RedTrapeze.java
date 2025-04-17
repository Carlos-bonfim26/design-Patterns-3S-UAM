package principal;

public class RedTrapeze extends Trapeze {
    
    public RedTrapeze(float obliqueSides, float largeBase, float smallBase){
        super(obliqueSides, "Vermelho", largeBase, smallBase);
    }

    @Override
    public void draw(){
        System.out.println("Trapézio "+ getColor() + " e dos lados oblíquos de "+ getObliqueSides() + " base menor de "+ getSmallBase()+ " e base maior de "+ getLargeBase());
    }

}
