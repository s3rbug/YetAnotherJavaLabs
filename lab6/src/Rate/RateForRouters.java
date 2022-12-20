package Rate;

public class RateForRouters extends RateForCustomDevice {
    public RateForRouters(String name, float price, int speed, int deviceCount){
        super(name, price, speed, deviceCount, "Router");
    }
}
