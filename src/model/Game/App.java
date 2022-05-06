package model.Game;

import model.*;

public class App {
    public static void main(String[] args) {
        // Design Patterns ---> single responsibilty

        Pokemon p1 = new Misty();
        Pokemon p2 = new Charizard();
        Pokemon p3 = new Pikachu();
        Pokemon p4 = new Pikachu();

        Pokemon[] player1Pokemons = {p1,p2};
        Pokemon[] player2Pokemons = {p3,p4};

        Player player1 = new Player("Jane",player1Pokemons);
        Player player2 = new Player("John",player2Pokemons);

        Game game = new Game(player1, player2);

        game.start();
    }
}
