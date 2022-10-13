package People;

public class Customer extends Person{

    public Customer( boolean isWithSomeone) {
        super("Customer", isWithSomeone);
    }

    @Override
    public boolean isWithSomeone() {
        return super.isWithSomeone();
    }
}
