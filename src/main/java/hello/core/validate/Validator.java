package hello.core.validate;

public class Validator {
    public Validator() {
    }

    public static String maskResidentNumber(String plainNumber) throws Exception {
        plainNumber = plainNumber.replaceAll("\\D", "");
        if(plainNumber.length() != 13)
            throw new Exception("주민번호 13자리 모두 입력해주세요");
        String maskedNumber = plainNumber.replaceAll("(\\d{6})(\\d{1})\\d*", "$1-$2******");
        return maskedNumber;
    }

}
