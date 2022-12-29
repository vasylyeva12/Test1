import LessonTask2.Cat;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
      File file = new File("src/text.txt");
      Scanner scanner = new Scanner(file);
      System.out.println(scanner.nextLine());
      System.out.println(scanner.nextLine());
      System.out.println(scanner.nextLine());


//        String name = "Alona";
//        Integer age = 46;
///       Float height = 184.6F;
//        Boolean student = true;
//
//      Scanner scanner = new Scanner(System.in);
//      System.out.println("Укажіть ваше ім'я ");
//      String name = scanner.nextLine();
//        System.out.println("Hello " + name);
//
//        System.out.println("Укажіть ваш вік ");
//        Integer age = scanner.nextInt();
//
//        System.out.println("age " + age);
//
//        System.out.println("Ви студент? ");
//        Boolean isStudent = scanner.nextBoolean();
//        System.out.println("isStudent " + isStudent);

//        System.out.println("height: " + height);
//
//        String value_1 = "13";
//        String value_2 = "23";
//        System.out.println(Integer.parseInt(value_1) + Integer.parseInt(value_2));

        Cat myCat = new Cat("Sima", 5, 7.5);
        System.out.println(myCat);

        Cat myCat2 = new Cat("Thomas", 8, 5.5);
        System.out.println(myCat2);

        myCat.className(); //вызываем метод объекта




    }
}