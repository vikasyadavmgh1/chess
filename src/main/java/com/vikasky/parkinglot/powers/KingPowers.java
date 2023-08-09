package com.vikasky.parkinglot.powers;

import com.vikasky.parkinglot.chesspiece.ChessBoard;
import javafx.util.Pair;

public class KingPowers implements Powers {
    private String name = "King";

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean isValidMove(ChessBoard chessBoard, Pair<Integer, Character> from, Pair<Integer, Character> to) {
        if (ChessBoard.isDestinationInsideChessBoard(to) && from != to) {
            int diffRow = Math.abs(from.getKey() - to.getKey());
            int diffColumn = Math.abs(from.getValue() - to.getValue());
            if (diffRow <= 1 && diffColumn <= 1) {
                return true;
            }
        }
        return false;
    }
}
