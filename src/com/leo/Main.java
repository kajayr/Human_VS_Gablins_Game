package com.leo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Resources r = new Resources();
        Treasure treasure = new Treasure();
        System.out.println("Welcome to Human VS Goblins World");
        System.out.println("Here is a quick guide for the game: ");
        System.out.println("Whenever you need some information related to game press i");
        System.out.println("You are the human in this game. You are here: Ϯ");
        System.out.println("Goblins are living in tents => \uD852\uDF62 in order to fight with them, you need to reach them. You can take their gold after you win the fight.");
        System.out.println("There are some random treasure's in the map that you can find: \uD801\uDC37");
        System.out.println("Finally you can move around buy typing => n/s/e/w");
        ArrayList<String> m = new ArrayList<>(49);
        for(int i = 0; i < 50; i++){
            m.add("");
        }
        for(int i = 0; i < 6; i++){
            m.add((Integer) treasure.treasurePosition.get(i), r.t);
        }
        Scanner scanner = new Scanner(System.in);
        int position = 3;
while(true){
    m.set(position, r.h);
    System.out.println("choose your move: ");
    String move = scanner.next();
    if(move.equals("n")) {
        if (position < 40) {
            m.set(position, "");
            position += 10;
            m.set(position, r.h);
        } else {
            System.out.println("You are lost in woods! please turn back from North");
        }
    }
    if(move.equals("s")) {
        if (position > 8) {
            m.set(position, "");
            position -= 10;
            m.set(position, r.h);
        } else {
            System.out.println("You are lost in woods! please turn back from South");
        }
    }
    if(move.equals("e")) {
        if (position < 49) {
            m.set(position, "");
            position += 1;
            m.set(position, r.h);
        } else {
            System.out.println("You are lost in woods! please turn back from North East");
        }
    }
    if(move.equals("w")){
        if(position > 0){
        m.set(position, "");
        position-= 1;
        m.set(position, r.h);
        }else{
    System.out.println("You are lost in woods! please turn back from North East");
        }
    }
    //Treasures
    if(position == (Integer) treasure.treasurePosition.get(0)){
        if(treasure.treasurePosition.get(0) != null){
            System.out.println("Here is a treasure!");
            treasure.treasurePosition.remove(0);
        }
    }
    if(position == (Integer) treasure.treasurePosition.get(0)){
        if(treasure.treasurePosition.get(1) != null){
            System.out.println("Here is a treasure!");
            treasure.treasurePosition.remove(0);
        }
    }
    if(position == (Integer) treasure.treasurePosition.get(0)){
        if(treasure.treasurePosition.get(2) != null){
            System.out.println("Here is a treasure!");
            treasure.treasurePosition.remove(0);
        }
    }
    if(position == (Integer) treasure.treasurePosition.get(0)){
        if(treasure.treasurePosition.get(3) != null){
            System.out.println("Here is a treasure!");
            treasure.treasurePosition.remove(0);
        }
    }
    if(position == (Integer) treasure.treasurePosition.get(0)){
        if(treasure.treasurePosition.get(4) != null){
            System.out.println("Here is a treasure!");
            treasure.treasurePosition.remove(0);
        }
    }
    if(position == (Integer) treasure.treasurePosition.get(0)){
        if(treasure.treasurePosition.get(5) != null){
            System.out.println("Here is a treasure!");
            treasure.treasurePosition.remove(0);
        }
    }
    System.out.println(" -------------------------- ");
    System.out.println("| "+m.get(40)+" | "+m.get(41)+" | "+m.get(42)+" | "+m.get(43)+" | "+m.get(44)+" | "+m.get(45)+" | "+m.get(46)+" | "+m.get(47)+" | "+m.get(48)+" | "+m.get(49));
    System.out.println("| - - - - - - - - - - - - -");
    System.out.println("| "+m.get(30)+" | "+m.get(31)+" | "+m.get(32)+" | "+m.get(33)+" | "+m.get(34)+" | "+m.get(35)+" | "+m.get(36)+" | "+m.get(37)+" | "+m.get(38)+" | "+m.get(39));
    System.out.println("| - - - - - - - - - - - - -");
    System.out.println("| "+m.get(20)+" | "+m.get(21)+" | "+m.get(22)+" | "+m.get(23)+" | "+m.get(24)+" | "+m.get(25)+" | "+m.get(26)+" | "+m.get(27)+" | "+m.get(28)+" | "+m.get(29));
    System.out.println("| - - - - - - - - - - - - -");
    System.out.println("| "+m.get(10)+" | "+m.get(11)+" | "+m.get(12)+" | "+m.get(13)+" | "+m.get(14)+" | "+m.get(15)+" | "+m.get(16)+" | "+m.get(17)+" | "+m.get(18)+" | "+m.get(19));
    System.out.println("| - - - - - - - - - - - - -");
    System.out.println("| "+m.get(0)+" | "+m.get(1)+" | "+m.get(2)+" | "+m.get(3)+" | "+m.get(4)+" | "+m.get(5)+" | "+m.get(6)+" | "+m.get(7)+" | "+m.get(8)+" | "+m.get(9));
    System.out.println(" -------------------------- ");
}
    }
}
