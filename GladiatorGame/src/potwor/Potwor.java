package potwor;
import gladiators.Postacie;
import java.util.Random;
import javax.swing.WindowConstants;

abstract public class Potwor {
    Random generator = new Random();
    public int potworZycie;
    public int attackDamage;
    public int minDmg;
    public int maxDmg;
    public int potworZycieWartownik;


    public Potwor(int potworZycie, int attackDamage, int minDmg, int maxDmg) {

        this.potworZycie = potworZycie;
        this.attackDamage = attackDamage;
        this.minDmg = minDmg;
        this.maxDmg = maxDmg;
      potworZycieWartownik=potworZycie;


    }

    public void Losuj(int minDmg, int maxDmg) {
        
        this.minDmg = minDmg;
        this.maxDmg = maxDmg;
        this.attackDamage = generator.nextInt(this.maxDmg - this.minDmg + 1) + this.minDmg;
    }

    public void atakPotwor(Postacie postacie) {
      
        if(potworZycie<=0){
            
                postacie.gold+=10;
                 postacie.exp+=25;
                 System.out.println("Potwor martwy");
               
    
        }
          if(postacie.zycie > 0 && potworZycie > 0 )  {
              Losuj(minDmg, maxDmg);
                postacie.zycie -= this.attackDamage;
          }
          

    }
    
    public abstract void pobierzOpis();

}