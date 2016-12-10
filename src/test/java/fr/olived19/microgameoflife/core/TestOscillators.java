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
        Grid seedGrid = new Grid(seed, 0);
        Automaton automaton = new Automaton();
        Grid newGeneration1 = automaton.createNextGeneration(seedGrid);
        List<List<Cell>> expectedGrid1 = new ArrayList<>();
        expectedGrid1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expectedGrid1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expectedGrid1.add(Arrays.asList(Cell.dead, Cell.alive, Cell.alive, Cell.alive, Cell.dead));
        expectedGrid1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expectedGrid1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        TestHelper.assertGridsEquals(newGeneration1.asList(), expectedGrid1);
        Assert.assertEquals(newGeneration1.getGeneration(), 1);
        Grid gridNewGeneration1 = new Grid(newGeneration1);
        Grid newGeneration2 = automaton.createNextGeneration(gridNewGeneration1);
        List<List<Cell>> expectedGrid2 = new ArrayList<>();
        expectedGrid2.add(Arrays.asList(Cell.dead, Cell.dead, Cell.dead,  Cell.dead, Cell.dead));
        expectedGrid2.add(Arrays.asList(Cell.dead, Cell.dead, Cell.alive, Cell.dead, Cell.dead));
        expectedGrid2.add(Arrays.asList(Cell.dead, Cell.dead, Cell.alive, Cell.dead, Cell.dead));
        expectedGrid2.add(Arrays.asList(Cell.dead, Cell.dead, Cell.alive, Cell.dead, Cell.dead));
        expectedGrid2.add(Arrays.asList(Cell.dead, Cell.dead, Cell.dead,  Cell.dead, Cell.dead));
        TestHelper.assertGridsEquals(newGeneration2.asList(), expectedGrid2);
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
        Grid gridSeed = new Grid(seed, 0);
        Automaton automaton = new Automaton();
        Grid newGeneration1 = automaton.createNextGeneration(gridSeed);
        List<List<Cell>> expectedGrid1 = new ArrayList<>();
        expectedGrid1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expectedGrid1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.alive, Cell.dead,  Cell.dead));
        expectedGrid1.add(Arrays.asList(Cell.dead, Cell.alive, Cell.dead,  Cell.dead,  Cell.alive, Cell.dead));
        expectedGrid1.add(Arrays.asList(Cell.dead, Cell.alive, Cell.dead,  Cell.dead,  Cell.alive, Cell.dead));
        expectedGrid1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.alive, Cell.dead,  Cell.dead,  Cell.dead));
        expectedGrid1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        TestHelper.assertGridsEquals(newGeneration1.asList(), expectedGrid1);
        Assert.assertEquals(newGeneration1.getGeneration(), 1);
        Grid gridNewGeneration1 = new Grid(newGeneration1);
        Grid newGeneration2 = automaton.createNextGeneration(gridNewGeneration1);
        List<List<Cell>> expectedGrid2 = new ArrayList<>();
        expectedGrid2.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expectedGrid2.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expectedGrid2.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.alive, Cell.alive, Cell.alive, Cell.dead));
        expectedGrid2.add(Arrays.asList(Cell.dead, Cell.alive, Cell.alive, Cell.alive, Cell.dead,  Cell.dead));
        expectedGrid2.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expectedGrid2.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        TestHelper.assertGridsEquals(newGeneration2.asList(), expectedGrid2);
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
        Grid gridSeed = new Grid(seed, 0);
        Automaton automaton = new Automaton();
        Grid newGeneration1 = automaton.createNextGeneration(gridSeed);
        List<List<Cell>> expectedGrid1 = new ArrayList<>();
        expectedGrid1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expectedGrid1.add(Arrays.asList(Cell.dead, Cell.alive, Cell.alive, Cell.dead,  Cell.dead,  Cell.dead));
        expectedGrid1.add(Arrays.asList(Cell.dead, Cell.alive, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expectedGrid1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.alive, Cell.dead));
        expectedGrid1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.alive, Cell.alive, Cell.dead));
        expectedGrid1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        TestHelper.assertGridsEquals(newGeneration1.asList(), expectedGrid1);
        Assert.assertEquals(newGeneration1.getGeneration(), 1);
        Grid gridNewGeneration1 = new Grid(newGeneration1);
        Grid newGeneration2 = automaton.createNextGeneration(gridNewGeneration1);
        List<List<Cell>> expectedGrid2 = new ArrayList<>();
        expectedGrid2.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expectedGrid2.add(Arrays.asList(Cell.dead, Cell.alive, Cell.alive, Cell.dead,  Cell.dead,  Cell.dead));
        expectedGrid2.add(Arrays.asList(Cell.dead, Cell.alive, Cell.alive, Cell.dead,  Cell.dead,  Cell.dead));
        expectedGrid2.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.alive, Cell.alive, Cell.dead));
        expectedGrid2.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.alive, Cell.alive, Cell.dead));
        expectedGrid2.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        TestHelper.assertGridsEquals(newGeneration2.asList(), expectedGrid2);
        Assert.assertEquals(newGeneration2.getGeneration(), 2);
    }
}
