package dziedziczenie.Gladiators;

import dziedziczenie.potwor.Potwor;

public class TworzeniePostaci {

    public static double silaAtaku;
    public double zycie;

    public void atak(double silaAtaku) throws Exception {
        if (zycie <= 0) {

            throw new Exception("Obiekt jest martwy");
        } else {
            this.zycie -= silaAtaku;

        }
    }

    public void atakujPostac(Potwor kogo, Postacie kogo1) throws Exception {

        kogo.atak(this.silaAtaku);

        kogo1.atak(this.silaAtaku);

    }


   /* public void atakujPotwora(Postacie kogo) throws Exception{

        kogo.atak(this.silaAtaku);


    }*/


}
