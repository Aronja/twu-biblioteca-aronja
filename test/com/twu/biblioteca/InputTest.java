package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class InputTest {

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
    public void TestWhetherOtherLetterprintsAnswer() {
        WelcomeMessage message = new WelcomeMessage();
        String answer;

        {
            answer = "K";
        }

        InputStream in = new ByteArrayInputStream(answer.getBytes());
        System.setIn(in);
        String givenAnswer = message.printAnswer();

        assertEquals(answer, givenAnswer);
    }

    Library library;

    @Before
    public void serveupMocks() {
        library = mock(Library.class);

    }


    @Test
    public void TestWhetherPrintsMainMenuwithB() {
        MainMenu mainmenu = new MainMenu();
        String answer;
        {
            answer = "B";
        }

        InputStream in = new ByteArrayInputStream(answer.getBytes());
        System.setIn(in);
        String givenAnswer = mainmenu.printMenu(library);

        assertEquals(answer, givenAnswer);
    }

    @Test
    public void TestWhetherPrintsMainMenuwithM() {
        MainMenu mainmenu = new MainMenu();
        String answer;
        {
            answer = "M";
        }

        InputStream in = new ByteArrayInputStream(answer.getBytes());
        System.setIn(in);
        String givenAnswer = mainmenu.printMenu(library);

        assertEquals(answer, givenAnswer);
    }
}



