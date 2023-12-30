package parents;

public abstract class Shape {
    private String color;

    public Shape(){
        // TODO
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    // Abstract method getArea()
    public abstract double getArea();
    
}