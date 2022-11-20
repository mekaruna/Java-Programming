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

    public void calcAreaRectangle(){
        System.out.println("Area of rectangle is" + (length*breadth));
    }

    public void calcVolumeBox(){
        System.out.println("Volume of box "+ (length*breadth*height));    
    }
}





    


