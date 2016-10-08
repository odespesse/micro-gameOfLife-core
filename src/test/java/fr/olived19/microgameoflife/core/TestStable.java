package fr.olived19.microgameoflife.core;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestStable {

    @Test
    public void block() {
        List<List<Cell>> seed = new ArrayList<>();
        seed.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead));
        seed.add(Arrays.asList(Cell.dead, Cell.alive, Cell.alive, Cell.dead));
        seed.add(Arrays.asList(Cell.dead, Cell.alive, Cell.alive, Cell.dead));
        seed.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead));
        Automaton automaton = new Automaton();
        List<List<Cell>> newGeneration = automaton.createNextGeneration(seed);
        List<List<Cell>> expected = new ArrayList<>();
        expected.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead));
        expected.add(Arrays.asList(Cell.dead, Cell.alive, Cell.alive, Cell.dead));
        expected.add(Arrays.asList(Cell.dead, Cell.alive, Cell.alive, Cell.dead));
        expected.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead));
        assertGridsEquals(newGeneration, expected);
    }

    @Test
    public void beehive() {
        List<List<Cell>> seed = new ArrayList<>();
        seed.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        seed.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.alive, Cell.alive, Cell.dead,  Cell.dead));
        seed.add(Arrays.asList(Cell.dead, Cell.alive, Cell.dead,  Cell.dead,  Cell.alive, Cell.dead));
        seed.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.alive, Cell.alive, Cell.dead,  Cell.dead));
        seed.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        Automaton automaton = new Automaton();
        List<List<Cell>> newGeneration = automaton.createNextGeneration(seed);
        List<List<Cell>> expected = new ArrayList<>();
        expected.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expected.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.alive, Cell.alive, Cell.dead,  Cell.dead));
        expected.add(Arrays.asList(Cell.dead, Cell.alive, Cell.dead,  Cell.dead,  Cell.alive, Cell.dead));
        expected.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.alive, Cell.alive, Cell.dead,  Cell.dead));
        expected.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        assertGridsEquals(newGeneration, expected);
    }

    @Test
    public void loaf() {
        List<List<Cell>> seed = new ArrayList<>();
        seed.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        seed.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.alive, Cell.alive, Cell.dead,  Cell.dead));
        seed.add(Arrays.asList(Cell.dead, Cell.alive, Cell.dead,  Cell.dead,  Cell.alive, Cell.dead));
        seed.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.alive, Cell.dead,  Cell.alive, Cell.dead));
        seed.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.alive, Cell.dead,  Cell.dead));
        seed.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        Automaton automaton = new Automaton();
        List<List<Cell>> newGeneration = automaton.createNextGeneration(seed);
        List<List<Cell>> expected = new ArrayList<>();
        expected.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expected.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.alive, Cell.alive, Cell.dead,  Cell.dead));
        expected.add(Arrays.asList(Cell.dead, Cell.alive, Cell.dead,  Cell.dead,  Cell.alive, Cell.dead));
        expected.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.alive, Cell.dead,  Cell.alive, Cell.dead));
        expected.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.alive, Cell.dead,  Cell.dead));
        expected.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        assertGridsEquals(newGeneration, expected);
    }

    @Test
    public void boat() {
        List<List<Cell>> seed = new ArrayList<>();
        seed.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        seed.add(Arrays.asList(Cell.dead, Cell.alive, Cell.alive, Cell.dead,  Cell.dead));
        seed.add(Arrays.asList(Cell.dead, Cell.alive, Cell.dead,  Cell.alive, Cell.dead));
        seed.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.alive, Cell.dead,  Cell.dead));
        seed.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        Automaton automaton = new Automaton();
        List<List<Cell>> newGeneration = automaton.createNextGeneration(seed);
        List<List<Cell>> expected = new ArrayList<>();
        expected.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expected.add(Arrays.asList(Cell.dead, Cell.alive, Cell.alive, Cell.dead,  Cell.dead));
        expected.add(Arrays.asList(Cell.dead, Cell.alive, Cell.dead,  Cell.alive, Cell.dead));
        expected.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.alive, Cell.dead,  Cell.dead));
        expected.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        assertGridsEquals(newGeneration, expected);
    }

    private void assertGridsEquals(List<List<Cell>> newGeneration, List<List<Cell>> expected) {
        Assert.assertEquals(newGeneration.size(), expected.size());
        for (int i = 0 ; i < expected.size(); i++) {
            List<Cell> expectedRow = expected.get(i);
            List<Cell> actualRow = newGeneration.get(i);
            Assert.assertEquals(actualRow, expectedRow);
            for (int j = 0; j < expectedRow.size(); j++) {
                Assert.assertEquals(actualRow.get(j), expectedRow.get(j));
            }
        }
    }
}
