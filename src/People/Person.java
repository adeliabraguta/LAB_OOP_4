package People;

public class Person {
    private String name;
    private boolean isWithSomeone;

    public Person(String name, boolean isWithSomeone) {
        this.name = name;
        this.isWithSomeone = isWithSomeone;
    }

    public boolean isWithSomeone() {
        return isWithSomeone;
    }
}
