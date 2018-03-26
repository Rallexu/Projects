package dziedziczenie.Main;

import dziedziczenie.Gladiators.Gladiator;
import dziedziczenie.Gladiators.Postacie;
import dziedziczenie.potwor.Potwor;
import dziedziczenie.potwor.Szkielet;
import dziedziczenie.potwor.Zoombie;

public class Main {

    public static void main(String[] args) throws Exception {
        int a = 0;
        Potwor Arek = new Szkielet(12, 40);
        Potwor Wuja = new Zoombie(2, 29);
        Postacie Rall = new Gladiator(12, 33);

        while (a == 0) {
            System.out.println();
            Arek.pobierzOpis();
            System.out.println();
            Rall.pobierzOpis();
            System.out.println();
            Rall.atakujPostac(Rall, Arek);


            try {

            } catch (Exception ex) {
                a = 1;
                System.out.println("Potwor jest martwy");


            }
        }
    }
}
