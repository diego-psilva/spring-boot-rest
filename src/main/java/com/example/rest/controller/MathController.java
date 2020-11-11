package com.example.rest.controller;

import com.example.rest.converts.NumberConvert;
import com.example.rest.exception.UnsupportedMathOperationException;
import com.example.rest.math.SimpleMath;
import org.springframework.web.bind.annotation.*;

@RestController
public class MathController {

    SimpleMath math = new SimpleMath();


   @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
   public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numeberTwo) throws Exception {

      if (!NumberConvert.isNumeric(numberOne) || !NumberConvert.isNumeric(numeberTwo)) {

         throw new UnsupportedMathOperationException("Please set a number value");
      }

      return math.sum(NumberConvert.convertToDouble(numberOne), NumberConvert.convertToDouble(numeberTwo));
   }

    @RequestMapping(value = "/subtraction/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double subtraction(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numeberTwo) throws Exception {

        if (!NumberConvert.isNumeric(numberOne) || !NumberConvert.isNumeric(numeberTwo)) {

            throw new UnsupportedMathOperationException("Please set a number value");
        }

        return math.substration(NumberConvert.convertToDouble(numberOne), NumberConvert.convertToDouble(numeberTwo));

    }

    @RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double multiplication(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numeberTwo) throws Exception {

        if (!NumberConvert.isNumeric(numberOne) || !NumberConvert.isNumeric(numeberTwo)) {

            throw new UnsupportedMathOperationException("Please set a number value");
        }
        return math.multiplication(NumberConvert.convertToDouble(numberOne), NumberConvert.convertToDouble(numeberTwo));

    }

    @RequestMapping(value = "/division/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double division(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numeberTwo) throws Exception {

        if (!NumberConvert.isNumeric(numberOne) || !NumberConvert.isNumeric(numeberTwo)) {

            throw new UnsupportedMathOperationException("Please set a number value");
        }

        return math.division(NumberConvert.convertToDouble(numberOne), NumberConvert.convertToDouble(numeberTwo));

    }


    @RequestMapping(value = "/square/{numberOne}", method = RequestMethod.GET)
    public Double square(@PathVariable("numberOne") String numberOne) throws Exception {

        if (!NumberConvert.isNumeric(numberOne)) {

            throw new UnsupportedMathOperationException("Please set a number value");
        }

        return math.square(NumberConvert.convertToDouble(numberOne));

    }

}