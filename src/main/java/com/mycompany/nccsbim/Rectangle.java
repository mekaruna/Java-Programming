package com.mycompany.nccsbim;

public class Rectangle {
    public int length;
    public int breadth;

    public int area;

    public static void main(String[] args)
    {
        var _rec = new Rectangle();
        _rec.computeArea(15, 10);
        var _area =  _rec.displayArea();

        System.out.println("Area : " + _area);
    }

    public Rectangle computeArea(int length,   int breadth)
    {
        this.length = length;
        this.breadth = breadth;
        this.area = this.length * this.breadth;
        return this;
    };

    public int displayArea()
    {
        return this.area;
    };
}
