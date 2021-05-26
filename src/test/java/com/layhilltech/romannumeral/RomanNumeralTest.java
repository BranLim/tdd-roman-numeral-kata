package com.layhilltech.romannumeral;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralTest {

    @Test
    void testConvert1ShouldReturnI() {
        RomanNumeral romanNumeral = new RomanNumeral();
        String convert = romanNumeral.convert(1);
        assertEquals("I", convert);
    }

    @Test
    void testConvert2ShouldReturnII() {
        RomanNumeral romanNumeral = new RomanNumeral();
        String convert = romanNumeral.convert(2);
        assertEquals("II", convert);
    }

    @Test
    void testConvert3ShouldReturnIII() {
        RomanNumeral romanNumeral = new RomanNumeral();
        String convert = romanNumeral.convert(3);
        assertEquals("III", convert);
    }

    @Test
    void testConvert4ShouldReturnIV() {
        RomanNumeral romanNumeral = new RomanNumeral();
        String convert = romanNumeral.convert(4);
        assertEquals("IV", convert);
    }

    @Test
    void testConvert5ShouldReturnV() {
        RomanNumeral romanNumeral = new RomanNumeral();
        String convert = romanNumeral.convert(5);
        assertEquals("V", convert);
    }

    @Test
    void testConvert9ShouldReturnIX() {
        RomanNumeral romanNumeral = new RomanNumeral();
        String convert = romanNumeral.convert(9);
        assertEquals("IX", convert);
    }

    @Test
    void testConvert10ShouldReturnX() {
        RomanNumeral romanNumeral = new RomanNumeral();
        String convert = romanNumeral.convert(10);
        assertEquals("X", convert);
    }

    @Test
    void testConvert14ShouldReturnXIV() {
        RomanNumeral romanNumeral = new RomanNumeral();
        String convert = romanNumeral.convert(14);
        assertEquals("XIV", convert);
    }

    @Test
    void testConvert50ShouldReturnL() {
        RomanNumeral romanNumeral = new RomanNumeral();
        String convert = romanNumeral.convert(50);
        assertEquals("L", convert);
    }

    @Test
    void testConvert40ShouldReturnXL() {
        RomanNumeral romanNumeral = new RomanNumeral();
        String convert = romanNumeral.convert(40);
        assertEquals("XL", convert);
    }

    @Test
    void testConvert30ShouldReturnXXX() {
        RomanNumeral romanNumeral = new RomanNumeral();
        String convert = romanNumeral.convert(30);
        assertEquals("XXX", convert);
    }
}
