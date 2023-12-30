package main;

import childs.Item;
import parents.Products;

public class App {
    public static void main(String[] args){
        // Products produksi1 = new Products(); // Tidak dapat langsng di instansiasi melalui object karena Class Product adalah abstract
        Products produksi2 = new Item(); //Dapat Membuat object Class Products dengan Instansiasi Class Item.

    }

    
}
