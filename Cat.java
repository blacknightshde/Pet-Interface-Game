package PetInterfaceGame;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Cat implements Pet {
    private final ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
    private int happiness = 100;
    private int dollars = 20;

    public Cat() {scheduler.scheduleAtFixedRate(this::drainHappiness, 30, 30, TimeUnit.SECONDS);}

    @Override
    public double getChance() {
        double chance = happiness / 100.0;
        return Math.max(Double.MIN_VALUE, chance);
    }

    @Override
    public void drainHappiness() {happiness -= 5;}

    @Override
    public void eatFood() {
        System.out.println("Nom nom nom, It is not that I like the food or anything, hmph!");
        happiness += 30;
        dollars -= 5;
    }

    @Override
    public void getCleaned() {
        System.out.println("Meow! Don't touch me there! It is sensitive!");
        happiness += 3;
    }

    @Override
    public void begForMoney() {
        double roll = Math.random();

        if (roll < getChance()) {
            System.out.println("So now you beg for money huh...take this you lowly master!");
            happiness -= 15;
            dollars +=50;
        }

        else {
            System.out.println("Get a job. No Money for you!");
            happiness -= 5;
        }
    }
}
