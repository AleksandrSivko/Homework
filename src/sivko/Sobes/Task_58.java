package sivko.Sobes;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task_58 {
    public static void main(String[] argv) throws IOException {
        new Task_58().run();
    }

    public void run() throws IOException {
        Scanner sc = new Scanner(new File("INPUT.TXT"));
        PrintWriter pw = new PrintWriter(new File("OUTPUT.TXT"));
        int nambTab = sc.nextInt();
        for (int k = 1; k <= nambTab; k++) {
            System.out.println(k);
            int b = sc.nextInt();
            int c = sc.nextInt();
            int[][] tabl = new int[b][c];
            if (b == 1 || c == 1) {
                pw.println("YES");
                for (int i = 0; i < b; i++) {
                    for (int j = 0; j < c; j++) {
                        tabl[i][j] = sc.nextInt();
                    }
                }
                continue;
            } else {
                for (int i = 0; i < b; i++) {
                    for (int j = 0; j < c; j++) {
                        tabl[i][j] = sc.nextInt();
                    }
                }
                for (int i = 0; i < b; i++) {
                    for (int j = 0; j < c; j++) {
                    }
                }
            }
            String res = "";
            rr:
            for (int i = 0; i < b - 1; i++) {
                for (int j = 0; j < c - 1; j++) {
                    res = ((tabl[i][j] != tabl[i][j + 1]) || (tabl[i][j] != tabl[i + 1][j]) || (tabl[i][j] != tabl[i + 1][j + 1]) ? "YES" : "NO");
                    if(res == "NO") break rr;
                }
            }
            System.out.println(res);
            pw.println(res);
        }
        pw.close();
    }
}
