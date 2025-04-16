package prototypepatterndemo;

public abstract class Shape implements Cloneable {
    private String id;
    public String type;

    public abstract void draw(); 
    
    public String getId() {return id;}
    public void setId(String id) {this.id = id;}
    public String getType() {return type;}
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
