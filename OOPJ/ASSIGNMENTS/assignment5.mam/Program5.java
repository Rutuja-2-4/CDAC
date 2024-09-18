//5)	Write a Java program to create a base class Vehicle with methods startEngine() and stopEngine(). Create two subclasses Car and Motorcycle. Override the startEngine() and stopEngine() methods in each subclass to start and stop the engines differently.
class Vehicle{
    public void StartEngine(){
        System.out.println("engine started");
    }
    public void StopEngine(){
        System.out.println("engine stopped");
    }
}
class Car extends Vehicle{
    @Override
    public void StartEngine(){
        System.out.println("car engine started");
    }
    @Override
    public void StopEngine(){
        System.out.println("car engine stopped");
        }
}
class Motorcycle extends Vehicle{
    @Override
    public void StartEngine(){
        System.out.println("motorcycle engine started");
        }
        @Override
        public void StopEngine(){
            System.out.println("Motorcycle engine Stopped");
}
}
public class Program5{
    public static void main(String[]args){
        Vehicle v = new Vehicle();
        v.StartEngine();
        v.StopEngine();
        Car c = new Car();
        c.StartEngine();
    }
    }
