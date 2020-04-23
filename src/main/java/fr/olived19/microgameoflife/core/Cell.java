package fr.olived19.microgameoflife.core;

public enum Cell {
    alive, dead;

    public boolean isAlive() {
        return this == Cell.alive;
    }

    public boolean isDead() {
        return this == Cell.dead;
    }
}
