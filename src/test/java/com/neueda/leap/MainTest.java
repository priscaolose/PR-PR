package com.neueda.leap;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void mainPrintsExpectedMessages() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOutput = System.out;

        try {
            System.setOut(new PrintStream(output));
            Main.main(new String[0]);
        } finally {
            System.setOut(originalOutput);
        }

        assertEquals(
            "Hello world from the team's Sprint 1 project skeleton"
                + System.lineSeparator()
                + "This is a test to see if the build is working"
                + System.lineSeparator(),
                output.toString());
    }
}
