package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Objects;

import static org.junit.Assert.*;

public class InputTest {

    @Test
    public void TestWhetherWelcomeMessageIsPrinted() {

        WelcomeMessage message = new WelcomeMessage();
        String Welcome = null;

        String Message = message.printMessage();
        assertEquals(Welcome, Message);
    }

    @Test
    public void TestWhetherYprintsAnswer() {
        WelcomeMessage message = new WelcomeMessage();
        String answer;

        {
            answer = "Y";
        }

        InputStream in = new ByteArrayInputStream(answer.getBytes());
        System.setIn(in);
        String givenAnswer = message.printAnswer();

        assertEquals(answer, givenAnswer);
    }

    @Test
    public void TestWhetherQprintsAnswer() {
        WelcomeMessage message = new WelcomeMessage();
        String answer;

        {
            answer = "Q";
        }

        InputStream in = new ByteArrayInputStream(answer.getBytes());
        System.setIn(in);
        String givenAnswer = message.printAnswer();

        assertEquals(answer, givenAnswer);
    }

    @Test
    public void TestWhetherPrintsMainMenu() {
        MainMenu mainmenu = new MainMenu();
        String MainMenu = mainmenu.printMenu();
        {
            MainMenu = "B";
        }

        InputStream in = new ByteArrayInputStream(MainMenu.getBytes());
        System.setIn(in);
        String givenAnswer = mainmenu.printMenu();

        assertEquals(mainmenu, givenAnswer);
    }

}



