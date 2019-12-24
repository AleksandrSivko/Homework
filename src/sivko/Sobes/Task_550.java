package sivko.Sobes;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task_550 {
    public static void main(String[] argv) throws IOException {new Task_550().run();}
        public void run() throws IOException {
            Scanner sc = new Scanner(new File("INPUT.TXT"));
            int a=sc.nextInt();
            String data;
            String format = null;
            if ((a % 400 == 0) || ((a % 4 == 0) && (a % 100 != 0))){
                data = "12/09/";

            } else {
                data = "13/09/";
            }
            if (a>=10 && a<100){
                 format = "00";
            }
            if (a>0 && a<10){
                 format = "000";
            }
            if (a>=100 && a<1000){
                 format = "0";
            }
            if (a>=1000){
                format = "";
            }
            PrintWriter pw = new PrintWriter(new File("OUTPUT.TXT"));
            pw.print(data + format +a);
            pw.close();
        }
    }
