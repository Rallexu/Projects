package potwor;
import gladiators.Postacie;
import java.lang.*;
import java.util.Random;

public class Sphinx extends Potwor {

    public Sphinx() {
        super(120,10,10,11);
    }
    @Override
    public void pobierzOpis() {
        System.out.println("Szkielet ");
        System.out.println("Zycie: " + potworZycie);
        System.out.println("Sila ataku :" + attackDamage);
    }


}

