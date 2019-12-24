package sivko.Task_One;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Output {
    private final static String PATH = "src/sivko/Task_One/input.txt";

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(PATH);

        Scanner scanner = new Scanner(file);
        String input = scanner.nextLine();
        System.out.println("Ваше число из файла: " +input);

        String[] numString = input.split(" ");
        int [] numbers = new int[1];
        int counter = 0;

        for (String number:numString) {
            numbers[counter++] = Integer.parseInt(number);

        }
        System.out.println(Arrays.toString(numbers));
        int sum = 0;
        for (int i =0; i<=numbers.length; i++){
            sum += i;
        }
        System.out.println(sum);

    }
}
