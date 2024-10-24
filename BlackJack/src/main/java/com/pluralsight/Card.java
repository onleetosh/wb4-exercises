package com.pluralsight;

public class Card {

    private String suit ; //ace, space, diamond, club
    private String value; // 1-10 , J, Q, K, Joker
    private boolean isFaceUp; //is it face up or face down

    public Card(String suit, String value){
        this.suit = suit;
        this.value = value;
        this.isFaceUp = false;
    }

    public String getSuit() {
      //only return the suit if the card is face up
        if(isFaceUp){
            return suit;
        }
        else {
            return "#";
        }
    }
    public String getValue() {
        if(isFaceUp) {
            return value;
        }
        else {
            return "#";
        }
    }

    //returns value of card
    public int getPointValue() throws Exception {
        if(isFaceUp){
            if(this.value.equalsIgnoreCase("2")){ return 2; }
            else if(this.value.equalsIgnoreCase("3")){ return 3; }
            else if(this.value.equalsIgnoreCase("4")){ return 4; }
            else if(this.value.equalsIgnoreCase("5")){ return 5; }
            else if(this.value.equalsIgnoreCase("6")){ return 6; }
            else if(this.value.equalsIgnoreCase("7")){ return 7; }
            else if(this.value.equalsIgnoreCase("8")){ return 8; }
            else if(this.value.equalsIgnoreCase("9")){ return 9; }
            else if(this.value.equalsIgnoreCase("10")){ return 10; }
            else if(this.value.equalsIgnoreCase("J")){ return 10; }
            else if(this.value.equalsIgnoreCase("Q")){ return 10; }
            else if(this.value.equalsIgnoreCase("K")){ return 10; }
            else if(this.value.equalsIgnoreCase("A")){ return 11; }
            else{ throw new Exception("Invalid Card Value"); }
        }
        else {
            throw new Exception("Can't get the value of a face down card.");
        }
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    //action method
    public void  flip(){
        isFaceUp = !isFaceUp; //not operation reverses value
    }
    /**
    public void DisplayCard(){
        System.out.println(this.value + " of " + this.suit);
    }
     */
    @Override
    public String toString(){
        return this.value + " of " + this.suit;
    }

}
