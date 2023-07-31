package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    protected boolean hasExtraCheese;
    protected boolean hasExtraToppings;
    private boolean hasPaperBag;

    public Pizza(Boolean isVeg){
            this.price = isVeg ? 300 : 400;
            this.isVeg = isVeg;
            this.hasExtraCheese = false;
            this.hasExtraToppings = false;
            this.hasPaperBag = false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (!hasExtraCheese) {
            price += 80;
            hasExtraCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (!hasExtraToppings) {
            int toppingsPrice = isVeg ? 70 : 120;
            price+= toppingsPrice;
            hasExtraToppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (!hasPaperBag) {
            price += 20;
            hasPaperBag = true;
        }
    }

    public String getBill(){
        // your code goes here
        StringBuilder sb=new StringBuilder();
        sb.append("Base Price Of The Pizza: ").append(isVeg ?"300":"400").append("\n");
        if(hasExtraCheese)
        sb.append("Extra Cheese Added: 80"+"\n");
        if(hasExtraToppings)
            sb.append("Extra Toppings Added: ").append(isVeg ?"70":"120").append("\n");
        if(hasPaperBag)
            sb.append("Paperbag Added: 20").append("\n");
        sb.append("Total Price: "+price).append("\n");
        return sb.toString();
    }
}
