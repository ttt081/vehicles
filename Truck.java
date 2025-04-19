public class Truck {
    private Vehicles vc = new Vehicles();

    // public Truck() {
    // System.out.println("Trcuk is created..");
    // }

    public void RedTruck() {
        System.out.println("This is red truck()");
        System.out.println(vc.drive() + " for truck obtained from Vehicles drive()");
    }

    public void greenTruck() {
        System.out.println("This is green truck()");
        System.out.println(vc.drive() + " for truck obtained from Vehicles drive()");
    }

}
