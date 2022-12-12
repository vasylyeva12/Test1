import java.util.Arrays;
import java.util.Scanner;

public class Lesson2InputFromKeybord {

    public static void main(String[] args) {
        System.out.println("Please enter number  -" );
        Scanner input = new Scanner((System.in));
        int number = input.nextInt();
        System.out.println("Your number is -"+number);

    }
}
