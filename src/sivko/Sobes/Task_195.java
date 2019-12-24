package sivko.Sobes;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task_195 {
    public static void main(String[] argv) throws IOException {new Task_195().run();}
    public void run() throws IOException {
        Scanner sc = new Scanner(new File("INPUT.TXT"));
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = 0;
        if (a > 0){
            result = b * c * a * 2;
        }
        PrintWriter pw = new PrintWriter(new File("OUTPUT.TXT"));
        pw.print(result);
        pw.close();
    }
}
