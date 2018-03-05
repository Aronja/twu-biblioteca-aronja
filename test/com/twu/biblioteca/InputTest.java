package com.twu.biblioteca;

import org.junit.Test;

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
    public void TestWhetherYesPrintsOutAnswer() {

        WelcomeMessage message = new WelcomeMessage();
        String answer = "Y";
        String givenAnswer = message.printAnswer();
        assertEquals(answer, givenAnswer);
    }

    @Test
    public void TestQuitFunction() {
        WelcomeMessage message = new WelcomeMessage();
        String answer = "Q";
        String givenAnswer = message.printAnswer();
        assertEquals(answer, givenAnswer);
    }

    @Test
    public void TestWhetherPrintsMainMenu() {
        MainMenu mainmenu = new MainMenu();
        String MainMenu = mainmenu.printMenu();
        String Menu = null;
        assertEquals(Menu, MainMenu);
    }



