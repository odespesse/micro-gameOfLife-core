package fr.olived19.microgameoflife.core;

import java.util.ArrayList;
import java.util.List;

public class Automaton {
    public Grid createNextGeneration(Grid gridSeed) {
        List<List<Cell>> nextGeneration = new ArrayList<>();
        for(int rowIndex = 0; rowIndex < gridSeed.rowCount() ; rowIndex++) {
            List<Cell> currentRow = gridSeed.getRowAt(rowIndex);
            List<Cell> rowNextGeneration = this.createNewRow(gridSeed, rowIndex, currentRow);
            nextGeneration.add(rowNextGeneration);
        }
        int seedGeneration = gridSeed.getGeneration();
        return new Grid(nextGeneration, ++seedGeneration);
    }

    private List<Cell> createNewRow(Grid gridSeed, int rowIndex, List<Cell> currentRow) {
        List<Cell> rowNextGeneration = new ArrayList<>();
        for (int cellIndex = 0; cellIndex < currentRow.size(); cellIndex++) {
            Cell currentCell = currentRow.get(cellIndex);
            int nbAliveNeighbourhood = this.countAliveMooreNeighbourhood(gridSeed, rowIndex, cellIndex);
            Cell cellNextGeneration = this.transformCellState(currentCell, nbAliveNeighbourhood);
            rowNextGeneration.add(cellNextGeneration);
        }
        return rowNextGeneration;
    }

    private int countAliveMooreNeighbourhood(Grid gridSeed, int rowIndex, int cellIndex) {
        int nbAliveCells = 0;
        if (gridSeed.getCellAt(rowIndex - 1, cellIndex - 1).isAlive()) {
            nbAliveCells++;
        }
        if (gridSeed.getCellAt(rowIndex - 1, cellIndex).isAlive()) {
            nbAliveCells++;
        }
        if (gridSeed.getCellAt(rowIndex - 1, cellIndex + 1 ).isAlive()) {
            nbAliveCells++;
        }
        if (gridSeed.getCellAt(rowIndex, cellIndex - 1).isAlive()) {
            nbAliveCells++;
        }
        if (gridSeed.getCellAt(rowIndex, cellIndex + 1).isAlive()) {
            nbAliveCells++;
        }
        if (gridSeed.getCellAt(rowIndex + 1, cellIndex - 1).isAlive()) {
            nbAliveCells++;
        }
        if (gridSeed.getCellAt(rowIndex + 1, cellIndex).isAlive()) {
            nbAliveCells++;
        }
        if (gridSeed.getCellAt(rowIndex + 1, cellIndex + 1).isAlive()) {
            nbAliveCells++;
        }
        return nbAliveCells;
    }

    private Cell transformCellState(Cell currentCell, int nbAliveNeighbourhood) {
        Cell cellNextGeneration = Cell.dead;
        if (currentCell.isAlive() && (nbAliveNeighbourhood == 2 || nbAliveNeighbourhood == 3)) {
            cellNextGeneration = Cell.alive;
        }
        if (currentCell.isDead() && nbAliveNeighbourhood == 3) {
            cellNextGeneration = Cell.alive;
        }
        return cellNextGeneration;
    }
}
