package com.leo;

import java.util.ArrayList;

public class Goblins {
    ArrayList<Integer> goblinPosition = new ArrayList<>();
    String name = "anonymous";
    private int strength ;
    private int maxAttack;
    private int minAttack;
    private int gold;
    public Goblins(){
        goblinPosition.add(6);
        goblinPosition.add(13);
        goblinPosition.add(21);
        goblinPosition.add(32);
        goblinPosition.add(46);
    }
    public Goblins(String name, int strength, int minAttack, int maxAttack, int gold){
        this.name = name;
        this.strength = strength;
        this.minAttack = minAttack;
        this.maxAttack = maxAttack;
        this.gold = gold;
    }
    public void setStrength(int strength){
        this.strength-= strength;
    }
    public int getStrength(){
        return this.strength;
    }
    public int getMaxAttack(){
        return this.maxAttack;
    }
    public int getMinAttack(){
        return this.minAttack;
    }
    public String getName(){
        return this.name;
    }
    public int getGold(){
        return this.gold;
    }
    @Override
    public String toString(){
        return " Name: " + this.getName() +"\n Strength: " + this.getStrength() + "\n Max Attack: " + this.getMaxAttack() + "\n Min Attack: " + this.getMinAttack() + "\n Gold: " + this.getGold();
    }
}
