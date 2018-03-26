package dziedziczenie.potwor;

import dziedziczenie.Gladiators.Postacie;

public class Zoombie extends Potwor {
    // double predkoscChodzenia ;
    // double zycie ;
    protected static double silaAtaku = 3;

    public Zoombie() {

    }

    /* public atak(double silaAtaku)
    {
    super.atak(silaAtaku);

    }
     */
    public Zoombie(double predkoscChodzenia, double zycie) {

        super(predkoscChodzenia, zycie);
    }

    @Override
    public void pobierzOpis() {
        System.out.println("Zoombie ");
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
