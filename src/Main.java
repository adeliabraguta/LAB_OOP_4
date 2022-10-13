import People.Cook;
import People.Waiter;
import Pizza.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        BBQ bbq = new BBQ();
        Capricioasa capricioasa = new Capricioasa();
        Pepperoni pepperoni = new Pepperoni();
        Diablo diablo = new Diablo();
        Margherita margherita = new Margherita();
        Neapolitana neapolitana = new Neapolitana();
        QuattroFormaggi quattroFormaggi = new QuattroFormaggi();

        Random rand = new Random();

        int profit = 0;
        int workHours = 480;
        int hour = 0;

        Waiter waiter = new Waiter(10 * workHours, workHours);
        Cook cook = new Cook( 20 * workHours, workHours);

        while (hour < workHours) {

            int randomPizza = rand.nextInt(7) + 1;
            int randomIsWithSomeone = rand.nextInt(2)+1;
            int randomAmountOfPeople = 1;
            if (randomIsWithSomeone == 2) {
                randomAmountOfPeople = rand.nextInt(8)+1;
            }
            int randomTimeTakeWaiter = rand.nextInt(20) + 1;
            hour += randomTimeTakeWaiter;
            if (randomTimeTakeWaiter >= 15) {
                System.out.println("Waiter took too long so the customers left");
                System.out.println(randomTimeTakeWaiter + " minutes waisted");
            } else {
                switch (randomPizza) {
                    case 1:
                        System.out.println("The customer ordered " + randomAmountOfPeople + " BBQ pizza");
                        bbq.makePizza();
                        System.out.println("The check price was: " + bbq.getPrice() * randomAmountOfPeople);
                        profit += bbq.getPrice() * randomAmountOfPeople;
                        break;
                    case 2:
                        System.out.println("The customer ordered " + randomAmountOfPeople + " Capricioasa pizza");
                        capricioasa.makePizza();
                        System.out.println("The check price was: " + capricioasa.getPrice() * randomAmountOfPeople);
                        profit += capricioasa.getPrice() * randomAmountOfPeople;
                        break;
                    case 3:
                        System.out.println("The customer ordered " + randomAmountOfPeople + " Diablo pizza");
                        diablo.makePizza();
                        System.out.println("The check price was: " + diablo.getPrice() * randomAmountOfPeople);
                        profit += diablo.getPrice() * randomAmountOfPeople;
                        break;
                    case 4:
                        System.out.println("The customer ordered " + randomAmountOfPeople + " Margherita pizza");
                        margherita.makePizza();
                        System.out.println("The check price was: " + margherita.getPrice() * randomAmountOfPeople);
                        profit += margherita.getPrice() * randomAmountOfPeople;
                        break;
                    case 5:
                        System.out.println("The customer ordered " + randomAmountOfPeople + " Neapolitana pizza");
                        neapolitana.makePizza();
                        System.out.println("The check price was: " + neapolitana.getPrice() * randomAmountOfPeople);
                        profit += neapolitana.getPrice() * randomAmountOfPeople;
                        break;
                    case 6:
                        System.out.println("The customer ordered " + randomAmountOfPeople + " Pepperoni pizza");
                        pepperoni.makePizza();
                        System.out.println("The check price was: " + pepperoni.getPrice() * randomAmountOfPeople);
                        profit += pepperoni.getPrice() * randomAmountOfPeople;
                        break;
                    case 7:
                        System.out.println("The customer ordered " + randomAmountOfPeople + " Quattro Formaggi pizza");
                        quattroFormaggi.makePizza();
                        System.out.println("The check price was: " + quattroFormaggi.getPrice() * randomAmountOfPeople);
                        profit += quattroFormaggi.getPrice() * randomAmountOfPeople;
                        break;
                }
                hour += 15 * (randomAmountOfPeople / 2) + (randomAmountOfPeople % 2);
            }
            System.out.println("*******************************************************************************");
        }
        System.out.println("Work day ended");
        System.out.println("The waiter was payed " + waiter.getSalary() + " and the cook " + cook.getSalary());
        profit -= waiter.getSalary() + cook.getSalary();
        System.out.println("Final profit : " + profit);
    }
}