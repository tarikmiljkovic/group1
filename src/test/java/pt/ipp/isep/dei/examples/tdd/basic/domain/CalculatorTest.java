package pt.ipp.isep.dei.examples.tdd.basic.domain;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CalculatorTest {

    @BeforeAll
    public static void classSetUp() {
        //HACK: for demonstration purposes only
        System.out.println(
                "This is a CalculatorTest class method and takes place before any @Test is executed");
    }

    @AfterAll
    public static void classTearDown() {
        //HACK: for demonstration purposes only
        System.out.println(
                "This is a CalculatorTest class method and takes place after all @Test are executed");
    }

    @BeforeEach
    public void setUp() {
        //HACK: for demonstration purposes only
        System.out.println(
                "\tThis call takes place before each @Test is executed");
    }

    @AfterEach
    public void tearDown() {
        //HACK: for demonstration purposes only
        System.out.println(
                "\tThis call takes place after each @Test is executed");
    }


    @Test
    @Disabled
    public void failingTest() {
        fail("a disabled failing test");
    }

    /**
     * Test to ensure two positive numbers are summed correctly.<p>
     * <p>
     * For demonstration purposes the Arrange/Act/Assert syntax is used:<p>
     * Arrange: one positive number (three) and another positive number (two).<p>
     * Act: sum both numbers (three and two).<p>
     * Assert: the result is five.
     */

    @Test
    public void sum(int first, int second){

        result = new Calculator().sum(first, second);

        assertEquals(expectedResult, result);
    }
    @Test
    public void ensureThreePlusTwoEqualsFive() {

        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int expectedResult = 5;
        int firsOperand = 3;
        int secondOperand = 2;
        int result = 3;

        // Act
        result = new Calculator().sum(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void ensureThreePlusTwoEqualsFive() {

        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int expectedResult = 5;
        int firsOperand = 3;
        int secondOperand = 2;
        int result = 3;

        // Act
        result = new Calculator().sum(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    /**
     * Test to ensure positive and negative numbers are summed correctly.<p>
     * <p>
     * For demonstration purposes the Arrange/Act/Assert syntax is used:<p>
     * Arranje a positive number (three) and a negative number (minus two)<p>
     * Act I sum three to minus two<p>
     * Assert the sum result should be one.
     */
    @Test
    public void ensureThreePlusMinusTwoEqualsOne() {
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int firsOperand = 3;
        int secondOperand = -2;
        int expectedResult = 1;
        int result = 3;

        // Act
        result = new Calculator().sum(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);

    }

     //subtraction
    @Test
    @DisplayName("ensure three minus two equals to one")
    void ensureThreeMinusTwoEqualsToOne() {

        //Arrange
        int firstOperand = 3;
        int secondOperand = 2;
        int expectedResult = 1;


        //Act
        int result = new Calculator().subtract(firstOperand, secondOperand);

        //Assert
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("ensure three minus minus three equals to six")
    void ensureThreeMinusMinusThreeEqualsToSix() {

        //Arrange
        int firstOperand = 3;
        int secondOperand = -3;
        int expectedResult = 6;


        //Act
        int result = new Calculator().subtract(firstOperand, secondOperand);

        //Assert
        assertEquals(expectedResult, result);
    }


    //multiplication
    @Test
    @DisplayName("ensure Four Multiplied by two equals to eight")
    void ensureFourMultipliedByTwoEqualsToEight() {

        //arrange
        int firstOperand = 4;
        int secondOperand = 2;
        int expectedResult = 8;

        //Act
        int result = new Calculator().multiply(firstOperand, secondOperand);

        //Assert
        assertEquals(expectedResult, result);

    }

    @Test
    @DisplayName("ensure four multiplied by minus two equals to minus eight")
    void ensureFourMultipliedByMinusTwoEqualsToMinusEight() {

        //arrange
        int firstOperand = 4;
        int secondOperand = -2;
        int expectedResult = -8;

        //Act
        int result = new Calculator().multiply(firstOperand, secondOperand);

        //Assert
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("ensure minus four multiplied by minus two equals to eight")
    void ensureMinusFourMultipliedByMinusTwoEqualsToEight() {

        //arrange
        int firstOperand = -4;
        int secondOperand = -2;
        int expectedResult = 8;

        //Act
        int result = new Calculator().multiply(firstOperand, secondOperand);

        //Assert
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("ensure four multiplied by zero equals to zero")
    void ensureFourMultipliedByZeroEqualsToZero() {

        //arrange
        int firstOperand = 4;
        int secondOperand = 0;
        int expectedResult = 0;

        //Act
        int result = new Calculator().multiply(firstOperand, secondOperand);

        //Assert
        assertEquals(expectedResult, result);
    }

    //factorial
    @Test
    @DisplayName("ensure three factorial equals to six")
    void ensureThreeFactorialEqualsToSix()
    {
        //arrange
        int number = 3;
        int expectedResult = 6;

        //Act
        int result = new Calculator().factorial(number);

        //Assert
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("ensure five factorial equals to one twenty")
    void ensureFiveFactorialEqualsToOneTwenty() {

        //arrange
        int number = 5;
        int expectedResult = 120;

        //Act
        int result = new Calculator().factorial(number);

        //Assert
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("ensure zero factorial equals to one")
    void ensureZeroFactorialEqualsToOne() {


        //arrange
        int number = 0;
        int expectedResult = 1;

        //Act
        int result = new Calculator().factorial(number);

        //Assert
        assertEquals(expectedResult, result);
    }
    @Test
    @DisplayName("ensure one factorial equals to one")
    void ensureOneFactorialEqualsToOne() {


        //arrange
        int number = 1;
        int expectedResult = 1;

        //Act
        int result = new Calculator().factorial(number);

        //Assert
        assertEquals(expectedResult, result);
    }


}



