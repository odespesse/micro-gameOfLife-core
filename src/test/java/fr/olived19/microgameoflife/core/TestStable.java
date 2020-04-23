package fr.olived19.microgameoflife.core;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestStable {

    @Test
    public void mono() {
        List<List<Cell>> seed = new ArrayList<>();
        seed.add(Arrays.asList(Cell.dead));
        World worldSeed = new World(seed, 10);
        Automaton automaton = new Automaton();
        World newGeneration = automaton.createNextGeneration(worldSeed);
        List<List<Cell>> expected = new ArrayList<>();
        expected.add(Arrays.asList(Cell.dead));
        TestHelper.assertGridsEquals(newGeneration.getGridAsList(), expected);
        Assert.assertEquals(newGeneration.getGeneration(), 11);
    }

    @Test
    public void block() {
        List<List<Cell>> seed = new ArrayList<>();
        seed.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead));
        seed.add(Arrays.asList(Cell.dead, Cell.alive, Cell.alive, Cell.dead));
        seed.add(Arrays.asList(Cell.dead, Cell.alive, Cell.alive, Cell.dead));
        seed.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead));
        World worldSeed = new World(seed, 0);
        Automaton automaton = new Automaton();
        World newGeneration = automaton.createNextGeneration(worldSeed);
        List<List<Cell>> expected = new ArrayList<>();
        expected.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead));
        expected.add(Arrays.asList(Cell.dead, Cell.alive, Cell.alive, Cell.dead));
        expected.add(Arrays.asList(Cell.dead, Cell.alive, Cell.alive, Cell.dead));
        expected.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead));
        TestHelper.assertGridsEquals(newGeneration.getGridAsList(), expected);
        Assert.assertEquals(newGeneration.getGeneration(), 1);
    }

    @Test
    public void beehive() {
        List<List<Cell>> seed = new ArrayList<>();
        seed.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        seed.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.alive, Cell.alive, Cell.dead,  Cell.dead));
        seed.add(Arrays.asList(Cell.dead, Cell.alive, Cell.dead,  Cell.dead,  Cell.alive, Cell.dead));
        seed.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.alive, Cell.alive, Cell.dead,  Cell.dead));
        seed.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        World worldSeed = new World(seed, 0);
        Automaton automaton = new Automaton();
        World newGeneration = automaton.createNextGeneration(worldSeed);
        List<List<Cell>> expected = new ArrayList<>();
        expected.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expected.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.alive, Cell.alive, Cell.dead,  Cell.dead));
        expected.add(Arrays.asList(Cell.dead, Cell.alive, Cell.dead,  Cell.dead,  Cell.alive, Cell.dead));
        expected.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.alive, Cell.alive, Cell.dead,  Cell.dead));
        expected.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        TestHelper.assertGridsEquals(newGeneration.getGridAsList(), expected);
        Assert.assertEquals(newGeneration.getGeneration(), 1);
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
        World worldSeed = new World(seed, 0);
        Automaton automaton = new Automaton();
        World newGeneration = automaton.createNextGeneration(worldSeed);
        List<List<Cell>> expected = new ArrayList<>();
        expected.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expected.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.alive, Cell.alive, Cell.dead,  Cell.dead));
        expected.add(Arrays.asList(Cell.dead, Cell.alive, Cell.dead,  Cell.dead,  Cell.alive, Cell.dead));
        expected.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.alive, Cell.dead,  Cell.alive, Cell.dead));
        expected.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.alive, Cell.dead,  Cell.dead));
        expected.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        TestHelper.assertGridsEquals(newGeneration.getGridAsList(), expected);
        Assert.assertEquals(newGeneration.getGeneration(), 1);
    }

    @Test
    public void boat() {
        List<List<Cell>> seed = new ArrayList<>();
        seed.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        seed.add(Arrays.asList(Cell.dead, Cell.alive, Cell.alive, Cell.dead,  Cell.dead));
        seed.add(Arrays.asList(Cell.dead, Cell.alive, Cell.dead,  Cell.alive, Cell.dead));
        seed.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.alive, Cell.dead,  Cell.dead));
        seed.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        World worldSeed = new World(seed, 0);
        Automaton automaton = new Automaton();
        World newGeneration = automaton.createNextGeneration(worldSeed);
        List<List<Cell>> expected = new ArrayList<>();
        expected.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expected.add(Arrays.asList(Cell.dead, Cell.alive, Cell.alive, Cell.dead,  Cell.dead));
        expected.add(Arrays.asList(Cell.dead, Cell.alive, Cell.dead,  Cell.alive, Cell.dead));
        expected.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.alive, Cell.dead,  Cell.dead));
        expected.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        TestHelper.assertGridsEquals(newGeneration.getGridAsList(), expected);
        Assert.assertEquals(newGeneration.getGeneration(), 1);
    }
}
