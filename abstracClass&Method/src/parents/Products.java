package parents;

public abstract class Products {
    private String name;

    public Products(){
        // TODO
    }

    public Products(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setname(String name){
        this.name = name;
    }

    // ABSTRACT METHOD
    public abstract void printInformation();
}
