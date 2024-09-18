//2)	Create a base class Vehicle with attributes like make and year. Provide a constructor in Vehicle to initialize these attributes. Derive a class Car that has an additional attribute model and write a constructor that initializes make, year, and model. Write a program to create a Car object and display its details.

class Vehicle{
    private String make;
    private int year;
    public Vehicle(String makr,int year){
        this.make=make;
        this.year=year;
    }
    public String getDetails(){
        return"Make" + make + ",Year:" +year;
    }
}
class Car extends Vehicle{
    private String model;
    public Car(String make,int year,String model){
        super(make,year);
        this.model=model;
    }
    public String getDetails(){
        return super.getDetails()+",Model:"+ model;
    }
}
public class Program2{
    public static void main(String []args){
        Car c =new Car("kia",2024,"carnival");
        System.out.println(c.getDetails());
    }
}