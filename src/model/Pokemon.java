package model;

public abstract class Pokemon {

    private String name;
    private int power;

    public Pokemon(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void hit(Player enemy){

        int healtAfterHit = enemy.getHealth() - this.power;

        enemy.setHealth(healtAfterHit);
    }
    public void printAttackDetail(){
        System.out.println("Pokemon: " + this.name + ": " + this.power);
    }

}
