package childs;

import parents.Products;

public class Item extends Products {
    private int price;

    public Item(){
        // TODO
    }

    public Item(String name, int price){
        super(name);
        this.price = price;
    }

    public void printInformation(){
        System.out.println("Product name : "+getName);
        System.out.println("Product nama : "+getPrice);
    } 

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this price = price;
    }
}
