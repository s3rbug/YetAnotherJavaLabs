package Rate;

public class RateForHome extends Rate {
    private int homeDeviceCount;
    public RateForHome(String name, float price, int speed, int countClients, int homeDeviceCount){
        super(name, price, speed, countClients);
        this.homeDeviceCount = homeDeviceCount;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Home device count: " + homeDeviceCount + "\n";
    }
}
