package com.vikasky.parkinglot.powers;

import com.vikasky.parkinglot.chesspiece.ChessBoard;
import javafx.util.Pair;

public class KnightPowers implements Powers{
    private String name = "Knight";
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean isValidMove(ChessBoard chessBoard, Pair<Integer, Character> from, Pair<Integer, Character> to) {
        if (ChessBoard.isDestinationInsideChessBoard(to) && from != to) {
            int diffRow = Math.abs(from.getKey() - to.getKey());
            int diffColumn = Math.abs(from.getValue() - to.getValue());
            if ((diffRow == 1 || diffRow == 2) && (diffColumn == 1 || diffColumn == 2) && (diffColumn + diffRow == 3)) {
                return true;
            }
        }
        return false;
    }
}
