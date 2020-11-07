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

        int x;
        int y;

        x = getPosition().getX() - 1;
        y = getPosition().getY();

        if(x >= Board.MIN_FIELD_VALUE && x <= Board.MAX_FIELD_VALUE
        && y >= Board.MIN_FIELD_VALUE && y <= Board.MAX_FIELD_VALUE) {
            positions.add(new Position(x, y));
        }

        x = getPosition().getX() + 1;
        y = getPosition().getY();

        if(x >= Board.MIN_FIELD_VALUE && x <= Board.MAX_FIELD_VALUE
                && y >= Board.MIN_FIELD_VALUE && y <= Board.MAX_FIELD_VALUE) {
            positions.add(new Position(x, y));
        }

        for (int i = getPosition().getX()-1; i <= getPosition().getX()+1; i++) {
            positions.add(new Position(i, getPosition().getY()-1));
            positions.add(new Position(i, getPosition().getY()+1));
        }

        return positions;
    }

}
