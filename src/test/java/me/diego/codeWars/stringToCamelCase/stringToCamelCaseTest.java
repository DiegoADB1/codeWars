package me.diego.codeWars.stringToCamelCase;

import org.junit.Test;

import static org.junit.Assert.*;

public class stringToCamelCaseTest {
    @Test
    public void testSomeUnderscoreLowerStart() {
        String input = "the_Stealth_Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", stringToCamelCase.toCamelCase(input));
    }
    @Test
    public void testSomeDashLowerStart() {
        String input = "the-Stealth-Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", stringToCamelCase.toCamelCase(input));
    }
}