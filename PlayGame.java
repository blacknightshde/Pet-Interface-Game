package PetInterfaceGame;

import java.util.Scanner;

public class PlayGame {

    public void playGame(Pet pet, Scanner sc) {
        boolean playing = true;
        while (playing) {
            showMenu();
            String choice = sc.nextLine();
            playing = handleChoice(choice, pet);
        }
    }

    private boolean handleChoice(String choice, Pet pet) {
        switch (choice) {
            case "1": pet.eatFood(); break;
            case "2": pet.getCleaned(); break;
            case "3": pet.begForMoney(); break;
            case "4":
                System.out.println("Game shutting down, have a good day!"); return false;
            default:
                System.out.println("Invalid input, please try again"); break;
        }

        return true;
    }
        private void showMenu () {
            System.out.println("What do you want to do?");
            System.out.println("1. Feed");
            System.out.println("2. Clean");
            System.out.println("3. Ask for money");
            System.out.println("4. Exit");
        }


}
