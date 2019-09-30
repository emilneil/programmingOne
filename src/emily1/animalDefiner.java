package emily1;
import java.util.Scanner;

public class animalDefiner {
    public static void main(String[] args) {
        animalCreator chicken = new animalCreator(2, 1.8f, "chickem", "grain");
        chicken.getAnimal();
        animalCreator gibbon = new animalCreator(5, 174, "freya gibbon", "broccoli");
        gibbon.getAnimal();
        animalCreator mouse = new animalCreator(4, 0.01f, "mouse", "spiders");
        mouse.getAnimal();
        animalCreator toad = new animalCreator(3, 0.07f, "toad", "slugs");
        toad.getAnimal();
        animalCreator cat = new animalCreator(4, 0.4f, "cat", "cat food");
        cat.getAnimal();

        Scanner scan = new Scanner(System.in);
        System.out.println("Create your own animal:");

        System.out.println("How many legs does your animal have");
        int leg1 = scan.nextInt();

        System.out.println("What is their name?");
        String name1 = scan.next();

        System.out.println("What is their height in metres?");
        float height1 = scan.nextFloat();

        System.out.println("What is their favourite food?");
        String food1 = scan.next();

        animalCreator newAnimal = new animalCreator(leg1,height1,name1,food1);
        newAnimal.getAnimal();


    }
}
