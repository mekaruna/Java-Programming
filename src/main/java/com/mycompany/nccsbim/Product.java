package com.mycompany.nccsbim;

public class Product {
    public String name;
    public int qty;
    public int price;
    
    public Product(String n, int q , int p)
    {
        this.name=n;
        this.qty=q;
        this.price=p;
    }

    public String getName()
    {
        return this.name;
    }
    
    public int getPrice()
    {
        return this.price;
    }
    
    public int getQty()
    {
        return this.qty;
    }

    public int getTotal()
    {
        return this.qty*this.price;
    }
}

