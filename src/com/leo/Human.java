package com.leo;

import java.util.ArrayList;

public class Human {
    ArrayList<String> inventory = new ArrayList<>(5);
    String name = "anonymous";
    int strength = 10;
    int attack = 5;
    int gold = 0;

    public Human(String name){
        this.name = name;
    }
//    public void setName(int attack){
    // if name equals "" return default
//        this.name = name;
//    }
    public void setAttack(int attack){
        this.attack += attack;
    }
    public void setStrength(int strength){
        this.strength += strength;
    }
    public void setGold(int gold){
        this.gold += gold;
    }
    public void setInventory(int index, String item){
        this.inventory.set(index, item);
    }
    @Override
    public String toString(){
        return " Name: " + this.name +"\n Strength: " + this.strength + "\n Attack: " + this.attack + "\n Gold: " + this.gold + "\n Inventory: " + this.inventory;
    }
}
