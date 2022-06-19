package hello.core.validate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @Test
    void maskResidentNumber() {
        String inputNumber="9205301111111";
        String expectedNumber = "920530-1******";
        try {
            Assertions.assertEquals(Validator.maskResidentNumber(inputNumber), expectedNumber);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}