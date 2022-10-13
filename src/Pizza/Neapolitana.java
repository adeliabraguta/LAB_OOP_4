package Pizza;

public class Neapolitana extends MeatPizza {
    private int gramsOfMushrooms;
    private int gramsOfMozzarella;

    public Neapolitana() {
        super("thin", 25, 50, 100, true);
        this.gramsOfMushrooms = 50;
        this.gramsOfMozzarella = 75;
    }

    @Override
    public void makePizza() {
        super.makePizza();
        System.out.println("In the end the cook added " + gramsOfMushrooms + " grams of mushrooms and " + gramsOfMozzarella + " grams of mozzarella");
    }

    @Override
    public double getPrice() {
        return super.getPrice() + gramsOfMozzarella * 1.2 + gramsOfMushrooms * 0.3;
    }
}