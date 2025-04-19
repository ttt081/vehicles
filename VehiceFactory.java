public class VehiceFactory {
    private Car car = new Car();
    private Bike bike = new Bike();
    private Truck truck = new Truck();

    public VehiceFactory() {
        System.out.println("Vehicle factory created..");
    }

    public Car getCar() {
        return car;
    }

    public Bike getBike() {
        return bike;
    }

    public Truck getTruck() {
        return truck;
    }

    public static void main(String[] args) {
        VehiceFactory vf = new VehiceFactory();
        vf.getCar().redCar();
        // vf.getBike().greenBike();
        // vf.getTruck().redTruck();
    }
}
