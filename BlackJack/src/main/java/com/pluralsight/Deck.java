package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Hearts","Spades", "Diamonds", "Clubs" };
        String[] values = {"2", "3,","4","5", "6", "7", "8", "9", "10","J","Q","K","A"};

        //loops merge suits and values to create cards for a deck and adds them to the ArrayList
        for (String suit: suits){
            for (String value: values){
                Card card = new Card(suit, value);
                cards.add(card);
            }
        }
    }

    // - instant method - shuffle the deck
    public void shuffle(){
        Collections.shuffle(cards);
    }

    //deal a card from the deck
    public Card deal(){

        //deal the top card ( only there are cards to deal)
        if(cards.size() > 0) {
            //remove a card from the deck
            Card card = cards.remove(0);
            return card;
        }
        else {
            return null; //no cards to deal
        }

    }

    //track number of cards in the deck
    public int getSize(){
        return cards.size();
    }

}
