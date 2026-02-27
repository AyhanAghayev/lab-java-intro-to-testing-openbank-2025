package org.example.Characters;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class WizardTest {
    @Mock
    private SpellLibrary spellLibraryMock;

    private Wizard wizard;

    @BeforeEach
    void setUp() {
        wizard = new Wizard(100, 10, 2, "Ice", spellLibraryMock);
    }

    @Test
    void castRandomSpellCallsLibraryOnceAndReturnsCorrectString() {

        when(spellLibraryMock.getRandomSpell()).thenReturn("Freeze");

        String result = wizard.castRandomSpell();

        assertEquals("Casting Freeze", result);
        verify(spellLibraryMock, times(1)).getRandomSpell();
    }
}