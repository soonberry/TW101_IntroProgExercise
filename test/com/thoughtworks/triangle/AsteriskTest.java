package com.thoughtworks.triangle;

import org.junit.Test;

import static org.junit.Assert.*;

public class AsteriskTest {
    @Test
    public void testDrawOne() throws Exception {
        Asterisk asterisk = new Asterisk();
        assertEquals("*", asterisk.DrawOne());
    }

    @Test
    public void testDrawHorLine() throws Exception {
        Asterisk asterisk = new Asterisk();
        assertEquals("********", asterisk.DrawHorLine(8));
    }

    @Test
    public void testDrawVerLine() throws Exception {
        Asterisk asterisk = new Asterisk();
        assertEquals("*\n*\n*", asterisk.DrawVerLine(3));
    }

    @Test
    public void testRightTriangle() throws Exception {
        Asterisk asterisk = new Asterisk();
        assertEquals("*\n**\n***", asterisk.DrawRightTriangle(3));

    }
}