package org.example.Characters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {

    @Test
    void constructorSetsAllFieldsCorrectly() {
        Warrior warrior = new Warrior(120, 20, 2, 30);

        assertEquals(120, warrior.getHealth());
        assertEquals(20, warrior.getStrength());
        assertEquals(2, warrior.getLives());
        assertEquals(30, warrior.getForce());
    }

    @Test
    void warriorCanAttackAnotherPlayer() {
        Warrior attacker = new Warrior(100, 25, 3, 10);
        Elf target = new Elf(50, 10, 2, 5);

        attacker.attack(target);

        assertEquals(25, target.getHealth());
        assertEquals(2, target.getLives());
    }

    @Test
    void convertToElfCopiesStatsCorrectly() {
        Warrior warrior = new Warrior(90, 18, 2, 40);

        Elf elf = warrior.convertToElf();

        assertEquals(warrior.getHealth(), elf.getHealth());
        assertEquals(warrior.getStrength(), elf.getStrength());
        assertEquals(warrior.getLives(), elf.getLives());
        assertEquals(0, elf.getSpeed());
    }
}