package com.example.junittestproject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringHelperTest {
    StringHelper stringHelper = new StringHelper();
    @Test
    void testTruncateAInFirst2Positions_AInFirsTwoPositions() {
        assertEquals("CD", stringHelper.truncateAInFirst2Positions("AACD"));
    }
    @Test
    void testTruncateAInFirst2Positions2_AInFirstPosition() {
        assertEquals("CD", stringHelper.truncateAInFirst2Positions("ACD"));
    }
    @Test
    public void testTruncateAInFirst2Positions3_NoAAtAll() {
        assertEquals("CDEF", stringHelper.truncateAInFirst2Positions("CDEF"));
    }
    @Test
    public void testTruncateAInFirst2Positions4_AAtLastTwoPositions() {
        assertEquals("CDAA", stringHelper.truncateAInFirst2Positions("CDAA"));
    }
    @Test
    void testAreFirstAndLastTwoCharactersTheSame_TwoCharactersTheSame() {
        assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("AB"));
    }
    @Test
    void testAreFirstAndLastTwoCharactersTheSame_PositiveScenario() {
        assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("ACAC"));
    }
    @Test
    void testAreFirstAndLastTwoCharactersTheSame_OnlyOneCharacter() {
        assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("A"));
    }
    @Test
    void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
        assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("ABCD"),"Something go wrong");
    }

}