package entity;

import inventory.Inventory;
import inventory.Potion;
import inventory.Weapon;

public class Personatge extends Entity{
    
   
    
    //Inventory
    private int maxObjects = 10;
    private int currentObjects;
    private int weapons;
    private int potions;
    private int miscellaneous;
    private int coinBag;

    public Inventory[] bag = new Inventory[maxObjects];

    Weapon equipedWeapon;
    

//CONSTRUCTORS
    public Personatge (double maxHp, double attackDamage){
        super(maxHp, attackDamage, 1, 1);
    }

    public Personatge (double maxHP, double attackDamage, int movmentUnits, int baseAttackDistance){
        super(maxHP, attackDamage, movmentUnits, baseAttackDistance);
    }


//GETTERS
    

//SETTERS
    


//HP
   /** 
     * Heals player for taking a @param potion
     * get healing amount of potion and += to player current health
     */
    public void takePotion (Potion potion){
        gainHp(potion.getHealingAmount());
    }


//MOV


//COMBAT
    /** 
     * Current player attacks @param enemyPlayer
     * Substract enemy hp equal to thisPlayer basic attack damage
     */
    public void attackPlayer (Personatge enemyPlayer, double dmg){
        enemyPlayer.loseHp(dmg);
    }
    
    public void attackMonter (Monster monster, double dmg){
        monster.loseHp(dmg);
    }




//EQUIP ITEMS

    public void carryWeapon(Weapon weapon){
        this.equipedWeapon = weapon;
    }

}