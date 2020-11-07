package com.company;

import java.util.ArrayList;

public class Horse extends BaseFigure {
    public Horse(Color color, Position position) {
        super(color, position);
    }

    @Override
    public Iterable<Position> getPossiblePositions() {
        return new ArrayList<>();
    }

}
