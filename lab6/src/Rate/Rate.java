package Rate;

public class Rate {
    private final String name;
    private final float price;
    private final int speed;
    private final int countClients;

    Rate(String name, float price, int speed, int countClients) {
        this.name = name;
        this.price = price;
        this.speed = speed;
        this.countClients = countClients;
    }

    public float getPrice(){
        return price;
    }

    public int getCountClients(){
        return countClients;
    }

    public static void printAllRates(Rate[] rates){
        for(Rate rate: rates){
            System.out.println(rate);
        }
    }
    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Price: " + price + "\n" +
                "Speed: " + speed + "\n" +
                "Count clients: " + countClients + "\n";
    }
}
