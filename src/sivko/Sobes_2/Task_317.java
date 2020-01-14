package sivko.Sobes_2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task_317 {
    public static void main(String[] args) throws IOException {new Task_317().run();}

    public void run() throws IOException{
        Scanner scan = new Scanner(new File("INPUT.TXT"));
        PrintWriter pw = new PrintWriter(new File("OUTPUT.TXT"));
        int X = scan.nextInt();
        int Y = scan.nextInt();
        int Z = scan.nextInt();
        int W = scan.nextInt();
        int presents = 0;
        for (int i = 0 ; i <= W; i++) {
            for (int j = 0; j <= W; j++) {
                int l = W - X * i - Y * j;
                if ((l >= 0) && (l % Z == 0)) {
                    presents++;
                }
            }
        }
        pw.print(presents);
        pw.close();
    }
}
