package com.vikasky.parkinglot.powers;

import com.vikasky.parkinglot.chesspiece.ChessBoard;
import javafx.util.Pair;

public class QueenPowers implements Powers {
    private String name = "Queen";
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean isValidMove(ChessBoard chessBoard, Pair<Integer, Character> from, Pair<Integer, Character> to) {
        if (ChessBoard.isDestinationInsideChessBoard(to) && from != to) {
            int diffRow = Math.abs(from.getKey() - to.getKey());
            int diffColumn = Math.abs(from.getValue() - to.getValue());
            if ((diffRow == 0 ||  diffColumn == 0)) {
                if(diffRow == 0) {
                    int direction = from.getValue() - to.getValue() > 0 ? -1 : 1;
                    from = new Pair<>(from.getKey(), (char)((int)from.getValue() + direction));
                    if(chessBoard.getPieceByLocation(from) != null) {
                        return false;
                    }
                    return true;
                } else if(diffColumn == 0) {
                    int direction = from.getKey() - to.getKey() > 0 ? -1 : 1;
                    from = new Pair<>(from.getKey() + direction, from.getValue());
                    if (chessBoard.getPieceByLocation(from) != null) {
                        return false;
                    }
                    return true;
                }
            } else if ((diffRow == diffColumn)) {
                int slopeRow = from.getKey() - to.getKey() > 0 ? -1 : 1;
                int slopeColumn = from.getValue() - to.getValue() > 0 ? -1 : 1;
                for(int i=0;i<diffRow-1;i++) {
                    from = new Pair<>(from.getKey() + slopeRow, (char)((int)from.getValue() + slopeColumn));
                    if(chessBoard.getPieceByLocation(from) != null) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}