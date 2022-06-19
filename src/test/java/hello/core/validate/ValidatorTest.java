package hello.core.validate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @Test
    void maskResidentNumber() throws Exception {
        String inputNumber = "9205301111111";
        String expectedNumber = "920530-1******";
        Assertions.assertEquals(Validator.maskResidentNumber(inputNumber), expectedNumber);
    }

    @Test
    void otherTypeResidentNumber() throws Exception {
        String inputNumber = "920530-1111111";
        String expectedNumber = "920530-1******";
        Assertions.assertEquals(Validator.maskResidentNumber(inputNumber), expectedNumber);
    }

    @Test
    @DisplayName("비정상적인 주민등록번호")
    void invalidResidentNumber() {
        String inputNumber = "9205301111";
        Assertions.assertThrows(Exception.class, () -> Validator.maskResidentNumber(inputNumber));
    }
}