public class App {
    public static void main(String[] args){

        // POLYMORPHISM
        Person person1 = new Programmer("Isna Ayu", "Tuban", "Python");
        Person person2 = new Doctor("Andi", "Jakarta", "Pedestarians");
        Person person3 = new Teacher("Widia", "Tangerang", "Matematika");

        sayHello(person1);
        sayHello(person2);
        sayHello(person3);



        // POLYMORPHISM
        // Person person = new Programmer("Isna Ayu", "Tuban", ".Net Core");
        // person.greeting();

        // System.out.println(person.technology); //ERROR
        // CONVERTION
        // System.out.println(((Programmer)person).technology); //Cara yang benar

        // Doctor doctor1 = new Doctor();
        // doctor1.name = "Isna Ayu M";
        // doctor1.address = "Tuban";
        // doctor1.specialist = "Dentist";

        // Doctor doctor2 = new Doctor("Andi", "Jakarta", "Cardiologist");

        // doctor1.greeting();
        // System.out.println();
        // doctor2.greeting();


        // Person person1 = new Person();
        // person1.name = "Isna Ayu";
        // person1.address = "Tuban";

        // Doctor doctor1 = new Doctor();
        // doctor1.name = "Agus";
        // doctor1.address = "Bandung";
        // doctor1.specialist = "Dentis";

        // Programmer programmer1 = new Programmer();
        // programmer1.name = "Sulis";
        // programmer1.address = "Jakarta";
        // programmer1.technology = "Javascript";

        // Teacher teacher1 = new Teacher();
        // teacher1.name = "Halim";
        // teacher1.address = "Tangerang";
        // teacher1.subject = "Matematika";

        // person1.greeting();
        // System.out.println();

        // doctor1.greeting();
        // System.out.println();

        // programmer1.greeting();
        // System.out.println();

        // teacher1.greeting();
        // System.out.println();

    }

    static void sayHello(Person person){
        String messages;
        if (person instanceof Programmer) {
            Programmer programmer = (Programmer)person;
            messages = "Hello, Saya "+programmer.name+" adalah Programmer "+programmer.technology+".";
        }else if (person instanceof Doctor) {
            Doctor doctor = (Doctor)person;
            messages = "Hello, Saya "+doctor.name+" Dokter Spesialist "+doctor.specialist;
        }else if (person instanceof Teacher) {
            Teacher teacher = (Teacher)person;
            messages = "Hello, Saya "+teacher.name+" Adalah Seorang Guru "+teacher.subject;
        }else{
            messages = "Hello, Saya Adalah Seorang ...";
        }
        System.out.println(messages);
    }
}
