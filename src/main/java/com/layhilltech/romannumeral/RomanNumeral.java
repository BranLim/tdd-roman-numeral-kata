package com.layhilltech.romannumeral;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumeral {

    private Map<Integer, String> romanNumerals = new LinkedHashMap<>();

    public RomanNumeral() {
        romanNumerals.put(50, "L");
        romanNumerals.put(40, "XL");
        romanNumerals.put(10, "X");
        romanNumerals.put(9, "IX");
        romanNumerals.put(5, "V");
        romanNumerals.put(4, "IV");
        romanNumerals.put(1, "I");
    }

    public String convert(int number) {

        StringBuilder romanNumber = new StringBuilder();
        for (Map.Entry<Integer, String> entry : romanNumerals.entrySet()) {
            while (number >= entry.getKey()){
                romanNumber.append(entry.getValue());
                number -= entry.getKey();
            }
        }
        return romanNumber.toString();
    }
}
