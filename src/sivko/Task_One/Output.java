package sivko.Task_One;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Output {
    public static void main(String[] args) throws IOException {
        new Output().run();
    }
    PrintWriter pw;
    public void run() throws IOException{
        Scanner scan = new Scanner(new File("INPUT.TXT"));
        String str = scan.nextLine();
        System.out.println(str);
        String strNew = Arrays.stream(str.split(" "))
                .map(Integer::parseInt)
                .sorted()
                .map(x-> Integer.toString(x))
                .collect(Collectors.joining(" "));
        System.out.println(strNew);
        pw = new PrintWriter(new File("OUTPUT.TXT"));
        pw.print(strNew);
        pw.close();
    }
}
