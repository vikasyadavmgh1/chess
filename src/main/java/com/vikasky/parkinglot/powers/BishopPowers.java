package com.vikasky.parkinglot.powers;

import com.vikasky.parkinglot.chesspiece.ChessBoard;
import javafx.util.Pair;

public class BishopPowers implements Powers {
    private String name = "Bishop";
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean isValidMove(ChessBoard chessBoard, Pair<Integer, Character> from, Pair<Integer, Character> to) {
        if (ChessBoard.isDestinationInsideChessBoard(to) && from != to) {
            int diffRow = Math.abs(from.getKey() - to.getKey());
            int diffColumn = Math.abs(from.getValue() - to.getValue());
            if ((diffRow == diffColumn)) {
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
