package com.leo;

public class Shop {
    int strength = 5;
    int attack = 2;
    int strengthCost = -2;
    int attackCost = -3;
    public Shop(){

    }
    public void shopping(){
        System.out.println("Welcome to shopping list");
        System.out.println("5 strength: 2 golds");
        System.out.println("2 attack: 3 golds ");
        System.out.println("What Item do you want for shopping? press s for strength and a for attack");
    }
}
