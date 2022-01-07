package lesson14;

public class Main2 {
    public static void main(String[] args) {
        String numb1 = "4";
        String numb2 = "1";
        StringUtilsImpl stringUtils = new StringUtilsImpl();
        try {
            stringUtils.div (numb1, numb2);

        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }


    }
}
