import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException, CsvException {
        List<Person> people = new ArrayList();
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\IV kurs\\Java\\src\\main\\resources\\records.txt"));
        String fileName = "C:\\IV kurs\\Java\\src\\main\\resources\\logs_KA_20200409-1031.csv";
        try {
            CSVReader reader = new CSVReader(new FileReader(fileName));
            List<String[]> r = reader.readAll();


            //skip the first record (r.get(0))
            for (int i = 1; i < r.size(); i++) {
                for (int j = 0; j < r.get(i).length; j++) {
                    people.add(new Person(
                            r.get(i)[0], r.get(i)[1], r.get(i)[2],
                            r.get(i)[3], r.get(i)[4], r.get(i)[5],
                            r.get(i)[6], r.get(i)[7], r.get(i)[8]));
                }
            }


            for (int i = 0; i < people.size(); i++) {
                writer.write(people.get(i).toString());
                writer.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
