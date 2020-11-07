package com.company;

import java.util.ArrayList;
import java.util.List;

public class Queen extends BaseFigure {
    public Queen(Color color, Position position) {
        super(color, position);
    }

    @Override
    public Iterable<Position> getPossiblePositions() {
        List<Position> positions = new ArrayList<>();

        System.out.println("H and V");

        for(int i = Board.MIN_FIELD_VALUE; i <= Board.MAX_FIELD_VALUE; i++) {
            //System.out.println(i + "-" + getPosition().getY());
            checkAndAddPosition(positions, i, getPosition().getY());

            //System.out.println(getPosition().getX() + "-" + i );

            checkAndAddPosition(positions, getPosition().getX(), i);
        }

        System.out.println("D1");

        //wrong starting y and x position
        var x = getPosition().getX() - getPosition().getY() + 1;   //5 - 1 + 1 (5 +1)

        for (int i = x; i <= Board.MAX_FIELD_VALUE; i++) {
           checkAndAddPosition(positions, i, i+1);
        }
        //------------------------------

        System.out.println("D2-1");

        var y = getPosition().getY();
        for (int i = getPosition().getX() - 1; i >= Board.MIN_FIELD_VALUE; i--) {
            ++y;

            if(y > Board.MAX_FIELD_VALUE) {
                break;
            }

            positions.add(new Position(i, y));
        }

        System.out.println("D2-2");

        y = getPosition().getY();
        for (int i = getPosition().getX() + 1; i <= Board.MAX_FIELD_VALUE; i++) {
            --y;

            if(y < Board.MIN_FIELD_VALUE) {
                break;
            }

            positions.add(new Position(i, y));
        }

        return positions;
    }

    private void checkAndAddPosition(List<Position> positions, int x, int y) {
        if(x != getPosition().getX() || y != getPosition().getY()) {
            positions.add(new Position(x, y));
        }
    }

}
