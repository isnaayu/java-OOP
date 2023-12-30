public class Person {

    String name, address;
    final String country = "Indonesia";

    // Dalam Satu kelas bisa terdapat beberapa parameter.
    // Dengan Syarat harus memiliki nilai Parameter yang berbeda.
    // Constructor Default
    Person() {

    }

    // Constructor satu Parameter
    Person(String paramName){
        name = paramName;
    }

    // VARIABLE SHADOWING
    Person(String name, String address){
        // name = name;  //Field ini tidak akan berubah datanya karena Shadowing, 
        // // memiliki nama parameter dan field yang sama sehingga ambigu
        // address = address; //Field ini tidak akan berubah datanya karena Shadowing

        // Gunakan This untuk mengatasi Variabel Shadowing;
        this.name = name;
        this.address = address;
    }

    // Constructor dua parameter
    // Person(String paramName, String paramAddress){
    //     this(paramName);
    //     address = paramAddress;
    // }



    void sayHello(String paramName){
        System.out.println("Hello "+paramName+ ", My Name is "+ name + ".");
    }

    // Return Value ( Mengembalikan Nilai)
    String sayAddres(){
        return "I, come from "+address+".";
    }
}