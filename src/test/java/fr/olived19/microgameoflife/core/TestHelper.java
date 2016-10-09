package fr.olived19.microgameoflife.core;

import org.junit.Assert;

import java.util.List;

public class TestHelper {

    public static void assertGridsEquals(List<List<Cell>> newGeneration, List<List<Cell>> expected) {
        Assert.assertEquals(expected.size(), newGeneration.size());
        for (int i = 0 ; i < expected.size(); i++) {
            List<Cell> expectedRow = expected.get(i);
            List<Cell> actualRow = newGeneration.get(i);
            Assert.assertEquals(expectedRow, actualRow);
            for (int j = 0; j < expectedRow.size(); j++) {
                Assert.assertEquals(expectedRow.get(j), actualRow.get(j));
            }
        }
    }
}
