package potwor;
import gladiators.Postacie;
import java.lang.*;
import java.util.Random;

public class wolf extends Potwor {

    public wolf() {
        super(120,10,10,11);
    }
    @Override
    public void pobierzOpis() {
        System.out.println("Wilkołak ");
        System.out.println("Zycie: " + potworZycie);
        System.out.println("Sila ataku :" + attackDamage);
    }


}
