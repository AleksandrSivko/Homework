package sivko.Task_One;

import java.io.File;
import java.io.PrintWriter;
import java.util.*;

public class recordNumbersBubble {
    public static void main(String[] args) throws Exception {
        PrintWriter pw;
        Scanner scanner = new Scanner (new File("input.txt"));
        pw = new PrintWriter(new File("OUTPUT.TXT"));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; scanner.hasNext(); i++){
            list.add(scanner.nextInt());
        }
        Integer[] array = new Integer[list.size()];
        list.toArray(array);
        int min;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i; j < array.length; j++) {
                if(array[i] > array[j]) {
                    min = array[j];
                    array[j] = array[i];
                    array[i] = min;
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            pw.print(array[i] + " ");
        }
        pw.close();
    }
}
