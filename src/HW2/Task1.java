package HW2;

public class Task1 {

    public static void main(String[] args) {
        //0. Перевести число 333 из шестнадцатиричной в десятичную
        System.out.println("0) Перевести число 333 из шестнадцатиричной в десятичную");

        int decimalNumber = 0x333;

        System.out.println("333 in decimal system is- " + decimalNumber);

        // 1. Разложить число 200345 на разряды в десятичной системе

        int decompose = 200345;
        System.out.println("1) Разложить число 200345 на разряды в десятичной системе");
        System.out.println("Number one - " + decompose/ 100000 % 10);
        System.out.println("Number two - " + decompose / 10000 % 10);
        System.out.println("Number three - " + decompose / 1000 % 10);
        System.out.println("Number four - " + decompose / 100 % 10);
        System.out.println("Number five - " + decompose / 10 % 10);
        System.out.println("Number six - " + decompose % 10);

        // 2. Перевести 637 из десятичной в шестнадцатеричную и обратно (10->16 и 16->10)

        Integer number = 637;
        String convert;
        System.out.println("2) Перевести 637 из десятичной в шестнадцатеричную и обратно");

        convert = Integer.toHexString(number).toUpperCase();
        System.out.println(convert);

        // 3. Перевести 637 из десятичной в двоичную

        System.out.println("3) Перевести 637 из десятичной в двоичную");

        Integer number1 = 637;
        String number_2 = Integer.toBinaryString(number1);
        //
        System.out.println("637 в двоичной системе = " + number_2);

        // 4. 11100111 перевести в десятичную

        System.out.println("4) 11100111 перевести в десятичную");

        Integer number2 = 0b11100111;
        System.out.println("11100111 в десятиричной системе = " + number2);

        // 5. Перевести 637 из десятичной в троичную

        System.out.println("5) Перевести 637 из десятичной в троичную");

        Integer number3 = 637;
        String str = number3.toString(637, 3  );
        System.out.println(str);


        }


    }

