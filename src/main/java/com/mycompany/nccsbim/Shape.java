package com.mycompany.nccsbim;

public class Shape {
    public int length;
    public int breadth;
    public int height;


    Shape(){
        length=0;
        breadth=0;
        height=0;
    }

    Shape(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    Shape(int length, int breadth, int height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }

    public static void main(String[] args)
    {
        var obj = new Shape(10, 20);
        obj.calcAreaRectangle();

        var obj1 = new Shape(10, 20, 30);
        obj1.calcVolumeBox();
    }

    public void calcAreaRectangle()
    {
        System.out.println("Area of rectangle is " + (length*breadth));
    }

    public void calcVolumeBox()
    {
        System.out.println("Volume of box "+ (length*breadth*height));    
    }
}





    


