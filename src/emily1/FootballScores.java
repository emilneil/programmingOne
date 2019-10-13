package emily1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FootballScores {
    public static void main(String[] args){
        System.out.println("hello");
        int valid = 0;
        int invalid=0;
        try{
            FileReader fileRead = new FileReader("src/resources/fbScores.txt");
            BufferedReader buff = new BufferedReader(fileRead);
            Scanner fileScan = new Scanner(buff);
            while (fileScan.hasNextLine()){
                String lines = fileScan.nextLine();
                String[] infos = lines.split(":");

                if (infos.length == 4){
                    infos[0]= infos[0].trim();
                    infos[1]= infos[1].trim();
                    infos[2]= infos[2].trim();
                    infos[3]= infos[3].trim();

                    int broken = 0;
                    for(String info : infos){
                        if(info.equalsIgnoreCase("")) {
                            broken += 1;
                        }
                    }
                    if(broken == 0) {
                        try {

                            int numberOne = Integer.parseInt(infos[2]);
                            int numberTwo = Integer.parseInt(infos[3]);

                            String game = infos[0] + " " + infos[2] + " Vs " + infos[1] + " " + infos[3];
                            System.out.println(game);

                            if (numberOne > numberTwo) {
                                String gameWinner = infos[0] + " won";
                                System.out.println(gameWinner);
                            } else if (numberOne < numberTwo) {
                                String gameWinner = infos[1] + "won";
                                System.out.println(gameWinner);
                            } else {
                                String gameWinner = "it was a draw";
                                System.out.println(gameWinner);
                            }
                            
                            valid += 1;
                        } catch (NumberFormatException e) {
                            invalid += 1;
                        }
                    }
                    else{
                        invalid+=1;
                    }
                }
                else{
                    invalid+=1;
                }
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        System.out.println(valid);
        System.out.println(invalid);
        }


}
