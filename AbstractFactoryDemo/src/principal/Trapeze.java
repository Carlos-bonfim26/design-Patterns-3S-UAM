package principal;

public abstract class Trapeze extends Shape{
    private float obliqueSides;
    private float largeBase;
    private float smallBase;

    public Trapeze(float obliqueSides, String color, float largeBase, float smallBase) {
        super(color);
        this.obliqueSides = obliqueSides;
        this.largeBase = largeBase;
        this.smallBase = smallBase;
    }

    public float getObliqueSides(){
        return obliqueSides;
    }
    public void setObliqueSides(float obliqueSides){
        this.obliqueSides = obliqueSides;
    }

    public float getLargeBase(){
        return largeBase;
    }
    public void setLargeBase(float largeBase){
        this.largeBase = largeBase;
    }

    public float getSmallBase(){
        return smallBase;
    }
    public void setSmallBase(float smallBase){
        this.smallBase = smallBase;
    }

    
}
