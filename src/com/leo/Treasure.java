package com.leo;

import java.util.ArrayList;

public class Treasure {
    ArrayList<Integer> treasurePosition = new ArrayList<>();
    public Treasure(){
        treasurePosition.add(10);
        treasurePosition.add(16);
        treasurePosition.add(23);
        treasurePosition.add(26);
        treasurePosition.add(34);
        treasurePosition.add(41);
    }
    public void treasurePositions(int position, Treasure treasure, String move, Human human, ArrayList m){
        if(position == treasure.treasurePosition.get(0) && !move.equals("status")){
            if(!human.inventory.contains("Sword")){
                System.out.println("Here is a treasure!");
                System.out.println("You found a sword!");
                human.setInventory(0,"Sword");
                System.out.println("A Sword has been added to your inventory. 5 added to your attack ");
                human.setAttack(5);
                m.set(treasure.treasurePosition.get(0), "");
            }
        }
        if(position == treasure.treasurePosition.get(1) && !move.equals("status")){
            if(!human.inventory.contains("Shield")){
                System.out.println("Here is a treasure!");
                System.out.println("You found a shield!");
                human.setInventory(1,"Shield");
                System.out.println("A Shield has been added to your inventory. 5 added to your strength ");
                human.setStrength(5);
                m.set(treasure.treasurePosition.get(1), "");
            }
        }
        if(position == treasure.treasurePosition.get(2) && !move.equals("status")){
            if(!human.inventory.contains("Watermelon")){
                System.out.println("Here is a treasure!");
                System.out.println("You found a watermelon!");
                human.setInventory(2,"Watermelon");
                System.out.println("A Watermelon has been added to your inventory. 2 added to your strength ");
                human.setStrength(2);
                m.set(treasure.treasurePosition.get(2), "");
            }
        }
        if(position == treasure.treasurePosition.get(3) && !move.equals("status")){
            if(!human.inventory.contains("Gold")){
                System.out.println("Here is a treasure!");
                System.out.println("You found 20 gold!");
                System.out.println("20 gold has been added to your packet!");
                human.setGold(20);
                human.setInventory(3,"Gold");
                m.set(treasure.treasurePosition.get(3), "");
            }
        }
        if(position == treasure.treasurePosition.get(4) && !move.equals("status")){
            if(!human.inventory.contains("Helmet")){
                System.out.println("Here is a treasure!");
                System.out.println("You found a helmet!");
                human.setInventory(4,"Helmet");
                System.out.println("A Helmet has been added to your inventory. 5 added to your strength ");
                human.setStrength(3);
                m.set(treasure.treasurePosition.get(4), "");
            }
        }
        if(position == treasure.treasurePosition.get(5) && !move.equals("status")){
            if(!human.inventory.contains("Spear")){
                System.out.println("Here is a treasure!");
                System.out.println("You found a spear!");
                human.setInventory(5,"Spear");
                System.out.println("A Spear has been added to your inventory. 5 added to your attack ");
                human.setAttack(5);
                m.set(treasure.treasurePosition.get(4), "");
            }
        }
    }

}
