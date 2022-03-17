package entity;

public class Monster extends Entity{

    private double strongAttackDmg;

//CONSTRUCTORS
    public Monster(double maxHp, double attackDamage){
        super(maxHp, attackDamage, 1, 1);

    }

    public Monster (double maxHp, double attackDamage, int movmentUnits, int baseAttackDistance){
        super(maxHp, attackDamage, movmentUnits, baseAttackDistance);
    }

    public Monster(double maxHp, double attackDamage, double strongDamage){
        super(maxHp, attackDamage, 1, 1);
        this.strongAttackDmg = strongDamage;
    }

    public Monster (double maxHp, double attackDamage, double strongDamage, int movmentUnits, int baseAttackDistance){
        super(maxHp, attackDamage, movmentUnits, baseAttackDistance);
        this.strongAttackDmg = strongDamage;
    }
//GETTERS



//MONSTER ATTACKS
    /** 
     * Monster attacks @param player
     * Player health is decreased by monster BASIC attack damage
     */
    public void monsterBasicAttack(Personatge player){
        player.loseHp(this.getBasicAttackDamage());
    }
    
    /** 
     * Monster attacks @param player
     * Player health is decrease by monster STRONG attack damage
     */
    public void monsterStrongAttack(Personatge player){
        player.loseHp(this.strongAttackDmg);
    }
}
