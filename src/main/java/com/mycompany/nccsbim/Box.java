package com.mycompany.nccsbim;

/**
 * Create a class Box with attributes length, breadth and height. The class
 * contains method computeVolume() that computes the volume of box and return
 * the volume. Now, create two object of box and find volume and display it
 */
public class Box {

    public int leangth;
    public int breadth;
    public int height;

    // constructor
    public Box(int l, int b, int h) {
        this.leangth = l;
        this.breadth = b;
        this.height = h;
    }

    public static void main(String[] args) {
        Box _obj = new Box(10, 20, 35);
        var volumn = _obj.computeVolume();
        System.out.println("Total Volumn : " + volumn);
    }

    public int computeVolume() {
        var Volume = this.leangth * this.breadth * this.height;
        return Volume;
    }
}
