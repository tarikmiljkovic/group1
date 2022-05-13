package pt.ipp.isep.dei.examples.tdd.basic.domain;

/**
 * Calculator class.
 * This class is very simple in order to demonstrate how to build test cases for Unit Testing.
 */
public class Calculator {

    /**
     * Sums one operand to the other, returning the result.
     *
     * @param firstOperand  First operand to sum.
     * @param secondOperand Second Operand to sum.
     * @return The sum of firstOperand with secondOperand.
     */
    public int sum(int firstOperand, int secondOperand) {
        return firstOperand + secondOperand;
    }

    public int divide(int dividend, int divisor) {
        return dividend / divisor;
    }

     public int multiply(int firstOperand, int secondOperand)
    {
        return firstOperand * secondOperand;
    }

    public int factorial(int number)
    {
       if(number<0)
       {
         throw new ArithmeticException("Number must be equal to zero or greater than zero");
       }
       else if ((number == 0)||(number == 1)){

           return 1;
       }
       else
       {
           return  number* factorial( number-1 );
       }

    }


    public int subtract(int firstOperand, int secondOperand)
    {
        return firstOperand - secondOperand;
    }
}
