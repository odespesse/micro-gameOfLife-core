package fr.olived19.microgameoflife.core;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestOscillators {

    @Test
    public void blinker() {
        List<List<Cell>> seed = new ArrayList<>();
        seed.add(Arrays.asList(Cell.dead, Cell.dead, Cell.dead,  Cell.dead, Cell.dead));
        seed.add(Arrays.asList(Cell.dead, Cell.dead, Cell.alive, Cell.dead, Cell.dead));
        seed.add(Arrays.asList(Cell.dead, Cell.dead, Cell.alive, Cell.dead, Cell.dead));
        seed.add(Arrays.asList(Cell.dead, Cell.dead, Cell.alive, Cell.dead, Cell.dead));
        seed.add(Arrays.asList(Cell.dead, Cell.dead, Cell.dead,  Cell.dead, Cell.dead));
        World seedWorld = new World(seed, 0);
        Automaton automaton = new Automaton();
        World newGeneration1 = automaton.createNextGeneration(seedWorld);
        List<List<Cell>> expectedGrid1 = new ArrayList<>();
        expectedGrid1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expectedGrid1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expectedGrid1.add(Arrays.asList(Cell.dead, Cell.alive, Cell.alive, Cell.alive, Cell.dead));
        expectedGrid1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expectedGrid1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        TestHelper.assertGridsEquals(newGeneration1.getGridAsList(), expectedGrid1);
        Assert.assertEquals(newGeneration1.getGeneration(), 1);
        World worldNewGeneration1 = new World(newGeneration1);
        World newGeneration2 = automaton.createNextGeneration(worldNewGeneration1);
        List<List<Cell>> expectedGrid2 = new ArrayList<>();
        expectedGrid2.add(Arrays.asList(Cell.dead, Cell.dead, Cell.dead,  Cell.dead, Cell.dead));
        expectedGrid2.add(Arrays.asList(Cell.dead, Cell.dead, Cell.alive, Cell.dead, Cell.dead));
        expectedGrid2.add(Arrays.asList(Cell.dead, Cell.dead, Cell.alive, Cell.dead, Cell.dead));
        expectedGrid2.add(Arrays.asList(Cell.dead, Cell.dead, Cell.alive, Cell.dead, Cell.dead));
        expectedGrid2.add(Arrays.asList(Cell.dead, Cell.dead, Cell.dead,  Cell.dead, Cell.dead));
        TestHelper.assertGridsEquals(newGeneration2.getGridAsList(), expectedGrid2);
        Assert.assertEquals(newGeneration2.getGeneration(), 2);
    }

    @Test
    public void toad() {
        List<List<Cell>> seed = new ArrayList<>();
        seed.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        seed.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        seed.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.alive, Cell.alive, Cell.alive, Cell.dead));
        seed.add(Arrays.asList(Cell.dead, Cell.alive, Cell.alive, Cell.alive, Cell.dead,  Cell.dead));
        seed.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        seed.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        World worldSeed = new World(seed, 0);
        Automaton automaton = new Automaton();
        World newGeneration1 = automaton.createNextGeneration(worldSeed);
        List<List<Cell>> expectedGrid1 = new ArrayList<>();
        expectedGrid1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expectedGrid1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.alive, Cell.dead,  Cell.dead));
        expectedGrid1.add(Arrays.asList(Cell.dead, Cell.alive, Cell.dead,  Cell.dead,  Cell.alive, Cell.dead));
        expectedGrid1.add(Arrays.asList(Cell.dead, Cell.alive, Cell.dead,  Cell.dead,  Cell.alive, Cell.dead));
        expectedGrid1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.alive, Cell.dead,  Cell.dead,  Cell.dead));
        expectedGrid1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        TestHelper.assertGridsEquals(newGeneration1.getGridAsList(), expectedGrid1);
        Assert.assertEquals(newGeneration1.getGeneration(), 1);
        World worldNewGeneration1 = new World(newGeneration1);
        World newGeneration2 = automaton.createNextGeneration(worldNewGeneration1);
        List<List<Cell>> expectedGrid2 = new ArrayList<>();
        expectedGrid2.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expectedGrid2.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expectedGrid2.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.alive, Cell.alive, Cell.alive, Cell.dead));
        expectedGrid2.add(Arrays.asList(Cell.dead, Cell.alive, Cell.alive, Cell.alive, Cell.dead,  Cell.dead));
        expectedGrid2.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expectedGrid2.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        TestHelper.assertGridsEquals(newGeneration2.getGridAsList(), expectedGrid2);
        Assert.assertEquals(newGeneration2.getGeneration(), 2);
    }

    @Test
    public void beacon() {
        List<List<Cell>> seed = new ArrayList<>();
        seed.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        seed.add(Arrays.asList(Cell.dead, Cell.alive, Cell.alive, Cell.dead,  Cell.dead,  Cell.dead));
        seed.add(Arrays.asList(Cell.dead, Cell.alive, Cell.alive, Cell.dead,  Cell.dead,  Cell.dead));
        seed.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.alive, Cell.alive, Cell.dead));
        seed.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.alive, Cell.alive, Cell.dead));
        seed.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        World worldSeed = new World(seed, 0);
        Automaton automaton = new Automaton();
        World newGeneration1 = automaton.createNextGeneration(worldSeed);
        List<List<Cell>> expectedGrid1 = new ArrayList<>();
        expectedGrid1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expectedGrid1.add(Arrays.asList(Cell.dead, Cell.alive, Cell.alive, Cell.dead,  Cell.dead,  Cell.dead));
        expectedGrid1.add(Arrays.asList(Cell.dead, Cell.alive, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expectedGrid1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.alive, Cell.dead));
        expectedGrid1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.alive, Cell.alive, Cell.dead));
        expectedGrid1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        TestHelper.assertGridsEquals(newGeneration1.getGridAsList(), expectedGrid1);
        Assert.assertEquals(newGeneration1.getGeneration(), 1);
        World worldNewGeneration1 = new World(newGeneration1);
        World newGeneration2 = automaton.createNextGeneration(worldNewGeneration1);
        List<List<Cell>> expectedGrid2 = new ArrayList<>();
        expectedGrid2.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expectedGrid2.add(Arrays.asList(Cell.dead, Cell.alive, Cell.alive, Cell.dead,  Cell.dead,  Cell.dead));
        expectedGrid2.add(Arrays.asList(Cell.dead, Cell.alive, Cell.alive, Cell.dead,  Cell.dead,  Cell.dead));
        expectedGrid2.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.alive, Cell.alive, Cell.dead));
        expectedGrid2.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.alive, Cell.alive, Cell.dead));
        expectedGrid2.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        TestHelper.assertGridsEquals(newGeneration2.getGridAsList(), expectedGrid2);
        Assert.assertEquals(newGeneration2.getGeneration(), 2);
    }
}
