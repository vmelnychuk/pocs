package io.neko.service;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test public void testAppHasAGreeting() {
        Main classUnderTest = new Main();
        assertNotNull("app should be not null", classUnderTest);
    }
}
