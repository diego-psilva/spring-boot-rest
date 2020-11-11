package com.example.rest.converts;

public class NumberConvert {

    public static Double convertToDouble(String strNumber) {
        if (strNumber == null) return 0D; // verfica se é nulo
        String number = strNumber.replaceAll(",", "."); // substitui virgula por ponto
        if(isNumeric(number)) return Double.parseDouble(number);
        return 0D;
    }

    public static boolean isNumeric(String strNumber) {

        if (strNumber == null) return false; // verfica se é nulo
        String number = strNumber.replaceAll(",", "."); // substitui virgula por ponto
        return number.matches("[-+]?[0-9]*\\.?[0-9]+"); // verifica se é um numero
    }
}
