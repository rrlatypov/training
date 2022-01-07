package homeWork14;

import lesson14.CustomException;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtilsImplHome implements StringUtils {
    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        return 0;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        Matcher m = Pattern.compile(word.toLowerCase()).matcher(text.toLowerCase());
        List<Integer> position = new ArrayList<Integer>();
        boolean hasWord = false;

        while (m.find()){
            position.add(m.start());
            hasWord = true;
        }
        if (!hasWord){
            throw new NullPointerException(" нет подходящих слов в тексте");
        }
        int [] resultArray = new int[position.size()];
        for (int i = 0; i<resultArray.length; i++){
            resultArray [i] = position.get (i);
        }


        return resultArray;
    }

    @Override
    public void findNumbers(String text) throws CustomException {

    }
}
