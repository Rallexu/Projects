package potwor;
import gladiators.Postacie;
import java.lang.*;
import java.util.Random;

public class spider extends Potwor {

    public spider() {
        super(120,10,10,11);
    }
    @Override
    public void pobierzOpis() {
        System.out.println("spider ");
        System.out.println("Zycie: " + potworZycie);
        System.out.println("Sila ataku :" + attackDamage);
    }


}
