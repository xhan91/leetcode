import java.util.HashSet;
import java.util.Set;

public class Spot implements IParkable{

    private SpotType type;
    private Set<VehicleType> fitSet;
    private Vehicle v;

    public Spot(SpotType type) {
        this.type = type;
        fitSet = new HashSet<>();
        switch (type) {
            case Regular:
                fitSet.add(VehicleType.Car);
                fitSet.add(VehicleType.Motorcycle);
                break;
            case Motorcycle:
                fitSet.add(VehicleType.Motorcycle);
        }
    }

    @Override
    public boolean canFit(Vehicle v) {
        return fitSet.contains(v.getType());
    }

    public boolean isEmpty() {
        return v == null;
    }

    public void park(Vehicle v) {
        this.v = v;
    }
}
