//1)	Create a base class Animal with attributes like name, and methods like eat() and sleep(). Create a subclass Dog that inherits from Animal and has an additional method bark(). Write a program to demonstrate the use of inheritance by creating objects of Animal and Dog and calling their methods.
class Animal{
    protected String name;
    public Animal(String name){
        this.name = name;
    }
    public void eat(){
        System.out.println(name +"eating");
    }
    public void Sleep(){
        System.out.println(name+"is Sleeping");
    }
}
class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
    public void bark(){
        System.out.println(name + " is barking.");
    }
}
public class Program3{
    public static void main(String []args){
        Animal a =new Animal("cow");
        a.eat();
        a.Sleep();
        Dog d = new Dog("gigi");
        System.out.println("Dog");
        d.bark();
        }
    }


