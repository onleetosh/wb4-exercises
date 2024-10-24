/***
 * this class encapsulates sample code
 */
package com.pluralsight;

public class Main {
    public static void main(String[] args) throws Exception {

        /***
         *          Deck deck = new Deck();
         *         Hand playerHand = new Hand();
         *
         *          //return 5 cards
         *         for (int i = 0; i <5; i++){
         *             Card card = deck.deal();
         *             playerHand.Deal(card);
         *         }
         *         int handValue = playerHand.getValue(); //get value of cards in hand.
         *         System.out.println("This hand is worth " + handValue);
         */

        System.out.println("Welcome to BlackJack");

        String playerName = Console.PromptForString("Enter Your Name: ");

        System.out.println("Dealing card .. 2 cards to each player. Lets begin!");


        //initialize a deck of cards
        Deck deck = new Deck();
        // shuffle deck
        deck.shuffle();

       // System.out.println(playerCard1.getValue() + " of " + playerCard2.getSuit());

        System.out.println("Dealers Hand: ");
        //declare a hand for dealer
        Hand dealerHand = new Hand();
        //deal two cards for dealer
        dealerHand.Deal(deck.deal());
        dealerHand.Deal(deck.deal());
        //dealerHand.DisplayHand();


        System.out.println("Player hand");
        // deal two cards
        Card playerCard1, playerCard2;
        playerCard1 = deck.deal();
        playerCard2 = deck.deal();
        //initialize a hand for player
        Hand playerHand = new Hand();
        //send cards dealt to hand
        playerHand.Deal(playerCard1);
        playerHand.Deal(playerCard2);
        // show cards in hand
       // playerHand.DisplayHand();

        //if dealer and player hand value are the same
        if(dealerHand.getValue() == playerHand.getValue()){
            System.out.println("Tie");
        }
        //if dealer hand value is higher
        else if (dealerHand.getValue() > playerHand.getValue()) {
            System.out.println("Dealer wins");
        }
        //else player hand value is higher
        else {
            System.out.println("Player wins" + playerName);

        }

    }

}