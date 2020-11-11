package com.example.rest.resource;

import com.example.rest.exception.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.*;

@RestController
public class MathController {


   @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
   public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numeberTwo) throws Exception {

      if (!isNumeric(numberOne) || !isNumeric(numeberTwo)) {

         throw new UnsupportedMathOperationException("Please set a number value");
      }

      Double sum = convertToDouble(numberOne) + convertToDouble(numeberTwo);

      return sum;
   }

   private Double convertToDouble(String strNumber) {
      if (strNumber == null) return 0D; // verfica se é nulo
      String number = strNumber.replaceAll(",", "."); // substitui virgula por ponto
      if(isNumeric(number)) return Double.parseDouble(number);
      return 0D;
   }

   private boolean isNumeric(String strNumber) {

      if (strNumber == null) return false; // verfica se é nulo
      String number = strNumber.replaceAll(",", "."); // substitui virgula por ponto
      return number.matches("[-+]?[0-9]*\\.?[0-9]+"); // verifica se é um numero
   }


}