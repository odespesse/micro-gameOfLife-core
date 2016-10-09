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
        Automaton automaton = new Automaton();
        List<List<Cell>> newGeneration1 = automaton.createNextGeneration(seed);
        List<List<Cell>> expected1 = new ArrayList<>();
        expected1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expected1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expected1.add(Arrays.asList(Cell.dead, Cell.alive, Cell.alive, Cell.alive, Cell.dead));
        expected1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expected1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        TestHelper.assertGridsEquals(newGeneration1, expected1);
        List<List<Cell>> newGeneration2 = automaton.createNextGeneration(newGeneration1);
        List<List<Cell>> expected2 = new ArrayList<>();
        expected2.add(Arrays.asList(Cell.dead, Cell.dead, Cell.dead,  Cell.dead, Cell.dead));
        expected2.add(Arrays.asList(Cell.dead, Cell.dead, Cell.alive, Cell.dead, Cell.dead));
        expected2.add(Arrays.asList(Cell.dead, Cell.dead, Cell.alive, Cell.dead, Cell.dead));
        expected2.add(Arrays.asList(Cell.dead, Cell.dead, Cell.alive, Cell.dead, Cell.dead));
        expected2.add(Arrays.asList(Cell.dead, Cell.dead, Cell.dead,  Cell.dead, Cell.dead));
        TestHelper.assertGridsEquals(newGeneration2, expected2);
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
        Automaton automaton = new Automaton();
        List<List<Cell>> newGeneration1 = automaton.createNextGeneration(seed);
        List<List<Cell>> expected1 = new ArrayList<>();
        expected1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expected1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.alive, Cell.dead,  Cell.dead));
        expected1.add(Arrays.asList(Cell.dead, Cell.alive, Cell.dead,  Cell.dead,  Cell.alive, Cell.dead));
        expected1.add(Arrays.asList(Cell.dead, Cell.alive, Cell.dead,  Cell.dead,  Cell.alive, Cell.dead));
        expected1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.alive, Cell.dead,  Cell.dead,  Cell.dead));
        expected1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        TestHelper.assertGridsEquals(newGeneration1, expected1);
        List<List<Cell>> newGeneration2 = automaton.createNextGeneration(newGeneration1);
        List<List<Cell>> expected2 = new ArrayList<>();
        expected2.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expected2.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expected2.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.alive, Cell.alive, Cell.alive, Cell.dead));
        expected2.add(Arrays.asList(Cell.dead, Cell.alive, Cell.alive, Cell.alive, Cell.dead,  Cell.dead));
        expected2.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expected2.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        TestHelper.assertGridsEquals(newGeneration2, expected2);
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
        Automaton automaton = new Automaton();
        List<List<Cell>> newGeneration1 = automaton.createNextGeneration(seed);
        List<List<Cell>> expected1 = new ArrayList<>();
        expected1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expected1.add(Arrays.asList(Cell.dead, Cell.alive, Cell.alive, Cell.dead,  Cell.dead,  Cell.dead));
        expected1.add(Arrays.asList(Cell.dead, Cell.alive, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expected1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.alive, Cell.dead));
        expected1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.alive, Cell.alive, Cell.dead));
        expected1.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        TestHelper.assertGridsEquals(newGeneration1, expected1);
        List<List<Cell>> newGeneration2 = automaton.createNextGeneration(newGeneration1);
        List<List<Cell>> expected2 = new ArrayList<>();
        expected2.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        expected2.add(Arrays.asList(Cell.dead, Cell.alive, Cell.alive, Cell.dead,  Cell.dead,  Cell.dead));
        expected2.add(Arrays.asList(Cell.dead, Cell.alive, Cell.alive, Cell.dead,  Cell.dead,  Cell.dead));
        expected2.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.alive, Cell.alive, Cell.dead));
        expected2.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.alive, Cell.alive, Cell.dead));
        expected2.add(Arrays.asList(Cell.dead, Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead,  Cell.dead));
        TestHelper.assertGridsEquals(newGeneration2, expected2);
    }
}
