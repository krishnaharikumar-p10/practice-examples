package week3;

interface Flyable {
    void fly();
}

interface Honkable {
    void honk();
}

abstract class Vehicle {

    private int speed;
    private String colour;

    Vehicle(int speed, String colour) {
        this.speed = speed;
        this.colour = colour;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColour() {
        return colour;
    }

    abstract void start();

    public void greeting() {
        System.out.println("Hello from Vehicle");
    }
}

class Bike extends Vehicle implements Honkable {

    Bike(int speed, String colour) {
        super(speed, colour);
    }

    public void start() {
        System.out.println("Bike is starting");
    }

    public void honk() {
        System.out.println("Bike Honking...");
    }
}

class Autorickshaw extends Vehicle implements Honkable {

    Autorickshaw(int speed, String colour) {
        super(speed, colour);
    }

    public void start() {
        System.out.println("Autorickshaw is starting");
    }

    public void honk() {
        System.out.println("Autorickshaw Honking...");
    }
}

class Plane extends Vehicle implements Flyable {

    Plane(int speed, String colour) {
        super(speed, colour);
    }

    public void start() {
        System.out.println("Plane is starting");
    }

    public void fly() {
        System.out.println("Plane is flying");
    }
}

abstract class Car extends Vehicle implements Honkable {

    Car(int speed, String colour) {
        super(speed, colour);
    }

    public void start() {
        System.out.println("Car is starting");
    }

    abstract void openTrunk();

    public void honk() {
        System.out.println("Default Honking...");
    }
}

class Sedan extends Car {

    Sedan(int speed, String colour) {
        super(speed, colour);
    }

    void openTrunk() {
        System.out.println("Trunk opened");
    }
    
    public void start() {
    	super.start();
        System.out.println("Sedan is starting");
    }

    public void honk() {
        System.out.println("Sedan Honking...");
    }
}

public class InterfaceAbstract {

    public static void main(String[] args) {

        Sedan car = new Sedan(120, "Blue");
        car.greeting();
        car.start();
        car.honk();
        car.openTrunk();
        
        System.out.println("\n");
        
        Bike bike = new Bike(50, "Black");
        bike.greeting();
        bike.start();
        bike.honk();
        
        System.out.println("\n");
        
        Autorickshaw auto = new Autorickshaw(40, "Yellow");
        auto.greeting();
        auto.start();
        auto.honk();
        
        System.out.println("\n");
        
        Plane plane = new Plane(900, "White");
        plane.greeting();
        plane.start();
        plane.fly();
        System.out.println(plane.getColour());
    }
}
