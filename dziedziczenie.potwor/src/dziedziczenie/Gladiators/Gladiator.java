package dziedziczenie.Gladiators;

import dziedziczenie.potwor.Potwor;

public class Gladiator extends Postacie {

    //double predkoscChodzenia ;
    // double zycie ;
    protected static double silaAtaku = 19;

    public Gladiator() {

    }

    /* public atak(double silaAtaku)
    {
    super.atak(silaAtaku);

    }
     */
    public Gladiator(double predkoscChodzenia, double zycie) {

        super(predkoscChodzenia, zycie);
    }

    @Override
    public void pobierzOpis() {
        System.out.println("Wojownik ");
        System.out.println("Zycie: " + zycie);
        System.out.println("Predkosc chodzenia: " + predkoscChodzenia);
        System.out.println("Sila ataku :" + silaAtaku);
    }

    @Override
    public void atakujPostac(Postacie kogo1,Potwor kogo) throws Exception {

        kogo.atak(this.silaAtaku);
        kogo1.atak(this.silaAtaku);

    }


}



