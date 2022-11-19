package com.mycompany.nccsbim;

public class Calculate {

    public int num1;
    public int num2;

    public Calculate setCalc(int num1, int num2) {
        this.num1 = num1;        
        this.num2 = num2;
        return this;
    }

    public int calcSum() {
        return this.num1 + this.num2;
    }

    public int calcMulti() {
        return this.num1 * this.num2;
    }

    public int calcDifference() {
        return this.num1 - this.num2;
    }
}