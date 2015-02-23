package com.thoughtworks.diamond;

import org.junit.Test;

import static org.junit.Assert.*;

public class DiamondTest {

    @Test
    public void testDrawIsoTriangle() throws Exception {
        Diamond diamond = new Diamond();

        assertEquals("  *\n ***\n*****\n", diamond.drawIsoTriangle(3));

    }

    @Test
    public void testDrawDiamond() throws Exception {
        Diamond diamond = new Diamond();

        assertEquals("  *\n ***\n*****\n ***\n  *\n", diamond.drawDiamond(3));
    }

    @Test
    public void testDrawDiamondWithName() throws Exception {
        Diamond diamond = new Diamond();

        assertEquals("  *\n ***\nShuwen Li\n ***\n  *\n", diamond.drawDiamondWithName(3, "Shuwen Li"));

    }
}