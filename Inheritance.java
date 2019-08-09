class Vehicle {
    public String honk() {
        return "Beep! Beep!";
    }
}

class Car extends Vehicle {    
    int wheels = 4;
}

class Truck extends Vehicle {    
    int wheels = 18;

    public String honk() {
        return "Honk! Honk!";
    }
}

public interface Test {
    default public int start() {

    }
}

class InheritanceExample {
    public static void main(String[] args) {
        Car c = new Car();
        Truck t = new Truck();

        System.out.println("Car goes " + c.honk());
        System.out.println("Truck goes " + t.honk());
    }
}