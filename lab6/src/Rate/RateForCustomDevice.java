package Rate;

public class RateForCustomDevice extends Rate {
    private final String deviceName;
    public RateForCustomDevice(String name, float price, int speed, int countClients, String deviceName){
        super(name, price, speed, countClients);
        this.deviceName = deviceName;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Device name: " + deviceName + "\n";
    }
}
