public class SpotFactory {
    public static Spot produceSport(SpotType type) {
        return new Spot(type);
    }
}
