public class Teacher extends Person {
    String subject;

    public Teacher(){
        // TODO
    }

    public Teacher(String name, String address, String subject){
        super(name, address);
        this.subject = subject;
    }

    void subject(){
        System.out.println("Hi I can teach "+ subject+ "So, anyone to learn can talk to me.");
    }

    void greeting(){
        super.greeting();
        // System.out.println("Hello, My Name is "+ name);
        // System.out.println("I Come from "+ address);
        System.out.println("My job is a "+subject+" Teacher.");
    }
}
