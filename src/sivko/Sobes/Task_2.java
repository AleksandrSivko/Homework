package sivko.Sobes;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] argv) throws IOException {new Task_2().run();
    }
    public void run() throws IOException{
        Scanner sc = new Scanner(new File("INPUT.TXT"));
        int a=sc.nextInt();
        int sum = 0;
        if (a > 0) {
            for (int i = 1; i <= a; i++) {
                sum += i;
            }
        }
        else{
            for (int i = 1; i >= a; i--) {
                sum += i;
            }
        }
        PrintWriter pw = new PrintWriter(new File("OUTPUT.TXT"));
        pw.print(sum);
        pw.close();
    }
}
