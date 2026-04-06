public class Car { 
    private String color; 
    private int engineCC; 

    void drive() { 
        System.out.println("Driving a " + color + " car with " + engineCC + "cc engine."); 
    } 

    public static void main(String[] args) { 
        Car myCar = new Car(); 
        myCar.color = "Red"; 
        myCar.engineCC = 2000; 
        myCar.drive(); 
    } 
}
