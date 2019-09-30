package emily1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class readFile {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("src/resources/writing.txt");
        Scanner fileScan = new Scanner(file);

        while(fileScan.hasNextLine()) {
            System.out.println(fileScan.nextLine());
        }

    }
}
