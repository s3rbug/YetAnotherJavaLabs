package Rate;

public class RateForBusiness extends Rate {
    String companyName;
    public RateForBusiness(String name, float price, int speed, int countClients, String companyName){
        super(name, price, speed, countClients);
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Company name: " + companyName + "\n";
    }
}
