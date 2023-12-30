package childs;
import parents.Person;

public class Doctor extends Person {
    public String specialist;

    public Doctor(){
        // TODO
        super();
    }

    public Doctor(String nama, String address, String specialist){
        super(nama, address);
        this.specialist = specialist;
    }

    public void surgery(){
        System.out.println("I can surgery Operation Patient.");
    }

    public void greeting(){
        super.greeting(); //Harus pada line pertama body
        // System.out.println("Hello, My Name is "+ name);
        // System.out.println("I Come from "+ address);
        System.out.println("My Occupatons is a "+specialist+" Spesialist");
    }

}
