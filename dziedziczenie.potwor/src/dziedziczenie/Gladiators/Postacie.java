
package dziedziczenie.Gladiators;

import dziedziczenie.potwor.Potwor;

abstract public class Postacie {
    double predkoscChodzenia;
    double zycie;
    protected static double silaAtaku;

    public Postacie() {

    }

    public Postacie(double predkoscChodzenia, double zycie) {
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


    public void atakujPostac(Postacie kogo1,Potwor kogo) throws Exception {

        kogo.atak(this.silaAtaku);
        kogo1.atak(this.silaAtaku);

    }

 /* public double getPotwor(){

System.out.print("predkoscChodzenia:"+predkoscChodzenia+" zycie:"+zycie+" sila ataku:"+silaAtaku+" ");
return 0;
    }*/

    public abstract void pobierzOpis();


}
