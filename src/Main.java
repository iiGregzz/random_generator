import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        createNewSetOfData();
        chooseAnOptionRandomly();
    }

    public static ArrayList<String> finalUserOptions = new ArrayList<>();

    public static void createNewSetOfData() {
        Boolean optionSelect = true;
        ArrayList<String> storedUserOptions = new ArrayList<>();

        while (optionSelect) {
            System.out.println("Add an item to your list. Type 'End' when finished.");
            Scanner userInput = new Scanner(System.in);

            String userOption = userInput.nextLine();
            if (!userOption.equals("End")) {
                storedUserOptions.add(userOption);
            } else {
                optionSelect = false;
                finalUserOptions = storedUserOptions;
                System.out.println("These are your choices - " + storedUserOptions + " - Where will the wheel land?");
            }
        }
    }

    public static void chooseAnOptionRandomly() {
            ArrayList<String> finalOptionsToChooseFrom = finalUserOptions;
            Random randomIndexFromArray = new Random();
            int upperRandLimit = finalOptionsToChooseFrom.size();
            int randomInt = randomIndexFromArray.nextInt(upperRandLimit);

            String chosenOption = finalOptionsToChooseFrom.get(randomInt);
            System.out.println("You got " + chosenOption + "!");
        }


    }
