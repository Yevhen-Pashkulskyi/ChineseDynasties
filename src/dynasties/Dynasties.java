package dynasties;

public class Dynasties {
    private final double LI_WARRIORS_ATACK = 860.0;
    private int warriorPower;
    private int bowmanPower;
    private int horsemanPower;
    public double totalPower(double warriorPower, double bowmanPower, double horsemanPower) {
        return (warriorPower + bowmanPower + horsemanPower) * LI_WARRIORS_ATACK;
    }
}
