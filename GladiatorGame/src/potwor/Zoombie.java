package potwor;

import gladiators.Postacie;

public class Zoombie extends Potwor {



    public Zoombie() {
        super(100,3,10,20);
    }

    @Override
    public void pobierzOpis() {
        System.out.println("Zoombie ");
        System.out.println("Zycie: " + potworZycie);
        System.out.println("Sila ataku :" + attackDamage);
    }
   
}
