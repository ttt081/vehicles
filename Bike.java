public class Bike {
    private Vehicles vc = new Vehicles();

    // public Bike() {
    // System.out.println("Bike is created..");
    // }

    public void redBike() {
        System.out.println("This is red bike()");
        System.out.println(vc.drive() + " for bike obtained from Vehicles drive()");
    }
    public void greenBike() {
        System.out.println("This is green bike()");
        System.out.println(vc.drive() + " for bike obtained from Vehicles drive()");
    }
}
