package parents;

public class Person {
    public String name, address;

    public Person(){
        super();
    }

    public Person(String name, String address){
        super();
        this.name = name;
        this.address = address;
    }

    public void greeting(){
        System.out.println("Hello, My Name is "+ name);
        System.out.println("I Come from "+ address);
    }

}