package com.vikasky.parkinglot.powers;

import com.vikasky.parkinglot.chesspiece.ChessBoard;
import javafx.util.Pair;

public class PawnPowers implements Powers {
    private String name = "Pawn";

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean isValidMove(ChessBoard chessBoard, Pair<Integer, Character> from, Pair<Integer, Character> to) {
        if (ChessBoard.isDestinationInsideChessBoard(to) && from != to) {
            int diffRow = to.getKey() - from.getKey();
            int diffColumn = to.getValue() - from.getValue();
            System.out.println("fromRowIn pawnpower:"+ from.getKey());
            System.out.println("fromColumnIn pawnpower"+ from.getValue());

            System.out.println("toRowIn pawnpower:"+ to.getKey());
            System.out.println("toColumnIn pawnpower:"+ to.getValue());

            System.out.println("diff row is:"+ diffRow);
            System.out.println("diff column is: "+ diffColumn);

            TeamColor colorOfPiece = chessBoard.getPieceByLocation(from).getTeamColor();
            if (diffColumn == 0 && chessBoard.getPieceByLocation(to) == null) {
                if (colorOfPiece == TeamColor.WHITE && diffRow > 0) {
                    if( (from.getKey() == 2 && (diffRow == 2 || diffRow == 1 )) || diffRow == 1) {
                        return true;
                    }
                    return false;
                }
                else if(colorOfPiece == TeamColor.BLACK && diffRow < 0) {
                    if( (from.getKey() == 7 && (diffRow == -2 || diffRow == -1 )) || diffRow == -1) {
                        return true;
                    }
                    return false;
                }
            }
            else if (Math.abs(diffColumn) == 1 && chessBoard.getPieceByLocation(to) != null) {
                if (colorOfPiece == TeamColor.WHITE && diffRow == 1) {
                    if(chessBoard.getPieceByLocation(to).getTeamColor() != colorOfPiece) {
                        return true;
                    }
                    return false;
                }
                else if(colorOfPiece == TeamColor.BLACK && diffRow == -1) {
                    if(chessBoard.getPieceByLocation(to).getTeamColor() != colorOfPiece) {
                        return true;
                    }
                    return false;
                }
            }
        }
        return false;
    }
}
