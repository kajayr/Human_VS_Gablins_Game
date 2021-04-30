package com.leo;

import java.util.Scanner;

public class Shop {
    int strength = 5;
    int attack = 2;
    int strengthCost = 2;
    int attackCost = 3;
    public Shop(){

    }
    public void shoppingMessage(){
        System.out.println("Welcome to shopping list");
        System.out.println("5 strength: 2 golds");
        System.out.println("2 attack: 3 golds ");
        System.out.println("What Item do you want for shopping? press s for strength and a for attack or q to leave the shop");
    }
    public void shoppingProcess(String move, Scanner scanner, Human human){
        if(move.equals("shop")){
            while(true){
                shoppingMessage();
                String input = scanner.next();
                if(input.equals("s")){
                    if(human.getGold() < this.strengthCost){
                        System.out.println("sorry, you don't have enough gold!");
                    }else{
                        human.setStrength(this.strength);
                        human.setGold(~((int)this.strengthCost - 1));
                        System.out.println("Now you have more 5 more strength!");
                    }
                }
                if(input.equals("a")){
                    if(human.getGold() < this.strengthCost){
                        System.out.println("sorry, you don't have enough gold!");
                    }else{
                        human.setAttack(this.attack);
                        human.setGold(~((int)this.attackCost - 1));
                        System.out.println("Now you have more 2 more attack!");
                    }
                }
                if(input.equals("q")){
                    break;
                }
            }
        }
    }
}
