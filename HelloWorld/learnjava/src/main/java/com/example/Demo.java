package com.example;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello, how are you ?");

        player playerOne = new player();
        playerOne.setLive(10);
        System.out.println(playerOne.getLive());
    }
}
