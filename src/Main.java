import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //-128 to 127. 1 byte
        byte byte1 = 1;
        //Stores whole numbers from -32,768 to 32,767 2 bytes
        short short1 = 3276;
        //Stores whole numbers from -2,147,483,648 to 2,147,483,647 4 bytes
        int int1 = 19;
        //Wrapper, lo veremos más adelante
        Integer int2 = 25;
        //-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 8 bytes
        long long1 = 208080808080808L;

        //Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits, 4 bytes
        float float1 = 12.5f;

        //Stores fractional numbers. Sufficient for storing 15 decimal digits
        double double1 = 23.4;

        //1 bit
        boolean isTrue = true;

        //2 bytes
        char char1 = 'a';
        char char2 = 62;
        System.out.println(char2);

        String hello = "Hello world";

        System.out.println(hello);

        int num1 = 10;
        int num2 = 7;
        System.out.println(num1 + num2);
        double sum = num1 + num2;
        System.out.println(sum);

        System.out.println(num1 - num2);

        System.out.println(num1 * num2);

        System.out.println(num1 / num2);
        double div = (double) num1 / num2;
        System.out.println(div);


        num1 = num1 + 1;
        num1++;
        num1 +=1;
        System.out.println(num1);

        num1 = 5;

        int result  = ++num1 + 5;

        System.out.println(result);
        System.out.println(num1);

        result -= 3;
        result *= 5;
        result /= 10;

        double number1 = 20;
        double number2 = 15;
        System.out.println(number1 % number2);

        //IF

        num1 = 11;

        if (num1 > 10) {
            System.out.println("Number is bigger than 10");

        } else if (num1> 5) {
            System.out.println("Number is bigger than 5 and smaller than 10");
        }
        else  {
            System.out.println("Number " + num1 + " is smaller than 10");
        }

        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Thursday, friday, Saturday or Sunday");
        }

        String word = "Hello";

        System.out.println(word + " World!");
        System.out.println(word.length());
        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());

        System.out.println(sumTwoDoubleNumbers(25.6, 23.4));

        String product = "      Tapacubos para coche    ";
        String date = "13/01/2003";

        String nombreDeLaPersona;


        System.out.println(productFormatter(product, date));
        //Tapacubos_para_coche-13/01/2003

    }

    public static double sumTwoDoubleNumbers(double num1, double num2) {
        return num1 + num2;
    }

    private static String productFormatter(String productName, String date) {
        return productName
                .trim()
                .replaceAll(" +", "_")
                .toUpperCase()
                + "_" + date;
    }

}