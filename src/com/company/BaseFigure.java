package com.company;

public abstract class BaseFigure {
    private Color color;
    private Position position;

    public BaseFigure(Color color, Position position) {
        this.color = color;
        this.position = position;
    }

    public Color getColor() {
        return color;
    }

    public Position getPosition() {
        return position;
    }

    public void move(Position position) {
        this.position = position;
    }

    public abstract Iterable<Position> getPossiblePositions();
}
