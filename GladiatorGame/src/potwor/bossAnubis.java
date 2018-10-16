package potwor;
import gladiators.Postacie;
import java.lang.*;
import java.util.Random;

public class bossAnubis extends Potwor {

    public bossAnubis() {
        super(120,40,10,11);
    }
    @Override
    public void pobierzOpis() {
        System.out.println("Szkielet ");
        System.out.println("Zycie: " + potworZycie);
        System.out.println("Sila ataku :" + attackDamage);
    }


}

