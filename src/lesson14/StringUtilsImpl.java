package lesson14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtilsImpl  implements StringUtils {

    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if (number1==number2 || number2 ==null){
            throw new NullPointerException(" первое или второе число не может быть null ");
        }
        double num1;
        double num2;
        try {
            num1 = Double.parseDouble(number1);
            num2 = Double.parseDouble(number2);
        } catch (NumberFormatException e) {
            throw new NumberFormatException(" первое или второе число не является числом ");
        }
        if (num2==0) {
            throw new ArithmeticException(" на ноль делить нельзя ");
        }


        return num1/num2;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        return new int[0];
    }

    @Override
    public void findNumbers(String text) throws CustomException {
        Pattern p = Pattern.compile("(\\d)+\\.(\\d)+");
        Matcher m = p.matcher(text);

        while(m.find()) {
            System.out.println(m.group());
        }
        if (!m.find()){
            throw new CustomException(" чисел нет");
        }

    }
}
