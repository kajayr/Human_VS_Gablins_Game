package com.leo;

import java.util.ArrayList;

public class Human {
    ArrayList<String> inventory = new ArrayList<>(5);
    String name = "anonymous";
    private int strength = 10;
    private int attack = 5;
    private int gold = 0;

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
    public int getStrength(){
        return this.strength;
    }
    public int getAttack(){
        return this.attack;
    }
    public int getGold(){
        return this.gold;
    }
    @Override
    public String toString(){
        return " Name: " + this.name +"\n Strength: " + this.getStrength() + "\n Attack: " + this.getAttack() + "\n Gold: " + this.getGold() + "\n Inventory: " + this.inventory;
    }
}
