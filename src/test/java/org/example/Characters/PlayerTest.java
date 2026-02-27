package org.example.Characters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void playerLosesLifeWhenHealthDropsToZero() {
        Warrior attacker = new Warrior(100, 60, 3, 10);
        Elf target = new Elf(50, 10, 2, 5);

        attacker.attack(target);

        assertEquals(1, target.getLives());
        assertEquals(100, target.getHealth()); // reset to originalHealth
    }

    @Test
    void playerDiesWhenLivesReachZero() {
        Warrior attacker = new Warrior(100, 100, 3, 10);
        Elf target = new Elf(50, 10, 1, 5);

        attacker.attack(target);

        assertEquals(0, target.getLives());
    }
}