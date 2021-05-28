package com.layhilltech.romannumeral;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralTest {

    private RomanNumeral romanNumeral = new RomanNumeral();

    @Test
    void convert1ShouldReturnI() {

        String convert = romanNumeral.convert(1);
        assertEquals("I", convert);
    }

    @Test
    void convert2ShouldReturnII() {

        String convert = romanNumeral.convert(2);
        assertEquals("II", convert);
    }

    @Test
    void convert3ShouldReturnIII() {

        String convert = romanNumeral.convert(3);
        assertEquals("III", convert);
    }

    @Test
    void convert4ShouldReturnIV() {

        String convert = romanNumeral.convert(4);
        assertEquals("IV", convert);
    }

    @Test
    void convert5ShouldReturnV() {

        String convert = romanNumeral.convert(5);
        assertEquals("V", convert);
    }

    @Test
    void convert9ShouldReturnIX() {

        String convert = romanNumeral.convert(9);
        assertEquals("IX", convert);
    }

    @Test
    void convert10ShouldReturnX() {

        String convert = romanNumeral.convert(10);
        assertEquals("X", convert);
    }

    @Test
    void convert14ShouldReturnXIV() {

        String convert = romanNumeral.convert(14);
        assertEquals("XIV", convert);
    }

    @Test
    void convert50ShouldReturnL() {

        String convert = romanNumeral.convert(50);
        assertEquals("L", convert);
    }

    @Test
    void convert40ShouldReturnXL() {

        String convert = romanNumeral.convert(40);
        assertEquals("XL", convert);
    }

    @Test
    void convert30ShouldReturnXXX() {

        String convert = romanNumeral.convert(30);
        assertEquals("XXX", convert);
    }
}
