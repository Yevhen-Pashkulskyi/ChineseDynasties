import dynasties.Dynasties;

public class App {
    private static final double COEFFICIENT = 1.5;

    public static void main(String[] args) {
        Dynasties liDynasties = new Dynasties();
        Dynasties minDynasties = new Dynasties();

        System.out.println("Лі Power = "+liDynasties.totalPower(13, 24, 46));

        double minTotalPower = minDynasties.totalPower(9, 35, 12) * COEFFICIENT;
        System.out.println("Мінь power = "+minTotalPower);
    }
}
