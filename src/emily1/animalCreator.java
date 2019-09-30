package emily1;

public class animalCreator {
    private int legNumber;
    private float height;
    private String animalName;
    private String faveFood;

    //constructor
    public animalCreator(int numberOfLegs, float theHeight, String theName, String food){
        legNumber = numberOfLegs;
        height = theHeight;
        animalName = theName;
        faveFood = food;

    }
    //methods or behaviours
    public void getAnimal(){
        System.out.println("The " + animalName + " is " + height + " metres tall and has " + legNumber + " legs" + " its favourite food is " + faveFood);
    }
}
