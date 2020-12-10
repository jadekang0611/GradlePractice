import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            CSVPrinter printer = new CSVPrinter(System.out, CSVFormat.EXCEL);
            printer.printRecord("Jade", "Kang", 5, "Loved it!");
            printer.printRecord("Taylor", "Rose", 3, "It was alright.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
