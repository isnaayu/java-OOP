package main;
import childs.Doctor;
import childs.Programmer;
import childs.Teacher;
import parents.Person;

// ACCESS MODIFIER
/*  default : same class, same package sub class(child), same package non-sub class
 *  private : Same Class
 *  protected : same class, same package sub class(child), same package non-sub class, Different package sub class
 *  public : (Hampir semua) same class, same package sub class(child), same package non-sub class, Different package sub class, Different package non-sub class
 */

/* SETTER AND GETTER
 * GETTER digunakan untuk mengambil data field
 * SETTER digunakan untuk mengubah data field
 * 
 * Tipe Data Boolean
 * GETTER
 * // Getter
    public boolean getName(){
        return this.name;
    }
    
    // Setter
    public void setName(boolean name){
        this.name = name;
    }
 *  
 * Tipe Data Object
 * // Getter
    public String getName(){
        return this.name;
    }
    
    // Setter
    public void setName(String name){
        this.name = name;
    }
 * 
 * Tipe Data Primitif (Integer)
 * // Getter
    public int getName(){
        return this.name;
    }
    
    // Setter
    public void setName(int name){
        this.name = name;
    }
 * 
 */

public class App {
    public static void main(String[] args){
        // pembuatan Object
        Person person1 = new Person();
        // person1.name = "Isna Ayu"; // Salah, Error karena field name private
        person1.setName("Isna Ayu"); //Benar
        person1.setAddress("Tuban");

        // System.out.println(person1.name); //Salah, Error karena field name private
        System.out.println(person1.getName()); //benar


        // POLYMORPHISM
        // Person person1 = new Programmer("Isna Ayu", "Tuban", "Python");
        // Person person2 = new Doctor("Andi", "Jakarta", "Pedestarians");
        // Person person3 = new Teacher("Widia", "Tangerang", "Matematika");

        // sayHello(person1);
        // sayHello(person2);
        // sayHello(person3);


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
            messages = "Hello, Saya "+programmer.getName()+" adalah Programmer "+programmer.getTechnology()+".";
        }else if (person instanceof Doctor) {
            Doctor doctor = (Doctor)person;
            messages = "Hello, Saya "+doctor.getName()+" Dokter Spesialist "+doctor.getSpecialist();
        }else if (person instanceof Teacher) {
            Teacher teacher = (Teacher)person;
            messages = "Hello, Saya "+teacher.getName()+" Adalah Seorang Guru "+teacher.getSubject();
        }else{
            messages = "Hello, Saya Adalah Seorang ...";
        }
        System.out.println(messages);
    }
}
