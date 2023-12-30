public class MainApp {
    public static void main(String[] args){

        // Constructor dengan nilai default
        Person person1 = new Person();
        person1.name = "Isna Ayu";
        person1.address = "Tuban";
        person1.sayHello("Padepokan79");
        System.out.println(person1.sayAddres());

        // Constructor dengan 1 Parameter.
        Person person2 = new Person("Isna Ayu M.");
        person2.address = "Tuban, Jatim";
        person2.sayHello("Padepokan79");
        System.out.println(person2.sayAddres());

        // Constructor dengan 2 Parameter
        Person person3 = new Person("Isna Ayu Muarofah", "Tuban, Jatim");
        person3.sayHello("Padepokan79");
        System.out.println(person3.sayAddres());


        // Latihan 1
        // Person person1 = new Person();
        // person1.name = "Isna";
        // person1.address = "Tuban";

        // System.out.println(person1.name);
        // System.out.println(person1.address);
        // System.out.println(person1.country);

        // latihan 2
        // person1.sayHello("Padepokan79");

        // Latihan 3
        // Person person2 = new Person();
        // person2.sayHello("Padepokan79");

        // Latihan 4
        // Person person2 = new Person();
        // person2.name = "Isna Ayu";
        // person2.address = "Tuban";
        // person2.sayHello("Padepokan79");
        // System.out.println(person2.sayAddres());
        
    }
}
