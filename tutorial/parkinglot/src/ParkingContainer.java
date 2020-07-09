import java.util.List;

public class ParkingContainer<T extends IParkable> implements IParkable {
    List<T> list;

    public IParkable find(Vehicle v) {
        for (T t : list) {
            if (t.canFit(v)) {
                if (t instanceof ParkingContainer) {
                    return ((ParkingContainer)t).find(v);
                }
                return t;
            }
        }
        return null;
    }

    @Override
    public boolean canFit(Vehicle v) {
        for (T t : list) {
            if (t.canFit(v)) {
                return true;
            }
        }
        return false;
    }
}
