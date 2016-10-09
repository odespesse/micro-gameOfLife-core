package fr.olived19.microgameoflife.core;

import java.util.ArrayList;
import java.util.List;

public class Automaton {
    public List<List<Cell>> createNextGeneration(List<List<Cell>> gridSeed) {
        List<List<Cell>> gridNextGeneration = new ArrayList<>();
        for(int rowIndex = 0; rowIndex < gridSeed.size() ; rowIndex++) {
            List<Cell> currentRow = gridSeed.get(rowIndex);
            List<Cell> rowNextGeneration = new ArrayList<>();
            for (int columnIndex = 0; columnIndex < currentRow.size(); columnIndex++) {
                Cell currentCell = currentRow.get(columnIndex);
                int nbColumns = currentRow.size();
                int nbAliveNeighbourhood = this.countAliveMooreNeighbourhood(gridSeed, rowIndex, columnIndex, nbColumns);
                Cell cellNextGeneration = Cell.dead;
                if (currentCell == Cell.alive && (nbAliveNeighbourhood == 2 || nbAliveNeighbourhood == 3)) {
                    cellNextGeneration = Cell.alive;
                }
                if (currentCell == Cell.dead && nbAliveNeighbourhood == 3) {
                    cellNextGeneration = Cell.alive;
                }
                rowNextGeneration.add(cellNextGeneration);
            }
            gridNextGeneration.add(rowNextGeneration);
        }
        return gridNextGeneration;
    }

    private int countAliveMooreNeighbourhood(List<List<Cell>> gridSeed, int rowIndex, int columnIndex, int nbColumns) {
        int nbAliveCells = 0;
        if (rowIndex > 0) {
            if (columnIndex > 0 && gridSeed.get(rowIndex - 1).get(columnIndex - 1) == Cell.alive) {
                nbAliveCells++;
            }
            if (gridSeed.get(rowIndex - 1).get(columnIndex) == Cell.alive) {
                nbAliveCells++;
            }
            if ((columnIndex < nbColumns - 1) && gridSeed.get(rowIndex - 1).get(columnIndex + 1 ) == Cell.alive) {
                nbAliveCells++;
            }
        }
        if (columnIndex > 0 && gridSeed.get(rowIndex).get(columnIndex-1) == Cell.alive) {
            nbAliveCells++;
        }
        if ((columnIndex < nbColumns - 1) && gridSeed.get(rowIndex).get(columnIndex + 1) == Cell.alive) {
            nbAliveCells++;
        }
        if (rowIndex < gridSeed.size() - 1) {
            if (columnIndex > 0 && gridSeed.get(rowIndex+1).get(columnIndex - 1) == Cell.alive) {
                nbAliveCells++;
            }
            if (gridSeed.get(rowIndex + 1).get(columnIndex) == Cell.alive) {
                nbAliveCells++;
            }
            if ((columnIndex < nbColumns - 1) && gridSeed.get(rowIndex+1).get(columnIndex + 1) == Cell.alive) {
                nbAliveCells++;
            }
        }
        return nbAliveCells;
    }
}
