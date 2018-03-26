package dziedziczenie.potwor;

import dziedziczenie.Gladiators.Postacie;
import java.lang.*;
import java.util.LinkedList;
import java.util.Random;


public class Szkielet extends Potwor {

    public int silaAtaku = 10;

    LinkedList m = new LinkedList();
    Random generator = new Random();

    /* public void atak(){
         super.atak(silaAtaku);
     }
     */

    public void losuj() {


        for (int i = 0; i < 36; i++) {

            m.add(generator.nextInt(silaAtaku));
        }

    }

    public Szkielet() {

    }

    public Szkielet(double predkoscChodzenia, double zycie) {

        super(predkoscChodzenia, zycie);
    }

    @Override
    public void pobierzOpis() {
        System.out.println("Szkielet ");
        System.out.println("Zycie: " + zycie);
        System.out.println("Predkosc chodzenia: " + predkoscChodzenia);
        System.out.println("Sila ataku :" + silaAtaku);
    }

    @Override
    public void atakujPostac(Potwor kogo, Postacie kogo1) throws Exception {

        kogo.atak(this.silaAtaku);
        kogo1.atak(this.silaAtaku);

    }


}


