public class Car {
    private Vehicles vc = new Vehicles();

    // public Car() {
    // System.out.println("Car is created..");
    // }

    public void redCar() {
        System.out.println("This is red car()");
        System.out.println(vc.drive() + " for car obtained from Vehicles drive()");
    }

    public void greenCar() {
        System.out.println("This is green car()");
        System.out.println(vc.drive() + " for car obtained from Vehicles drive()");
    }
}
