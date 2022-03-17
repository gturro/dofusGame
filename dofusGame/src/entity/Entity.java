package entity;

public class Entity {

    private int tilesRow, tilesCol;
    private int[][] position= new int [tilesRow][tilesCol];

    private double maxHp;
    private double currentHp;

    private double basicAttackDmg; //basic attack damage
    private double strongAttackDmg; //strong attack damge

    private int baseAttackDistance; //base basic attack distance
    private int currentAttackDistance; //current basic attack distance

    private int baseMovUnits;
    private int currentMovUnits;



    public Entity (double maxHp, double attackDamage, int movmentUnits, int baseAttackDistance){
        this.maxHp = maxHp;
        this.currentHp = maxHp;
        this.basicAttackDmg = attackDamage;
        this.baseAttackDistance = baseAttackDistance;
        this.baseMovUnits = movmentUnits;
    }


//GETTERS
    /** 
     * @return current health
     */
    public double getCurrentHp(){
        return this.currentHp;
    }
    
    /** 
     * @return basic attack damage
     */
    public double getBasicAttackDamage(){
        return this.basicAttackDmg;
    }
    
    /** 
     * @return special attack damage
     */
    public double getStrongAttackDamage(){
        return this.strongAttackDmg;
    }
    
    /** 
     * @return current player basic attack distance
     */
    public int getCurrentBasicAttackDistance(){
        return this.currentAttackDistance;
    }
    
    /** 
     * @return player movement possible distance
     */
    public int getCurrentMovmentUnits(){
        return this.currentMovUnits;
    }
    
    /** 
     * @return cuurent player position on the grid
     */
    public int [][] getPlayerPosition(){
        return this.position;
    }


//SETTERS
    /** 
     * Sets player max health @param newMaxHp
     */
    public void setMaxHp(double newMaxHp){
        this.maxHp=newMaxHp;
        
    }
    
    /** 
     * Sets player basic attack damage @param newDamage
     */
    public void setBasicAttackDamage(double newDamage){
        this.basicAttackDmg = newDamage;
    }
    
    /** 
     * Sets player special attack damage @param newSpecialDamage
     */
    public void setStrongAttackDamage(double newStrongAttackDamage){
        this.strongAttackDmg = newStrongAttackDamage;
    }
    
    /** 
     * Sets player initial basic attack distance @param newAttackDistance
     */
    public void setbCurrentAttackDistance (int newAttackDistance){
        this.baseAttackDistance = newAttackDistance;
        //then currentBADistance = baseBADistance????
    }
    
    /** 
     * Sets player possible movment distance possible on the grid (only int)@param newMovmentUnits
     */
    public void setBaseMovementUnits (int newMovmentUnits){
        this.baseMovUnits = newMovmentUnits;
    }
    
    /** Sets map size with the two param:
     * @param mapHeight
     * @param mapWidth
     * This is used (reference) to place player into the grid
     */
    //map config
    public void setMapSize(int mapHeight, int mapWidth){
        this.tilesRow = mapHeight;
        this.tilesCol = mapWidth;
    }


//HP
    /** 
     * Substract health to player equal to enemy @param damage.
     */
    public void loseHp(double damage){
        this.currentHp -= damage;
        checkIfDead();
    }
    
    /** 
     * Player gain health equal to @param heal.
     * If the heal exeeds player max hp --> currentHp is set to maxHp.
     */
    public void gainHp(double heal){
        this.currentHp += heal;
        if (this.currentHp > this.maxHp){
            healFullHp();
        }
    }
    
    /**
     * Sets current health to max
     */
    public void healFullHp(){
        this.currentHp = this.maxHp;
    }


//MOV
    /** 
     * Increase player possible movement units by: @param buff
     */
    public void buffMovement(int buff){
        this.currentMovUnits += buff;
    }
    
    /** 
     * Decreases player possible movement units by: @param debuff
     */
    public void debuffMovement(int debuff){
        this.currentMovUnits -= debuff;
    }

    /**
     * Sets player possible movement units to initial mov units
     */
    public void resetMovement(){
        this.currentMovUnits = this.baseMovUnits;
    }





    
    /** 
     * Check if player health is less than 0.
     * If it's less player is Dead.
     */
    public void checkIfDead(){ //QUE PASA SI ESTA MORT??
        boolean isDead = false;
        if (currentHp < 0){
            isDead= true;
        }
    }

}
