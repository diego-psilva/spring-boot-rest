package com.example.rest.math;

public class SimpleMath {

    public Double sum (Double numberOne, Double numberTwo){
        return numberOne + numberTwo;
    }

    public Double substration (Double numberOne, Double numberTwo){
        return numberOne - numberTwo;
    }

    public Double multiplication (Double numberOne, Double numberTwo){
        return numberOne * numberTwo;
    }

    public Double division (Double numberOne, Double numberTwo){
        return numberOne / numberTwo;
    }

    public Double square (Double number){
        return Math.sqrt(number);
    }
}
