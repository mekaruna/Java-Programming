/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nccsbim;

/**
 * Q.1 Create a class Student having data member roll (int), name (string), address (string), gender 
 * (string), faculty (string) and method setData() to set the value of data member and display 
 * method that display the data of student. Now create two object of Student and invoke set and 
 * display method.
 * 
 * @author KARUNA
 */
public class Student {
    
    public int roll;    
    public String name;    
    public String address;    
    public String gender;
    public String faculty;
    
    public static void main(String[] args)
    {
        var _std = new Student();
        _std.setData(1, "Karuna", "Kathmandu", "Female", "BIM");
        
        System.out.println(_std.disData());
    }
    
    public Student setData(int roll, String name, String address, String gender, String faculty) {
        this.name = name;        
        this.roll = roll;        
        this.address = address;
        this.gender = gender;
        this.faculty = faculty;

        return this;
    }
    
    public String disData() {
        return "Name : " + this.name + ", Roll : " + this.roll + ", Address : " + this.address + ", Gender : " + this.gender + ", Faculty : " + this.faculty;
    }
}
