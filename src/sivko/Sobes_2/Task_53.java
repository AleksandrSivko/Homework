package sivko.Sobes_2;

import java.io.File;
        import java.io.IOException;
        import java.io.PrintWriter;
        import java.util.Scanner;

public class Task_53 {public static void main(String[] argv) throws IOException {new Task_53().run();}

    public void run() throws IOException {
        Scanner sc = new Scanner(new File("INPUT.TXT"));
        PrintWriter pw = new PrintWriter(new File("OUTPUT.TXT"));
        int e = sc.nextInt();
        int w = sc.nextInt();
        int red = 0, green = 0, blue = 0;
        int[][] matr = new int[e][w];
        for (int i = 0; i < e; i++) {
            for (int j = 0; j < w; j++) {
                matr[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int i = 0; i < e; i++) {
            for (int j = 0; j < w; j++) {
                if (matr[i][j] % 5 == 0) {
                    blue++;
                }
                if ((matr[i][j] % 3 == 0) && (matr[i][j] % 5 != 0)) {
                    green++;
                }
                if ((matr[i][j] % 2 == 0) && (matr[i][j] % 5 != 0) && (matr[i][j] % 3 != 0)) {
                    red++;
                }
            }
        }
        int black = (e * w) - blue - green - red;
        pw.println("RED : " + red);
        pw.println("GREEN : " + green);
        pw.println("BLUE : " + blue);
        pw.print("BLACK : " + black);
        pw.close();
    }
}