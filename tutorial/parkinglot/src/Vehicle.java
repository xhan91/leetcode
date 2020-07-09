public class Vehicle implements IVehicle {

    private String plate;
    private VehicleType type;

    public Vehicle(String plate, VehicleType type) {
        this.plate = plate;
        this.type = type;
    }

    @Override
    public void print() {
        System.out.print("I am " + type.toString() + ": " + plate);
    }

    @Override
    public String getPlate() {
        return plate;
    }

    @Override
    public VehicleType getType() {
        return type;
    }
}
