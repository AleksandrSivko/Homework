package sivko.Sobes;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class Task_254 {
    public static void main(String[] args) throws IOException {
        new Task_254().run();
    }
    PrintWriter pw;

    public void run() throws IOException {
        Scanner scan = new Scanner(new File("INPUT.TXT"));
        pw = new PrintWriter(new File("OUTPUT.TXT"));
        int bubble = scan.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= bubble; i++) {
            map.put(i, scan.nextInt());
        }
        int a =  scan.nextInt();
        HashMap<Integer, Integer> mapp = new HashMap<>();
        for (int i = 0; i < a; i++){
            int[] mass ={scan.nextInt(),scan.nextInt()};
            for (int j = 1; j <= bubble; j++){
                if (map.get(j) == mass[0]){
                    mapp.put(j, mass[1]);
                }
            }
        }
        for (int i = 1; i <= map.size(); i++) {
            if (mapp.get(i) != null) {
                map.put(i, mapp.get(i));
            }
        }
        for (int i = 1; i <= bubble; i++) {
            pw.print(map.get(i) + " ");
        }
        pw.close();
    }
}