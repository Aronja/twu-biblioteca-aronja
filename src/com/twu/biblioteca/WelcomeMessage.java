package com.twu.biblioteca;

import java.util.Scanner;

public class WelcomeMessage {

    public String printMessage(){
        System.out.println(
                "Welcome to our beautiful library! Are you interested in books? \n" +
                        "Type Y to few our books or type Q to quit this session!"
        );
        return null;
    }

    public String printAnswer(){
        String answer;
        Scanner in = new Scanner(System.in);

        answer = in.nextLine();

        if (answer.equals("Y")){
            System.out.println(answer);
        } else if (answer.equals("Q")) {
            System.out.println("Sure, you want to quit? Well... Ok! See you!");
            System.exit(0);
        } else {
            System.out.println("Please type Y or Q!");
        }
        return answer;
    }
}