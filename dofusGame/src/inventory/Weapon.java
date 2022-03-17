package inventory;

public class Weapon extends Inventory{
    
    private double damage;
    private int attackDistance;

    public Weapon(int damage, int attackDistance){
        this.damage = damage;
        this.attackDistance = attackDistance;
    }

    public double getDmg () {
        return this.damage;
    }

    public int getAttDistance(){
        return attackDistance;
    }
    
}
