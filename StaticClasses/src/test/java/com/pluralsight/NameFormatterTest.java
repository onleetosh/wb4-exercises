package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {

    @org.junit.jupiter.api.Test
    void testFormat_String_first_and_last() {
        // arrange: set up the input values
        String firstName = "Tashi";
        String lastName = "Thompson";

        // act: call the method you want to test
        String result = NameFormatter.format(firstName, lastName);

        // assert: verify the result is as expected
        assertEquals("Tashi Thompson", result);


    }

    @org.junit.jupiter.api.Test
    void testFormat_String_fullName_with_Pre_and_Suffix() {
        // arrange: set up the input values
        String prefix = "  ";
        String firstName = " Monkey ";
        String middleName = " D. ";
        String lastName = " Luffy ";
        String suffix = "  ";

        // act: call the method you want to test
        String result = NameFormatter.format(prefix, firstName, middleName, lastName, suffix);

        // assert: verify the result is as expected
        String expected = " Monkey D. Luffy "; // Adjusted expected result
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void testFormat_String_fullName() {

        // arrange: set up the input values
        String fullName = "  Tashi Thompson   ";

        // act: call the method you want to test
        String result = NameFormatter.format(fullName);

        // assert: verify the result is as expected
        assertEquals("Tashi Thompson", result);

    }
}