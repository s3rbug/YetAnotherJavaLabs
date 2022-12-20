package Rate;

public class RateForTablets extends RateForCustomDevice {
    public RateForTablets(String name, float price, int speed, int deviceCount){
        super(name, price, speed, deviceCount, "Tablet");
    }
}
