package dziedziczenie.potwor;

import dziedziczenie.Gladiators.Postacie;
import dziedziczenie.Gladiators.TworzeniePostaci;

abstract public class Potwor extends Postacie {
    double predkoscChodzenia;
    public double zycie;
    public int silaAtaku;

    public Potwor() {

    }

    public Potwor(double predkoscChodzenia, double zycie) {
        this.predkoscChodzenia = predkoscChodzenia;
        this.zycie = zycie;

    }

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
 /* public double getPotwor(){

System.out.print("predkoscChodzenia:"+predkoscChodzenia+" zycie:"+zycie+" sila ataku:"+silaAtaku+" ");
return 0;
    }*/

    public abstract void pobierzOpis();


}
