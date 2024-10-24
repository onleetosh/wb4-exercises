/***
 * This class encapsulates the rules of BlackJack
 */
package com.pluralsight;

import java.util.ArrayList;

public class BlackJack {

    //declare a deck of cards
    private Deck deck;
    //declare an ArrayList with the name players
    private ArrayList<Player> players;
    private static Player dealer;
    private static Player player;


    //getters

    public Deck getDeck() {
        return deck;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public Player getDealer() {
        return dealer;
    }

    //initialize a constructor
    public BlackJack() {
        this.deck = new Deck(); // create an instant of deck
        this.deck.shuffle(); // shuffle the deck
        players = new ArrayList<Player>();
        this.dealer = new Player("Dealer");
    }

    //create a method with parameter playerName
    public void addPlayer(String playerName){
        //Player p = new Player(playerName);
        //players.add(p);
        players.add((new Player(playerName)));
    }
    public void addPlayer(Player player){
        players.add(player);
    }

    public void DealCards(){

        for(Player player : this.players){
            player.getHand().Deal(deck,2);
        }

        dealer.getHand().Deal(deck,2);

        /**
         *  deck.deal();
         *  for (Player player: this.players){
         *             //deal two cards and send to player hand
         *             player.getHand().Deal(deck.deal());
         *             player.getHand().Deal(deck.deal());
         *         }
         *         //deal two cards and send to dealer hand
         *         dealer.getHand().Deal(deck.deal());
         *         dealer.getHand().Deal(deck.deal());
         */
    }

    //TODO: does not return a winner 
    public static Player[] getWinners() throws Exception {

        if(dealer.getHand().getValue() == player.getHand().getValue()) {
            System.out.println("Tie");
            return new Player[0];
        }
        else if (dealer.getHand().getValue() > player.getHand().getValue()) {
            System.out.println("Dealer wins");
            return new Player[] { dealer };
        }
        else {
            System.out.println("Player wins: ");
            return new Player[] { player };
        }
    }
}
