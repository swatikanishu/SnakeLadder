package com.snakeladder;

public class SnakeLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to snake and ladder");
        int position = 0;
        int randomCheck = (int) (Math.random() * 10) % 6 + 1;
        System.out.println(randomCheck);
        int randomCheck2 = (int) (Math.random() * 10) % 3;
        switch (randomCheck2) {
            case 0:
                System.out.println("No play");
                position += 0;
                break;
            case 1:
                System.out.println("Ladder");
                position += randomCheck;
                break;
            case 2:
                System.out.println("Snake");
                position -= randomCheck;
                break;

        }
    }
}

