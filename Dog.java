package PetInterfaceGame;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Dog implements Pet {
        private final ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
        private int happiness = 100;
        private int dollars = 20;

        public Dog() {scheduler.scheduleAtFixedRate(this::drainHappiness, 30, 30, TimeUnit.SECONDS);}

        @Override
        public double getChance() {
            double chance = happiness / 100.0;
            return Math.max(Double.MIN_VALUE, chance);
        }

        @Override
        public void drainHappiness() {happiness -= 1;}

        @Override
        public void eatFood() {
            System.out.println("SLURP! Yummy in my tummy! Thank you, best friend 4ever!");
            happiness += 10;
            dollars -= 10;
        }

        @Override
        public void getCleaned() {
            System.out.println("Tail waggin' engaged! I dont love the soap but I LOVE U");
            happiness += 5;
        }

        @Override
        public void begForMoney() {
            double roll = Math.random();

            if (roll < getChance()) {
                System.out.println("Woof woof! I dug up a shiny coin in the yard for you! Here, take it!");
                dollars +=100;
            }

            else {
                System.out.println("Arf! I dont have money but here is a cool stick I found!");
                happiness -= 15;
            }
        }
    }


