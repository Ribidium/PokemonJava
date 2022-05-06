package model;

public class Player {

    public static final int POK_COUNT = 2;

    private String name;
    private int health = 100;
    private Pokemon[] pokemons;
    private int currentIndice = 0;


    public Player(String name, Pokemon[] pokemons) {
        this.name = name;
        this.pokemons = pokemons;
    }

    public void printDetails(){
        System.out.println(this.name + " " + this.health);
    }

    public Pokemon getNextPokemon(){

        Pokemon p = this.pokemons[currentIndice];

        if (this.currentIndice == 0){
            this.currentIndice = 1;
        }else {
            this.currentIndice = 0;
        }

        return p;
    }

    public boolean isAlive(){
        if (this.health > 0){
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Pokemon[] getPokemons() {
        return pokemons;
    }

    public void setPokemons(Pokemon[] pokemons) {
        this.pokemons = pokemons;
    }
}
