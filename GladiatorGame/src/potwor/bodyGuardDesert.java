package potwor;


public class bodyGuardDesert extends Potwor {

    public bodyGuardDesert() {
        super(120,40,10,11);
    }
    @Override
    public void pobierzOpis() {
        System.out.println("Szkielet ");
        System.out.println("Zycie: " + potworZycie);
        System.out.println("Sila ataku :" + attackDamage);
    }


}

