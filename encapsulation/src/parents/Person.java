package parents;

public class Person {
    private String name, address;

    public Person(){
        super();
    }

    public Person(String name, String address){
        super();
        this.name = name;
        this.address = address;
    }

    public void greeting(){
        System.out.println("Hello, My Name is "+ getName());
        System.out.println("I Come from "+ getAddress());
    }

    // Getter
    public String getName(){
        return this.name;
    }
    
    // Setter
    public void setName(String name){
        this.name = name;
    }

    // Getter
    public String getAddress(){
        return this.address;
    }
    
    // Setter
    public void setAddress(String address){
        this.address = address;
    }

}