package com.company;

import java.util.ArrayList;
import java.util.List;

public class King extends BaseFigure {
    public King(Color color, Position position) {
        super(color, position);
    }

    @Override
    public Iterable<Position> getPossiblePositions() {
        List<Position> positions = new ArrayList<>();

        checkAndAddPosition(positions, getPosition().getX() - 1, getPosition().getY());
        checkAndAddPosition(positions, getPosition().getX() + 1, getPosition().getY());

        for (int i = getPosition().getX()-1; i <= getPosition().getX()+1; i++) {
            checkAndAddPosition(positions, i, getPosition().getY()-1);
            checkAndAddPosition(positions, i, getPosition().getY()+1);
        }

        return positions;
    }

    private void checkAndAddPosition(List<Position> positions, int x, int y) {
        if (x >= Board.MIN_FIELD_VALUE && x <= Board.MAX_FIELD_VALUE
                && y >= Board.MIN_FIELD_VALUE && y <= Board.MAX_FIELD_VALUE) {
            positions.add(new Position(x, y));
        }
    }

}
