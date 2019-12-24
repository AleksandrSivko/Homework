package sivko.Sobes;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task_58 {
        public static void main(String[] argv) throws IOException{new Task_58().run();}
        public void run() throws IOException {
            Scanner sc = new Scanner(new File("INPUT.TXT"));
            int a = sc.nextInt();

            PrintWriter pw = new PrintWriter(new File("OUTPUT.TXT"));
            pw.print(a);
            pw.close();
        }
    }
