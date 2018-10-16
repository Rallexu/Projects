package potwor;
import gladiators.Postacie;
import java.lang.*;
import java.util.Random;

public class bossSpider extends Potwor {

    public bossSpider() {
        super(300,15,20,30);
    }
    @Override
    public void pobierzOpis() {
        System.out.println("Venoma ");
        System.out.println("Zycie: " + potworZycie);
        System.out.println("Sila ataku :" + attackDamage);
    }


}

