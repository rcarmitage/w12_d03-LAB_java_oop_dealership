package people;

public abstract class Person {

    private String name;
    private double wallet;

    public Person(String name, double wallet) {
        this.name = name;
        this.wallet = wallet;
    }

    public String getName() {
        return this.name;
    }

    public double getWallet() {
        return this.wallet;
    }

    public void setWallet(double amount) { this.wallet = amount; }
}
