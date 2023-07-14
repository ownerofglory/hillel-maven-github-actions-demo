package ua.ithillel.maven;

import com.fasterxml.jackson.databind.ObjectMapper;
//import com.ownerofglory.hillellib.LibClass;
import ua.ithillel.maven.calc.Calculator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Application running...");

//        LibClass.method();

        ObjectMapper objectMapper = new ObjectMapper();

        double a = 12.0;
        double b = 34.0;

        Calculator calculator = new Calculator();
        double result = calculator.add(a, b);

        System.out.printf("%f + %f = %f%n", a, b, result);

        System.out.println("Application finished...");
    }
}