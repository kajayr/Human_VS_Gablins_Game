package com.leo;

import java.util.ArrayList;

public class Goblins {
    ArrayList<Integer> goblinPosition = new ArrayList<>();
    String name = "anonymous";
    private int strength ;
    private int maxAttack;
    private int minAttack;
    private int gold;
    private boolean isAlive;
    public Goblins(){
        goblinPosition.add(6);
        goblinPosition.add(13);
        goblinPosition.add(21);
        goblinPosition.add(32);
        goblinPosition.add(46);
    }
    public Goblins(String name, int strength, int minAttack, int maxAttack, int gold, boolean isAlive){
        this.name = name;
        this.strength = strength;
        this.minAttack = minAttack;
        this.maxAttack = maxAttack;
        this.gold = gold;
        this.isAlive = isAlive;
    }
    public void setStrength(int strength){
        this.strength-= strength;
    }
    public void setAlive(boolean isAlive){
        this.isAlive= isAlive;
    }
    public boolean getAlive(){
        return this.isAlive;
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

    public void goblinCharacters(int position, Goblins goblin, Goblins goblin1, Goblins goblin2, Goblins goblin3, Goblins goblin4, Goblins goblin5, Human human, ArrayList m){
        if(position == goblin.goblinPosition.get(0)){
            if(goblin1.getAlive()){
                System.out.println(goblin1);
                System.out.println("================================");
                double randomAttack =  Math.floor((Math.random() * goblin1.getMaxAttack()) + goblin1.getMinAttack());
                System.out.println("Goblin's random attack between " + goblin1.getMinAttack() + " and " + (goblin1.getMaxAttack()) + " is : "  + (int)randomAttack);
                System.out.println("================================");
                if(human.getStrength() < (int)randomAttack){
                    System.out.println(goblin1.name + " killed you!\nGame Over!");
                    System.out.println(human);
                    System.exit(1);
                }else{
                    while(goblin1.getStrength() > 0 ){
                        int randomAttackVal = (~((int)randomAttack - 1));
                        human.setStrength(randomAttackVal);
                        goblin1.setStrength(human.getAttack());
                        if(human.getStrength() < 0){
                            System.out.println(goblin1.name + " killed you!\nGame Over!");
                            System.out.println(human);
                            System.exit(1);
                        }
                        if(goblin1.getStrength() < 0){
                            break;
                        }
                    }
                    if(human.getStrength() > 0){
                        System.out.println("Congratulations! you killed " + goblin1.name);
                        human.setGold(goblin1.getGold());
                        goblin1.setAlive(false);
      //                  goblinPosition.remove(0);
                        System.out.println("Your current status is: \n" + human);
                    }
                }
                m.set(goblin.goblinPosition.get(0), "");
            }
        }
        //goblin2
        if(position == goblin.goblinPosition.get(1)){
            if(goblin2.getAlive()){
                System.out.println(goblin2);
                System.out.println("================================");
                double randomAttack = Math.floor((Math.random() * goblin2.getMaxAttack()) + goblin2.getMinAttack());

                System.out.println("Goblin's random attack between " + goblin2.getMinAttack() + " and " + (goblin2.getMaxAttack()) + " is : "  + (int)randomAttack);
                System.out.println("================================");
                if(human.getStrength() < (int)randomAttack){
                    System.out.println(goblin2.name + " killed you!\nGame Over!");
                    System.exit(1);
                }else{
                    while(goblin2.getStrength() > 0 ){
                        int randomAttackVal = (~((int)randomAttack - 1));
                        human.setStrength(randomAttackVal);
                        goblin2.setStrength(human.getAttack());
                        if(human.getStrength() < 0){
                            System.out.println(goblin2.name + " killed you!\nGame Over!");
                            System.out.println(human);
                            break;
                        }
                    }
                    if(human.getStrength() > 0){
                        System.out.println("Congratulations! you killed " + goblin2.name);
                        human.setGold(goblin2.getGold());
                        goblin2.setAlive(false);
                        System.out.println("Your current status is: \n" + human);
                    }
                }
            }
        }

        //goblin3
        if(position == goblin.goblinPosition.get(2)){
            if(goblin3.getAlive()){
                System.out.println(goblin3);
                System.out.println("================================");
                double randomAttack = Math.floor((Math.random() * goblin3.getMaxAttack()) + goblin3.getMinAttack());

                System.out.println("Goblin's random attack between " + goblin3.getMinAttack() + " and " + (goblin3.getMaxAttack()) + " is : "  + (int)randomAttack);
                System.out.println("================================");
                if(human.getStrength() < randomAttack){
                    System.out.println(goblin3.name + " killed you!\nGame Over!");
                    System.out.println(human);
                    System.exit(1);
                }else{
                    while(goblin3.getStrength() > 0 ){
                        int randomAttackVal = (~((int)randomAttack - 1));
                        human.setStrength(randomAttackVal);
                        goblin3.setStrength(human.getAttack());
                        if(human.getStrength() < 0){
                            System.out.println(goblin3.name + " killed you!\nGame Over!");
                            break;
                        }
                    }
                    if(human.getStrength() > 0){
                        System.out.println("Congratulations! you killed " + goblin3.name);
                        human.setGold(goblin3.getGold());
                        goblin3.setAlive(false);
                        System.out.println("Your current status is: \n" + human);
                    }
                }
            }
        }
        //goblin4
        if(position == goblin.goblinPosition.get(3)){
            if(goblin4.getAlive()){
                System.out.println(goblin4);
                System.out.println("================================");
                double randomAttack = Math.floor((Math.random() * goblin4.getMaxAttack()) + goblin4.getMinAttack());

                System.out.println("Goblin's random attack between " + goblin4.getMinAttack() + " and " + (goblin4.getMaxAttack()) + " is : "  + (int)randomAttack);
                System.out.println("================================");
                if(human.getStrength() < (int)randomAttack){
                    System.out.println(goblin4.name + " killed you!\nGame Over!");
                    System.out.println(human);
                    System.exit(1);
                }else{
                    while(goblin4.getStrength() > 0 ){
                        int randomAttackVal = (~((int)randomAttack - 1));
                        human.setStrength(randomAttackVal);
                        goblin4.setStrength(human.getAttack());
                        if(human.getStrength() < 0){
                            System.out.println(goblin4.name + " killed you!\nGame Over!");
                            break;
                        }
                    }
                    if(human.getStrength() > 0){
                        System.out.println("Congratulations! you killed " + goblin4.name);
                        human.setGold(goblin4.getGold());
                        goblin4.setAlive(false);
                        System.out.println("Your current status is: \n" + human);
                    }
                }
            }
        }
        //goblin5
        if(position == goblin.goblinPosition.get(4)){
            if(goblin5.getAlive()){
                System.out.println(goblin5);
                System.out.println("================================");
                double randomAttack = Math.floor((Math.random() * goblin5.getMaxAttack()) + goblin5.getMinAttack());

                System.out.println("Goblin's random attack between " + goblin5.getMinAttack() + " and " + (goblin5.getMaxAttack()) + " is : "  + (int)randomAttack);
                System.out.println("================================");
                if(human.getStrength() < (int)randomAttack){
                    System.out.println(goblin5.name + " killed you!\nGame Over!");
                    System.out.println(human);
                    System.exit(1);
                }else{
                    while(goblin5.getStrength() > 0 ){
                        int randomAttackVal = (~((int)randomAttack - 1));
                        human.setStrength(randomAttackVal);
                        goblin5.setStrength(human.getAttack());
                        if(human.getStrength() < 0){
                            System.out.println(goblin5.name + " killed you!\nGame Over!");
                            break;
                        }
                    }
                    if(human.getStrength() > 0){
                        System.out.println("Congratulations! you killed " + goblin5.name);
                        human.setGold(goblin5.getGold());
                        goblin5.setAlive(false);
                        System.out.println("Your current status is: \n" + human);
                    }
                }
            }
        }
    }
    @Override
    public String toString(){
        return " Name: " + this.getName() +"\n Strength: " + this.getStrength() + "\n Max Attack: " + this.getMaxAttack() + "\n Min Attack: " + this.getMinAttack() + "\n Gold: " + this.getGold();
    }
}
