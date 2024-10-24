/***
 * This class encapsulates a user interface providing input and out data
 */
package com.pluralsight;

import java.util.ArrayList;

public class UserInterface {

    //create a variable with type BlackJack to start a game
    private static BlackJack letsBegin;
    public UserInterface() throws Exception {
        //initialize a game
        letsBegin = new BlackJack();

        System.out.println("Welcome to BlackJack game!");
        //ask user for number of players
        int numberOfPlayers = Console.PromptForInt("How many players do we have ");
        AddPlayersToGame(numberOfPlayers);

        letsBegin.DealCards();

        InitializeBlackJack();

        System.out.println("Winner" + BlackJack.getWinners());

    }
    //method designed to display a game of BlackJack
    public static void InitializeBlackJack(){
        System.out.println(letsBegin.getDealer());
        ArrayList<Player> players = players = letsBegin.getPlayers();
        for(Player player: players){
            System.out.println(player);
        }

    }

    //method designed to add player to game
    public static void AddPlayersToGame(int numberOfPlayers){
        for ( int i = 1; i <= numberOfPlayers; i ++){
            String playerName = Console.PromptForString("Enter player name " + i + ":");
            letsBegin.addPlayer(playerName);

        }
    }

}
