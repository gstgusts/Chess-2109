package com.company;

import java.util.ArrayList;

public class Queen extends BaseFigure {
    public Queen(Color color, Position position) {
        super(color, position);
    }

    @Override
    public Iterable<Position> getPossiblePositions() {
        return new ArrayList<>();
    }

}
