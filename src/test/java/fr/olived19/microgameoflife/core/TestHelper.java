package fr.olived19.microgameoflife.core;

import org.junit.Assert;

import java.util.List;

public class TestHelper {

    public static void assertGridsEquals(List<List<Cell>> actualGrid, List<List<Cell>> expectedGrid) {
        Assert.assertEquals(expectedGrid.size(), actualGrid.size());
        for (int i = 0 ; i < expectedGrid.size(); i++) {
            List<Cell> expectedRow = expectedGrid.get(i);
            List<Cell> actualRow = actualGrid.get(i);
            Assert.assertEquals(expectedRow, actualRow);
            for (int j = 0; j < expectedRow.size(); j++) {
                Assert.assertEquals(expectedRow.get(j), actualRow.get(j));
            }
        }
    }
}
