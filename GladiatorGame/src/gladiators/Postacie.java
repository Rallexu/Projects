
package gladiators;

import static creatingChar.creatingCharacter.object_character;
import static gladiatorUpdates.experienceUpdate.expUpdateSql;
import static gladiatorUpdates.experienceUpdate.lvlUpdateSql;
import java.util.Random;
import potwor.Potwor;

abstract public class Postacie {
    
    Random generator_glad = new Random();
    public String nick;
    public int zycie;
    public int silaAtaku;
    public int exp;
    public int gold;
    public int zycie_wartownik;
    public int gladMinDmg;
    public int gladMaxDmg;
    public static int level;
    private static int levelLimit=100;
    public  int strength;
    public  int charisma;
    public  int vitality;
    public  int skill;
    public  int statsPoints;
    public static int variable;
    public int swordIsEquip;
    public int armorIsEquip;
    public Postacie(String nick,int zycie, int silaAtaku, int exp, int gold,int level,
            int gladMinDmg,int gladMaxDmg,int strength,int charisma,int vitality,int skill,int statsPoints,int swordIsEquip,int armorIsEquip) {
        this.nick=nick;
        this.silaAtaku = silaAtaku;
        this.zycie = zycie;
        this.exp = exp;
        this.gold = gold;
        this.level=level;
        this.gladMinDmg = gladMinDmg;
        this.gladMaxDmg = gladMaxDmg;
        this.strength=strength;
        this.charisma=charisma;
        this.vitality=vitality;
        this.skill=skill;
        this.statsPoints=statsPoints;
        this.swordIsEquip=swordIsEquip;
        this.armorIsEquip=armorIsEquip;
        zycie_wartownik = zycie;//przypisuje zycie do wartownika aby potem uwzglednic warunek
       
    }
   
    public void atak(Potwor potwor) {
        if (zycie <= 0) {
            System.out.println("Postac martwa");           
       }
        if (potwor.potworZycie > 0 && zycie > 0) {
            potwor.potworZycie -= this.silaAtaku;
        }
    }
    public void LifeSetter(Gladiator obj)
    {
        zycie=(int)(zycie+(zycie*(level/10)));
    }

    public void addStats() {
      if(exp>0 && (exp-10)>0){  
        this.silaAtaku += 1;
        this.exp -= 10;
         gladMaxDmg=silaAtaku; }
    }
    
    public void addHeal() {
   if(zycie==zycie_wartownik){
       System.out.println("Your hp is full ");
   }
   else{
       if(gold>=0 && (gold-5)>0) {
                    this.gold -= 5;
                    
       if(zycie<zycie_wartownik){  
                    this.zycie+=10;
                    
        if(zycie>zycie_wartownik){
                    zycie=zycie_wartownik;
                    }
                }          
            }
        }
    }
        public void Losuj(int minDmg, int maxDmg) {
         this.gladMinDmg = gladMinDmg;
         this.gladMaxDmg = silaAtaku;
         this.silaAtaku = generator_glad.nextInt(this.gladMaxDmg - this.gladMinDmg + 1) + this.gladMinDmg;
    }
        public static void setLevelLimit(Postacie obj)
        {
            if(levelLimit<=obj.exp){
                ++obj.level; 
                lvlUpdateSql(obj);
                obj.exp=0;
                expUpdateSql(obj);
            }
            levelLimit=(int)(levelLimit+(levelLimit*(obj.level/10)));
           
        }
       
    public abstract void pobierzOpis();
    
    public static void StrengthSkillsAddMinusFunction(int variable){
        if(variable!=0){
    object_character.strength++;
         }
        else{
            object_character.strength--;
        }
    }
    
     public static void CharismaSkillsAddMinusFunction(int variable){
        if(variable!=0){
    object_character.charisma++;
         }
        else{
            object_character.charisma--;
        }
    }
     public static void VitalitySkillsAddMinusFunction(int variable){
        if(variable!=0){
    object_character.vitality++;
         }
        else{
            object_character.vitality--;
        }
    }
     public static void SkillSkillsAddMinusFunction(int variable){
        if(variable!=0){
    object_character.skill++;
         }
        else{
            object_character.skill--;
        }
    }
    
    
  
   
    
 
   /* public  void pobierzZycie(){
        System.out.println("Wojownik ");
        System.out.println("Hp: " + zycie);
        System.out.println("gold:" + gold);
    }*/  
}


