package hello.core.validate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
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

    @Test
    void otherTypeResidentNumber() {
        String inputNumber="920530-1111111";
        String expectedNumber = "920530-1******";
        try {
            Assertions.assertEquals(Validator.maskResidentNumber(inputNumber), expectedNumber);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @DisplayName("비정상적인 주민등록번호")
    void invalidResidentNumber(){
        String inputNumber="9205301111";
        Assertions.assertThrows(Exception.class, ()->Validator.maskResidentNumber(inputNumber));
    }
}