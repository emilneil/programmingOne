package emily1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InputOutputFixed {
    public static void main(String[] args) throws IOException {
        //sets up a scanner
        Scanner scan = new Scanner(System.in);
        //adds a list
        ArrayList infoName = new ArrayList();
        infoName.add("Name");
        infoName.add("Age");
        infoName.add("height");

        //opening text file

        FileWriter file = new FileWriter("src/resources/info.txt");
        BufferedWriter buff = new BufferedWriter(file);

        int arrayNum = 0;
        while (arrayNum < 3) {
            //y is the number of items in the array
            System.out.println("input your " + infoName.get(arrayNum));
            buff.write(scan.nextLine());
            buff.write(":");
            ++arrayNum;
        }
        buff.close();
        FileReader fileread = new FileReader("src/resources/info.txt");
        Scanner fileScan = new Scanner(fileread);

        while (fileScan.hasNextLine()) {
            System.out.println(fileScan.nextLine());
        }
    }
}


