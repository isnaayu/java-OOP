public class Doctor extends Person {
    String specialist;

    public Doctor(){
        // TODO
        super();
    }

    public Doctor(String nama, String address, String specialist){
        super(nama, address);
        this.specialist = specialist;
    }

    void surgery(){
        System.out.println("I can surgery Operation Patient.");
    }

    void greeting(){
        super.greeting(); //Harus pada line pertama body
        // System.out.println("Hello, My Name is "+ name);
        // System.out.println("I Come from "+ address);
        System.out.println("My Occupatons is a "+specialist+" Spesialist");
    }

}
