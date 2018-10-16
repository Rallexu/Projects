package potwor;
import gladiators.Postacie;
import java.lang.*;
import java.util.Random;

public class bossPirate extends Potwor {

    public bossPirate() {
        super(120,40,10,11);
    }
    @Override
    public void pobierzOpis() {
        System.out.println("Szkielet ");
        System.out.println("Zycie: " + potworZycie);
        System.out.println("Sila ataku :" + attackDamage);
    }


}

