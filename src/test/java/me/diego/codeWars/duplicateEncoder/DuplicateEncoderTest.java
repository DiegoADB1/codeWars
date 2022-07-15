package me.diego.codeWars.duplicateEncoder;

import org.junit.Test;

import static org.junit.Assert.*;

public class DuplicateEncoderTest {

    @Test
    public void encode() {
        assertEquals(")()())()(()()(",
                DuplicateEncoder.encode("Prespecialized"));

        assertEquals("))))())))",DuplicateEncoder.encode("   ()(   "));
    }
}