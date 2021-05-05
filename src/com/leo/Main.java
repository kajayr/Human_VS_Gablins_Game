package com.leo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Resources r = new Resources();
        Treasure treasure = new Treasure();
        Info info = new Info();
        Map map = new Map();
        Scanner nameInput = new Scanner(System.in);
        info.getInfo();
        System.out.println("Please choose a name for your human");
        String name = "";
        try{
            name = nameInput.next();
            if(name.length() > 10){
                throw new Exception();
            }
        }catch (Exception e){
            System.out.println("The name should not be more than 10 characters");
            System.out.println("Please choose a name for your human (less than 10 characters)");
            name = nameInput.next();
        }
        Human human = new Human(name);
        Shop shop = new Shop();
        Goblins goblin = new Goblins();
        Goblins goblin1 = new Goblins("Aedirnian", 10,2, 3, 5, true);
        Goblins goblin2 = new Goblins("Cidarian", 13,4, 5, 5, true);
        Goblins goblin3 = new Goblins("Gnome", 15,5, 8, 3, true);
        Goblins goblin4 = new Goblins("Kaedwenian",15, 20, 8, 2, true);
        Goblins goblin5 = new Goblins("Kovirian",25, 30, 10, 0, true);
        for(int i = 0; i < 6; i++){
            human.inventory.add("");
        }
        System.out.println(human);
        ArrayList<String> m = new ArrayList<>(49);
        for(int i = 0; i < 50; i++){
            m.add("");
        }
        for(int i = 0; i < 6; i++){
            m.set(treasure.treasurePosition.get(i), r.t);
        }
        for(int i = 0; i < 5; i++){
            m.set(goblin.goblinPosition.get(i), r.g);
        }
        Scanner scanner = new Scanner(System.in);
        int position = 3;
        boolean isWinning = true;
while(isWinning){
    m.set(position, r.h);
    System.out.println("choose your move: ");
    String move = "";
    try{
        move = scanner.next();
        if(move.length() > 1){
            throw new Exception();
        }
    }catch(Exception e){
        System.out.println("The Character you enter should be either n, s, w, e, i, status, or shop");
    }
    if(move.equals("n")) {
        if (position < 40) {
            m.set(position, "");
            position += 10;
            m.set(position, r.h);
        } else {
            System.out.println("You are lost in woods! please turn back");
        }
    }
    if(move.equals("s")) {
        if (position > 8) {
            m.set(position, "");
            position -= 10;
            m.set(position, r.h);
        } else {
            System.out.println("You are lost in woods! please turn back");
        }
    }
    if(move.equals("e")) {
        if (position < 49) {
            m.set(position, "");
            position += 1;
            m.set(position, r.h);
        } else {
            System.out.println("You are lost in woods! please turn back");
        }
    }
    if(move.equals("w")){
        if(position > 0){
        m.set(position, "");
        position-= 1;
        m.set(position, r.h);
        }else{
    System.out.println("You are lost in woods! please turn back");
        }
    }
    map.getMap(m);
    if(move.equals("status")){
        System.out.println(human);
    }
    if(move.equals("i")){
        info.getInfo();
    }
    shop.shoppingProcess(move, scanner, human);
    treasure.treasurePositions(position, treasure, move, human, m);
    goblin.goblinCharacters(position, goblin, goblin1, goblin2, goblin3, goblin4, goblin5, human,m);
    if(goblin.goblinPosition.size() == 0){
        System.out.println("You killed all the Goblins! You WON the game!");
        isWinning = false;
    }
}}}
