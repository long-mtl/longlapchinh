package oop;

public class Car {

     private String model;
    private int year;
    public Car (String model,int year){
        this.model=model;
        this.year=year;
    }
    public void displayDetails(){
        System.out.println("car model: "+model);
        System.out.println("car year: "+year);
    }
}
