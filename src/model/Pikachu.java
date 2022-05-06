package model;

public class Pikachu extends Pokemon implements Boostable{

    public static final String NAME = "Pikachu";
    public static final int POWER = 15;

    public Pikachu() {
        super(NAME, POWER);
    }

    @Override
    public void boost() {

        this.setPower(this.getPower() * 2);

    }
}
