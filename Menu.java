package PetInterfaceGame;

import java.util.Scanner;

public class Menu {
    public void Menu() {
        Scanner sc = new Scanner(System.in);
        PlayGame pg = new PlayGame();

        System.out.println("Welcome to Pet Interface Game, please choose your pet below (NON-REVERSIBLE UNTIL END GAME");
        System.out.println("Press 1 for a cat");
        System.out.println("Press 2 for an iguana");
        System.out.println("Press 3 for a dog");

        String inputOption = sc.nextLine();

        switch (inputOption) {
            case "1":
                System.out.println("Meow");
                Pet pet = new Cat(); //Can we actually make our own data type???
                pg.playGame(pet, sc);
                break;
            case "2":
                System.out.println("*Stare into your soul*");
                Pet pet2 = new Iguana();
                pg.playGame(pet2, sc);
                break;
            case "3":
                System.out.println("Woof!");
                Pet pet3 = new Dog();
                pg.playGame(pet3, sc);
                break;
        }

    }
}



