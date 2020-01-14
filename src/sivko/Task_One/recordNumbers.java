package sivko.Task_One;

import java.io.File;
import java.io.PrintWriter;
import java.util.*;

public class recordNumbers {
    public static void main(String[] args) throws Exception {
        PrintWriter pw;
        Scanner scanner = new Scanner (new File("input.txt"));
        pw = new PrintWriter(new File("OUTPUT.TXT"));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; scanner.hasNext(); i++){
            list.add(scanner.nextInt());
        }
        list.sort(Integer::compareTo);
        for (int i = 0; i < list.size(); i++) {
            pw.print(list.get(i) + " ");
        }
        pw.close();
    }
}
