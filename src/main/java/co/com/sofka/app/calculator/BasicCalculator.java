package co.com.sofka.app.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }

    public Long subtraction(Long number1, Long number2) {
        logger.info("Summing {} - {}", number1, number2 );
        return number1-number2;
    }
    public Long multiplication(Long number1, Long number2) {
        logger.info("Summing {} * {}", number1, number2 );
        return number1*number2;
    }
    public Long division(Long number1, Long number2) {
        try {
            logger.info("Summing {} / {}", number1, number2);
            return number1 / number2;
        } catch (Exception e) {
            System.out.println("No se puede hacer division entre 0");
            return null;
        }
    }
}
