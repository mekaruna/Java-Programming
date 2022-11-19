package com.mycompany.nccsbim;

public class Numbers {
    public int x;
    public int y;
    public int z;

    public Numbers (int x, int y, int z) {
        this.x= x;
        this.y= y;
        this.z= z;
    }

    public static void main(String[] args)
    {
        var _obj = new Numbers(52, 99, 37);
        System.out.println("MAX : " + _obj.getMax());
    }

    public int getMax () {

        if (this.x > this.y && this.x > this.z) {
            return this.x;
        } else if (this.y > this.x && this.y > this.z) {
            return this.y;
        }  else if (this.z > this.x && this.z > this.y) {
            return this.z;
        }
        return 0; // default return 0
    }
}
