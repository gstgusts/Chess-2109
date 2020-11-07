package com.company;

public class Main {

    public static void main(String[] args) {
        var whiteKing = new King(Color.WHITE, new Position(4,1));
        var blackKing = new King(Color.BLACK, new Position(4, 8));

        var whiteQueen = new Queen(Color.WHITE, new Position(5,1));
        var blackQueen = new Queen(Color.BLACK, new Position(5, 8));

        var positions = whiteKing.getPossiblePositions();

        for (var pos :
                positions) {
            System.out.println(pos);
        }

        var positions2 = blackQueen.getPossiblePositions();

        for (var pos :
                positions2) {
            System.out.println(pos);
        }
    }
}
