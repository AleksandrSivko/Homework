package sivko.Sobes_2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

    public class Task_654 {
        public static void main(String[] args) throws IOException {new Task_654().run();}

        public void run() throws IOException{
            Scanner scan = new Scanner(new File("INPUT.TXT"));
            PrintWriter pw = new PrintWriter(new File("OUTPUT.TXT"));
            int N = scan.nextInt();
            long t = 0;
            if (N == 1) {
                t = 0;
            } else {
                ArrayList<Long> listA = new ArrayList<>();
                for (int i = 0; i < N; i++) {
                    listA.add(scan.nextLong());
                }
                long max = 0;
                for (Long integer : listA) {
                    if (max < integer) {
                        max = integer;
                    }
                }
                int m = 0;
                for (int i = 0; i < listA.size(); i++) {
                    if (max == listA.get(i)) {
                        m = i;
                    }
                }
                if (m != 0) {
                    for (int i = 0; i < m; i++) {
                        if (listA.get(i) < listA.get(i + 1)) {
                            t += listA.get(i + 1) - listA.get(i);
                        }
                    }
                }
                if ((m != listA.size() - 1) || (m == 0)) {
                    for (int i = m; i < listA.size() - 1; i++) {
                        if (listA.get(i) > listA.get(i + 1)) {
                            t += listA.get(i) - listA.get(i + 1);
                        }
                    }
                }

            }
            pw.print(t);
            pw.close();
        }
    }
