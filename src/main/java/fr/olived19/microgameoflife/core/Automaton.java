package fr.olived19.microgameoflife.core;

import java.util.ArrayList;
import java.util.List;

public class Automaton {
    public World createNextGeneration(World world) {
        List<List<Cell>> nextGrid = new ArrayList<>();
        for(int rowIndex = 0; rowIndex < world.rowCount() ; rowIndex++) {
            List<Cell> currentRow = world.getRowAt(rowIndex);
            List<Cell> nextRow = this.createNewRow(world, rowIndex, currentRow);
            nextGrid.add(nextRow);
        }
        int currentGeneration = world.getGeneration();
        return new World(nextGrid, ++currentGeneration);
    }

    private List<Cell> createNewRow(World world, int rowIndex, List<Cell> currentRow) {
        List<Cell> nextRow = new ArrayList<>();
        for (int cellIndex = 0; cellIndex < currentRow.size(); cellIndex++) {
            Cell currentCell = currentRow.get(cellIndex);
            int nbAliveNeighbourhood = this.countAliveMooreNeighbourhood(world, rowIndex, cellIndex);
            Cell cellNextGeneration = this.transformCellState(currentCell, nbAliveNeighbourhood);
            nextRow.add(cellNextGeneration);
        }
        return nextRow;
    }

    private int countAliveMooreNeighbourhood(World world, int rowIndex, int cellIndex) {
        int nbAliveCells = 0;
        if (world.getCellAt(rowIndex - 1, cellIndex - 1).isAlive()) {
            nbAliveCells++;
        }
        if (world.getCellAt(rowIndex - 1, cellIndex).isAlive()) {
            nbAliveCells++;
        }
        if (world.getCellAt(rowIndex - 1, cellIndex + 1 ).isAlive()) {
            nbAliveCells++;
        }
        if (world.getCellAt(rowIndex, cellIndex - 1).isAlive()) {
            nbAliveCells++;
        }
        if (world.getCellAt(rowIndex, cellIndex + 1).isAlive()) {
            nbAliveCells++;
        }
        if (world.getCellAt(rowIndex + 1, cellIndex - 1).isAlive()) {
            nbAliveCells++;
        }
        if (world.getCellAt(rowIndex + 1, cellIndex).isAlive()) {
            nbAliveCells++;
        }
        if (world.getCellAt(rowIndex + 1, cellIndex + 1).isAlive()) {
            nbAliveCells++;
        }
        return nbAliveCells;
    }

    private Cell transformCellState(Cell currentCell, int nbAliveNeighbourhood) {
        Cell cellWithNextState = Cell.dead;
        if (currentCell.isAlive() && (nbAliveNeighbourhood == 2 || nbAliveNeighbourhood == 3)) {
            cellWithNextState = Cell.alive;
        }
        if (currentCell.isDead() && nbAliveNeighbourhood == 3) {
            cellWithNextState = Cell.alive;
        }
        return cellWithNextState;
    }
}
