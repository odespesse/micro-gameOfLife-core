package fr.olived19.microgameoflife.core;

import java.util.List;

public class Grid {

    private List<List<Cell>> grid = null;

    public Grid(List<List<Cell>> gridSeed) {
        this.grid = gridSeed;
    }

    public Grid(Grid gridSeed) {
        this.grid = gridSeed.asList();
    }

    public int rowCount() {
        return this.grid.size();
    }

    public List<Cell> getRowAt(int rowIndex) {
        return this.grid.get(rowIndex);
    }

    public Cell getCellAt(int rowIndex, int columnIndex) {
        if (rowIndex < 0 || columnIndex < 0) {
            return Cell.dead;
        }
        if ((rowIndex >= this.grid.size()) || (columnIndex >= this.grid.get(rowIndex).size())) {
            return Cell.dead;
        }
        return this.grid.get(rowIndex).get(columnIndex);
    }

    public List<List<Cell>> asList() {
        return grid;
    }
}
