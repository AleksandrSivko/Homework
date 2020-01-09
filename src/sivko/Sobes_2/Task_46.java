package sivko.Sobes_2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Task_46 {public static void main(String[] argv) throws IOException {new Task_46().run();}
    public static final BigDecimal f = new BigDecimal(2.7182818284590452353602875);

    public void run() throws IOException{
        System.out.println(f);
        Scanner sc = new Scanner(new File("INPUT.TXT"));
        PrintWriter pw = new PrintWriter(new File("OUTPUT.TXT"));
        System.out.println(f);
        int e = sc.nextInt();
        if (e==0){
            BigDecimal result = new BigDecimal(String.valueOf(f)).setScale(0, RoundingMode.HALF_EVEN);
            pw.print(result);
        }else {
            DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.getDefault());
            otherSymbols.setDecimalSeparator('.');
            String str = "#.";
            for (int i = 1; i <= e; i++) {
                str += "0";
            }
            DecimalFormat form = new DecimalFormat(str, otherSymbols);
            pw.print(form.format(f));
        }
        pw.close();
    }
}
