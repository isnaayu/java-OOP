package childs;
import parents.Person;

public class Programmer extends Person{
    private String technology;

    public Programmer(){
        // TODO
    }

    public Programmer(String name, String address, String technology){
        super(name, address);
        this.technology = technology;
    }

    public void hack(){
        System.out.println("I can Hacking a Website");
    }

    public void coding(){
        System.out.println("I can create a application using a technology : "+getTechnology()+".");
    }
    
    public void greeting(){
        super.greeting();
        // System.out.println("Hello, My Name is "+ name);
        // System.out.println("I Come from "+ address);
        System.out.println("My Job is a "+getTechnology()+" Programmer");
    }

    // Getter
    public String getTechnology(){
        return this.technology;
    }

    // Setter
    public void setTechnology(String technology){
        this.technology = technology;
    }
}
