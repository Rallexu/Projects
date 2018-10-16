package gladiators;

import static creatingChar.chooseChampSelectSQL.nickDataBase;
import static creatingChar.setNewGladiatorSQL.ArmorIdSetter;
import static creatingChar.setNewGladiatorSQL.CharismaSetter;
import static creatingChar.setNewGladiatorSQL.SkillSetter;
import static creatingChar.setNewGladiatorSQL.StatsPointSetter;
import static creatingChar.setNewGladiatorSQL.StrengthSetter;
import static creatingChar.setNewGladiatorSQL.SwordIdSetter;
import static creatingChar.setNewGladiatorSQL.VitalitySetter;
import static creatingChar.setNewGladiatorSQL.experienceDataBaseSetter;
import static creatingChar.setNewGladiatorSQL.goldDataBaseSetter;
import static creatingChar.setNewGladiatorSQL.levelDataBaseSetter;


public class Gladiator extends Postacie {
    public Gladiator() {
    super(nickDataBase,220,30,experienceDataBaseSetter,goldDataBaseSetter,levelDataBaseSetter,40,50,
          StrengthSetter,CharismaSetter,VitalitySetter,SkillSetter,StatsPointSetter,SwordIdSetter,ArmorIdSetter);
    }
    
     /*public static void setNewGladiator(int experience,int level,int gold,String nick){
    Gladiator.experience = experience;
    Gladiator.level = level;
    Gladiator.goldGlad = gold;
    Gladiator.nick = nick;

    }*/
 
    @Override
    public void pobierzOpis() {
        System.out.println("Wojownik "+ nickDataBase );
        System.out.println("Zycie: " + zycie);
        System.out.println("Sila ataku :" + silaAtaku);
        System.out.println("exp:" + exp);
        System.out.println("gold:" + gold);
        System.out.println("level:" + levelDataBaseSetter);
    }

}



