package com.leo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
// Contains 6 tests
class GoblinsTest {
    Goblins goblins;

    @BeforeEach
    void setUp() {
        goblins = new Goblins("anonymous", 10, 2, 30, 10, true);
    }

    @DisplayName("Testing if Goblin is alive")
    @Test
    void getAlive() {
        assertEquals(true, goblins.getAlive(), "Test #1: The Goblin should be alive");
    }

    @DisplayName("Testing Goblin's strength")
    @Test
    void getStrength() {
        assertEquals(10, goblins.getStrength(), "Test #2: The Goblin's health should be 10");
    }
    @DisplayName("Testing Goblin's maximum attack")
    @Test
    void getMaxAttack() {
        assertEquals(30, goblins.getMaxAttack(), "Test #3: The Goblin's maximum attack should be 30");
    }

    @DisplayName("Testing Goblin's minimum attack")
    @Test
    void getMinAttack() {
        assertEquals(2, goblins.getMinAttack(), "Test #4: The Goblin's minimum attack should be 2");

    }

    @DisplayName("Testing Goblin's name")
    @Test
    void getName() {
        assertEquals("anonymous", goblins.getName(), "Test #5: The Goblin's name should be anonymous");
    }

    @DisplayName("Testing Goblin's gold amount")
    @Test
    void getGold() {
        assertEquals(10, goblins.getGold(), "Test #6: The Goblin should have 10 gold");

    }
}