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
        //starting loop of info inputs
        while (arrayNum < 3) {
            //y is the number of items in the array
            System.out.println("input your " + infoName.get(arrayNum));
            buff.write(scan.nextLine());
            buff.write(":");
            ++arrayNum;
        }
        buff.close();
        FileReader fileRead = new FileReader("src/resources/info.txt");
        Scanner fileScan = new Scanner(fileRead);
        String answer = fileScan.nextLine();
        String[] sections= answer.split(":",4);
        System.out.println("Name: " + sections[0]);
        System.out.println("Age: " + sections[1]);
        System.out.println("Height: " + sections[2]);

        }
    }



