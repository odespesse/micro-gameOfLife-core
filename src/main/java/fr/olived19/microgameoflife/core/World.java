package fr.olived19.microgameoflife.core;

import java.util.List;

public class World {

    private List<List<Cell>> grid = null;
    private int generation;

    public World(List<List<Cell>> grid, int generation) {
        this.grid = grid;
        this.generation = generation;
    }

    public World(World world) {
        this.grid = world.getGridAsList();
        this.generation = world.getGeneration();
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

    public List<List<Cell>> getGridAsList() {
        return grid;
    }

    public int getGeneration() {
        return generation;
    }
}
