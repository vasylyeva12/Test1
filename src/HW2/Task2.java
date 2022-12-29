package HW2;

public class Task2 {

    public static void main(String[] args) {
        // Задание №2.
        //1 Создайте строку через new - I study Basic Java!
        //2 Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку, которую создали в п.1
        //3 Распечатать последний символ строки. Используем метод String.charAt().
        //4 Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
        //5 Заменить все символы “а” на “о”.
        //6 Преобразуйте строку к верхнему регистру.
        //7 Преобразуйте строку к нижнему регистру.
        //8 Вырезать строку Java c помощью метода String.substring().

        String str = new String("I study Basic Java");
        String str1 = str;

        System.out.println(str1.charAt(str.length()-1));
        System.out.println(str1.contains("Java"));
        System.out.println(str1.replace('a','o'));
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.substring(str.lastIndexOf('J'), str.lastIndexOf('J')+4));
    }


}
