package com.mycompany.nccsbim;

public class ProductDemo {

    public static void main(String[] args)
    {
        Product _obj = new Product("laptop", 2, 13000);
        var total = _obj. getTotal();
        System.out.println("Total : " + total );    
    }
}
