package fightClub;

import java.util.Random;

public class FightClub {

    public static void main(String[] args) throws InterruptedException {

        fightClub("Mike Tyson", "Rocky Balboa");

    }

    public static void fightClub(String fighter1, String fighter2) throws InterruptedException {
        Random random = new Random();
        // Assume that every fighter has 100 hitpoints(health)
        int fighter1Health = 100;
        int fighter2Health = 100;

        int totalPunches = 0;
        while (true) {
            int knockout = random.nextInt(10) + 1;
            totalPunches++;
            int whichFighter = random.nextInt(2) + 1;
            int punch = random.nextInt(10);
            System.out.println("--------- Punch = " + totalPunches + " ---------");
            if (whichFighter == 1) {
                if (punch == knockout) {
                    System.out.println(fighter1 + " knocks out " + fighter2);
                    break;
                } else if (punch == 0) {
                    System.out.println(fighter1 + " missed, " + fighter2 + " dodged " + fighter1 + "'s punch");
                    System.out.println("Let's see what happens next!");
                } else {
                    System.out.println(fighter1 + " punches " + fighter2);
                    fighter2Health -= punch;

                    if (fighter2Health != 0) {
                        System.out.println(fighter1 + "'s Health = " + fighter1Health);
                        System.out.println(fighter2 + "'s Health = " + fighter2Health + " " + fighter2 + " loses " + punch + " points");
                        Thread.sleep(1000);
                    } else {
                        System.out.println(fighter1 + "'s Health = " + fighter1Health);
                        System.out.println(fighter2 + "'s Health = " + fighter2Health);
                        System.out.println(fighter2 + " loses the match.");
                        break;
                    }
                }
            } else {
                if (punch == knockout) {
                    System.out.println(fighter2 + " knocks out " + fighter1);
                    break;
                } else if (punch == 0) {
                    System.out.println(fighter2 + " missed, " + fighter1 + " dodged " + fighter2 + "'s punch");
                    System.out.println("Let's see what happens next!");
                } else {
                    System.out.println(fighter2 + " punches " + fighter1);
                    fighter1Health -= punch;

                    if (fighter1Health != 0) {
                        System.out.println(fighter1 + "'s Health = " + fighter1Health + " " + fighter1 + " loses " + punch + " points");
                        System.out.println(fighter2 + "'s Health = " + fighter2Health);

                        Thread.sleep(1000);
                    } else {
                        System.out.println("fighter1Health = " + fighter1Health);
                        System.out.println("fighter2Health = " + fighter2Health);
                        System.out.println(fighter1 + " loses the match.");
                        break;
                    }

                }
            }
        }

    }

}
