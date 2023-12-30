public class Programmer extends Person{
    String technology;

    public Programmer(){
        // TODO
    }

    public Programmer(String name, String address, String technology){
        super(name, address);
        this.technology = technology;
    }

    void hack(){
        System.out.println("I can Hacking a Website");
    }

    void coding(){
        System.out.println("I can create a application using a technology : "+technology+".");
    }
    
    void greeting(){
        super.greeting();
        // System.out.println("Hello, My Name is "+ name);
        // System.out.println("I Come from "+ address);
        System.out.println("My Job is a "+technology+" Programmer");
    }
}
