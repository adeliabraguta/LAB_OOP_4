package People;

public class Cook extends Employee{

    public Cook(int salary, int shift) {
        super("cook", salary, shift);
    }

    @Override
    public int getSalary() {
        return super.getSalary();
    }
}
