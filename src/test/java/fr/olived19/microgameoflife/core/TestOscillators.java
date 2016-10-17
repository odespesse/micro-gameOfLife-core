package fr.olived19.microgameoflife.core;

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
        Grid gridSeed = new Grid(seed);
        Automaton automaton = new Automaton();
        Grid newGeneration1 = automaton.createNextGeneration(gridSeed);
        List<List<Cell>> expected1 = new ArrayList<>();
        expected1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expected1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expected1.add(Arrays.asList(Cell.dead, Cell.alive, Cell.alive, Cell.alive, Cell.dead));
        expected1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expected1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        TestHelper.assertGridsEquals(newGeneration1.asList(), expected1);
        Grid gridNewGeneration1 = new Grid(newGeneration1);
        Grid newGeneration2 = automaton.createNextGeneration(gridNewGeneration1);
        List<List<Cell>> expected2 = new ArrayList<>();
        expected2.add(Arrays.asList(Cell.dead, Cell.dead, Cell.dead,  Cell.dead, Cell.dead));
        expected2.add(Arrays.asList(Cell.dead, Cell.dead, Cell.alive, Cell.dead, Cell.dead));
        expected2.add(Arrays.asList(Cell.dead, Cell.dead, Cell.alive, Cell.dead, Cell.dead));
        expected2.add(Arrays.asList(Cell.dead, Cell.dead, Cell.alive, Cell.dead, Cell.dead));
        expected2.add(Arrays.asList(Cell.dead, Cell.dead, Cell.dead,  Cell.dead, Cell.dead));
        TestHelper.assertGridsEquals(newGeneration2.asList(), expected2);
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
        Grid gridSeed = new Grid(seed);
        Automaton automaton = new Automaton();
        Grid newGeneration1 = automaton.createNextGeneration(gridSeed);
        List<List<Cell>> expected1 = new ArrayList<>();
        expected1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expected1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.alive, Cell.dead,  Cell.dead));
        expected1.add(Arrays.asList(Cell.dead, Cell.alive, Cell.dead,  Cell.dead,  Cell.alive, Cell.dead));
        expected1.add(Arrays.asList(Cell.dead, Cell.alive, Cell.dead,  Cell.dead,  Cell.alive, Cell.dead));
        expected1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.alive, Cell.dead,  Cell.dead,  Cell.dead));
        expected1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        TestHelper.assertGridsEquals(newGeneration1.asList(), expected1);
        Grid gridNewGeneration1 = new Grid(newGeneration1);
        Grid newGeneration2 = automaton.createNextGeneration(gridNewGeneration1);
        List<List<Cell>> expected2 = new ArrayList<>();
        expected2.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expected2.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expected2.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.alive, Cell.alive, Cell.alive, Cell.dead));
        expected2.add(Arrays.asList(Cell.dead, Cell.alive, Cell.alive, Cell.alive, Cell.dead,  Cell.dead));
        expected2.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expected2.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        TestHelper.assertGridsEquals(newGeneration2.asList(), expected2);
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
        Grid gridSeed = new Grid(seed);
        Automaton automaton = new Automaton();
        Grid newGeneration1 = automaton.createNextGeneration(gridSeed);
        List<List<Cell>> expected1 = new ArrayList<>();
        expected1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expected1.add(Arrays.asList(Cell.dead, Cell.alive, Cell.alive, Cell.dead,  Cell.dead,  Cell.dead));
        expected1.add(Arrays.asList(Cell.dead, Cell.alive, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expected1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.alive, Cell.dead));
        expected1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.alive, Cell.alive, Cell.dead));
        expected1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        TestHelper.assertGridsEquals(newGeneration1.asList(), expected1);
        Grid gridNewGeneration1 = new Grid(newGeneration1);
        Grid newGeneration2 = automaton.createNextGeneration(gridNewGeneration1);
        List<List<Cell>> expected2 = new ArrayList<>();
        expected2.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expected2.add(Arrays.asList(Cell.dead, Cell.alive, Cell.alive, Cell.dead,  Cell.dead,  Cell.dead));
        expected2.add(Arrays.asList(Cell.dead, Cell.alive, Cell.alive, Cell.dead,  Cell.dead,  Cell.dead));
        expected2.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.alive, Cell.alive, Cell.dead));
        expected2.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.alive, Cell.alive, Cell.dead));
        expected2.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        TestHelper.assertGridsEquals(newGeneration2.asList(), expected2);
    }
}
