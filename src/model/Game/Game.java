package model.Game;

import model.Boostable;
import model.Player;
import model.Pokemon;

import java.util.Locale;
import java.util.Scanner;

public class Game {

    Scanner s = new Scanner(System.in);

    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start(){
        while (true){

            Pokemon player1pokemon = player1.getNextPokemon();
            Pokemon player2pokemon = player2.getNextPokemon();

            player1pokemon.hit(player2);
            //player1pokemon.printAttackDetail();
            this.printTurnResult(player1pokemon, player1, player2);

            if (!player2.isAlive()){
                this.anonseWinner(player2);
                break;
            }

            if (player2.getHealth() <= 10 && player2pokemon instanceof Boostable){
                System.out.println(player2.getName() + "'s pokemon " + player2pokemon.getName() + " has boosted");
                Boostable b = (Boostable) player2pokemon;
                b.boost();
            }

            player2pokemon.hit(player1);
            //player2pokemon.printAttackDetail();
            this.printTurnResult(player2pokemon, player2, player1);


            if (!player1.isAlive()){
                this.anonseWinner(player1);

                break;
            }
            if (player1.getHealth() <= 10 && player1pokemon instanceof Boostable){
                System.out.println(player1.getName() + "'s pokemon " + player1pokemon.getName() + " has boosted");

                Boostable b = (Boostable) player1pokemon;
                b.boost();
            }

            player1.printDetails();
            player2.printDetails();
            s.nextLine();
        }

    }
    public void anonseWinner(Player p){
        System.out.println(p.getName().toUpperCase(Locale.ROOT) + " HAS WON");
    }
    public void printTurnResult(Pokemon pokemon, Player player, Player enemy){
        String output = player.getName() + "'s pokemon "
                + pokemon.getName() + " attacked with power of "
                + pokemon.getPower() + " to " + enemy.getName();
        System.out.println(output);
    }
}
