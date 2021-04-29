package com.leo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Resources r = new Resources();
        System.out.println("Welcome to Human VS Goblins World");
        System.out.println("Here is a quick guide for the game: ");
        System.out.println("Whenever you need some information related to game press i");
        System.out.println("You are the human in this game. You are here: Ϯ");
        System.out.println("Goblins are living in tents => \uD852\uDF62 in order to fight with them, you need to reach them. You can take their gold after you win the fight.");
        System.out.println("There are some random treasure's in the map that you can find: \uD801\uDC37");
        System.out.println("Finally you can move around buy typing => n/s/e/w");
        ArrayList<String> m = new ArrayList<>(70);
        for(int i = 0; i < 70; i++){
            m.add("");
        }
        System.out.println("the size of the map is: " + m.size());
        System.out.println(" ----------------------------------------- ");
        System.out.println("| "+m.get(56)+" | "+m.get(57)+" | "+m.get(58)+" | "+m.get(59)+" | "+m.get(60)+" | "+m.get(61)+" | "+m.get(62)+" | "+m.get(63)+" | "+m.get(64)+" | "+m.get(65)+" | "+m.get(66)+" | "+m.get(67)+" | "+m.get(68)+" | "+m.get(69)+" |");
        System.out.println("| - - - - - - - - - - - - - - - - - - - - |");
        System.out.println("| "+m.get(42)+" | "+m.get(43)+" | "+m.get(44)+" | "+m.get(45)+" | "+m.get(46)+" | "+m.get(47)+" | "+m.get(48)+" | "+m.get(49)+" | "+m.get(50)+" | "+m.get(51)+" | "+m.get(52)+" | "+m.get(53)+" | "+m.get(54)+" | "+m.get(55)+" |");
        System.out.println("| - - - - - - - - - - - - - - - - - - - - |");
        System.out.println("| "+m.get(28)+" | "+m.get(29)+" | "+m.get(30)+" | "+m.get(31)+" | "+m.get(32)+" | "+m.get(33)+" | "+m.get(34)+" | "+m.get(35)+" | "+m.get(36)+" | "+m.get(37)+" | "+m.get(38)+" | "+m.get(39)+" | "+m.get(40)+" | "+m.get(41)+" |");
        System.out.println("| - - - - - - - - - - - - - - - - - - - - |");
        System.out.println("| "+m.get(14)+" | "+m.get(15)+" | "+m.get(16)+" | "+m.get(17)+" | "+m.get(18)+" | "+m.get(19)+" | "+m.get(20)+" | "+m.get(21)+" | "+m.get(22)+" | "+m.get(23)+" | "+m.get(24)+" | "+m.get(25)+" | "+m.get(26)+" | "+m.get(27)+" |");
        System.out.println("| - - - - - - - - - - - - - - - - - - - - |");
        System.out.println("| "+m.get(0)+" | "+m.get(1)+" | "+m.get(2)+" | "+m.get(3)+" | "+m.get(4)+" | "+m.get(5)+" | "+m.get(6)+" | "+m.get(7)+" | "+m.get(8)+" | "+m.get(9)+" | "+m.get(10)+" | "+m.get(11)+" | "+m.get(12)+" | "+m.get(13)+" |");
        System.out.println(" ----------------------------------------- ");
    }
}
