package com.snakeladder;

public class SnakeLadder {
        public static void main(String[] args) {
            System.out.println("Welcome to snake and ladder");
            int position =0;
            int randomCheck=(int) (Math.random() * 10) % 6+1;
            System.out.println(randomCheck);

        }
    }

