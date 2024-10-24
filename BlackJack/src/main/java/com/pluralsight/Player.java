/***
 * This class encapsulates a player dealt a hand of cards and given name
 */
package com.pluralsight;

public class Player {


    private String name;
    private Hand hand;

    // initialize a constructor
    public Player(String name){
        this.name = name;
        this.hand = new Hand();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    @Override
    //method designed to get players hand
    public String toString() {
        return this.name + "'s Hand: \n " + this.getHand();
    }
}
