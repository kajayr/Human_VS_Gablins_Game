package com.leo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {
    Human human;

    @BeforeEach
    void setUp() {
        human = new Human("anonymous");
    }

    @DisplayName("Testing Human's name")
    @Test
    void name() {
        assertEquals("anonymous", human.name, "Test #1: The Human's name should be anonymous");
    }
}