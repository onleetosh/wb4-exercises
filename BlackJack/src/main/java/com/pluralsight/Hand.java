package com.pluralsight;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;

    // array holding the card
    public Hand() {
        this.cards = new ArrayList<Card>();
    }
    //a card is added to the hand
    public void Deal(Card card){
        this.cards.add(card);
        getSize();
    }

    public int getSize(){
        return this.cards.size();
    }

    public int getValue() throws Exception {
        int value = 0;

        for(Card card: cards){
            card.flip();
            value += card.getPointValue();
            card.flip(); //hide the card again
        }
        return value;
    }

    /**
     *   public void DisplayHand() throws Exception{
     *         for(Card card: this.cards){
     *             card.DisplayCard();
     *         }
     *         System.out.println("The value of cards in hand are " + getValue());
     *     }
     * @throws Exception
     */


    @Override
    public String toString(){
        StringBuilder sb  = new StringBuilder();
        for(Card card: this.cards){
            sb.append(card.toString());
                    sb.append("\n");
        }
        try{
            sb.append("The total is: " + this.getValue());
        }
        catch(Exception e) {
            throw new RuntimeException(e);

        }
        sb.append("\n");
        return sb.toString();
    }

    //method used to deal
    public void Deal(Deck deck, int numberOfCardsToDeal){
        for(int i = 0; i< numberOfCardsToDeal; i++){
            Deal(deck.deal());
        }
    }
    public void DealTwoCards(Deck deck){
        this.Deal(deck.deal());
        this.Deal(deck.deal());
    }

}
