package PetInterfaceGame;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Iguana  implements Pet {
        private final ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
        private int happiness = 100;
        private int dollars = 20;

        public Iguana() {scheduler.scheduleAtFixedRate(this::drainHappiness, 30, 30, TimeUnit.SECONDS);}

        @Override
        public double getChance() {
            double chance = happiness / 100.0;
            return Math.max(Double.MIN_VALUE, chance);
        }

        @Override
        public void drainHappiness() {happiness -= 5;}

        @Override
        public void eatFood() {
            System.out.println("Oh sweet snacks! Thanks old sport, appreciate you dropping of the goods");
            happiness += 10;
            dollars -= 3;
        }

        @Override
        public void getCleaned() {
            System.out.println("Appreciate the bath, old sport. Feel fresh now.");
            happiness += 3;
        }

        @Override
        public void begForMoney() {
            double roll = Math.random();

            if (roll < getChance()) {
                System.out.println("Need a bit of cash? All good, old sport! Have a few bucks from a side thing, take what you need");
                happiness -= 5;
                dollars +=50;
            }

            else {
                System.out.println("Sorry, old sport. Im a bit short on cash");
                happiness -= 5;
            }
        }
    }


