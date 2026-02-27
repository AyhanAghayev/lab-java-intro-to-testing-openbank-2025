package org.example.Characters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElfTest {

    @Test
    void constructorSetsAllFieldsCorrectly() {
        Elf elf = new Elf(80, 15, 3, 20);
        assertEquals(80, elf.getHealth());
        assertEquals(15, elf.getStrength());
        assertEquals(3, elf.getLives());
        assertEquals(20, elf.getSpeed());
    }

    @Test
    void elfCanAttackAnotherPlayer() {
        Elf attacker = new Elf(100, 10, 3, 15);
        Elf target = new Elf(100, 5, 3, 10);
        attacker.attack(target);

        assertEquals(90, target.getHealth());
        assertEquals(3, target.getLives());
    }
}