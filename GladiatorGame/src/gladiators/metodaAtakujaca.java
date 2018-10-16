package gladiators;

import potwor.Potwor;

public class metodaAtakujaca {




    public static void atakujPostac(Potwor potwor, Postacie Gladiator) {

        potwor.atakPotwor(Gladiator);

        Gladiator.atak(potwor);


    }




}
