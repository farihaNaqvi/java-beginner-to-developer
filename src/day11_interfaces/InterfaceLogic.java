package day11_interfaces;

public class InterfaceLogic {

    public static void main(String[] args) {

        Vehicle vehicle1 = new Car();
        Vehicle vehicle2 = new Bike();

        vehicle1.start();
        vehicle1.stop();

        vehicle2.start();
        vehicle2.stop();
    }
}
