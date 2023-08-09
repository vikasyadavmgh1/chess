package com.vikasky.parkinglot.chesspiece;

import com.vikasky.parkinglot.powers.*;
import javafx.util.Pair;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@RestController
@ComponentScan
public class ChessBoard {

    private HashMap<Pair<Integer, Character>, Piece> pieceHashMap;

    private TeamColor currentTurnColor = TeamColor.WHITE;

    public static Integer startRow = 1;
    public static Integer endRow = 8;

    public static Character startColumn = 'a';
    public static Character endColumn = 'h';

    public static Integer getStartRow() {
        return startRow;
    }

    public ChessBoard() {
        pieceHashMap = new HashMap<>();

        Piece whiteKing  = new Piece(TeamColor.WHITE, new KingPowers());
        pieceHashMap.put(new Pair<>(1,'e'), whiteKing);

        Piece whiteQueen  = new Piece(TeamColor.WHITE, new QueenPowers());
        pieceHashMap.put(new Pair<>(1,'d'), whiteQueen);

        Piece whiteRock1  = new Piece(TeamColor.WHITE, new RockPowers());
        pieceHashMap.put(new Pair<>(1,'a'), whiteRock1);

        Piece whiteRock2  = new Piece(TeamColor.WHITE, new RockPowers());
        pieceHashMap.put(new Pair<>(1,'h'), whiteRock2);

        Piece whiteKnight1  = new Piece(TeamColor.WHITE, new KnightPowers());
        pieceHashMap.put(new Pair<>(1,'b'), whiteKnight1);

        Piece whiteKnight2  = new Piece(TeamColor.WHITE, new KnightPowers());
        pieceHashMap.put(new Pair<>(1,'g'), whiteKnight2);

        Piece whiteBishop1  = new Piece(TeamColor.WHITE, new BishopPowers());
        pieceHashMap.put(new Pair<>(1,'c'), whiteBishop1);

        Piece whiteBishop2  = new Piece(TeamColor.WHITE, new BishopPowers());
        pieceHashMap.put(new Pair<>(1,'f'), whiteBishop2);

        Piece whitePawn1  = new Piece(TeamColor.WHITE, new PawnPowers());
        pieceHashMap.put(new Pair<>(2,'a'), whitePawn1);

        Piece whitePawn2  = new Piece(TeamColor.WHITE, new PawnPowers());
        pieceHashMap.put(new Pair<>(2,'b'), whitePawn2);

        Piece whitePawn3  = new Piece(TeamColor.WHITE, new PawnPowers());
        pieceHashMap.put(new Pair<>(2,'c'), whitePawn3);

        Piece whitePawn4  = new Piece(TeamColor.WHITE, new PawnPowers());
        pieceHashMap.put(new Pair<>(2,'d'), whitePawn4);

        Piece whitePawn5  = new Piece(TeamColor.WHITE, new PawnPowers());
        pieceHashMap.put(new Pair<>(2,'e'), whitePawn5);

        Piece whitePawn6  = new Piece(TeamColor.WHITE, new PawnPowers());
        pieceHashMap.put(new Pair<>(2,'f'), whitePawn6);

        Piece whitePawn7  = new Piece(TeamColor.WHITE, new PawnPowers());
        pieceHashMap.put(new Pair<>(2,'g'), whitePawn7);

        Piece whitePawn8  = new Piece(TeamColor.WHITE, new PawnPowers());
        pieceHashMap.put(new Pair<>(2,'h'), whitePawn8);

        // BLACK PIECES
        Piece blackKing  = new Piece(TeamColor.BLACK, new KingPowers());
        pieceHashMap.put(new Pair<>(8,'e'), blackKing);

        Piece blackQueen  = new Piece(TeamColor.BLACK, new QueenPowers());
        pieceHashMap.put(new Pair<>(8,'d'), blackQueen);

        Piece blackRock1  = new Piece(TeamColor.BLACK, new RockPowers());
        pieceHashMap.put(new Pair<>(8,'a'), blackRock1);

        Piece blackRock2  = new Piece(TeamColor.BLACK, new RockPowers());
        pieceHashMap.put(new Pair<>(8,'h'), blackRock2);

        Piece blackKnight1  = new Piece(TeamColor.BLACK, new KnightPowers());
        pieceHashMap.put(new Pair<>(8,'b'), blackKnight1);

        Piece blackKnight2  = new Piece(TeamColor.BLACK, new KnightPowers());
        pieceHashMap.put(new Pair<>(8,'g'), blackKnight2);

        Piece blackBishop1  = new Piece(TeamColor.BLACK, new BishopPowers());
        pieceHashMap.put(new Pair<>(8,'c'), blackBishop1);

        Piece blackBishop2  = new Piece(TeamColor.BLACK, new BishopPowers());
        pieceHashMap.put(new Pair<>(8,'f'), blackBishop2);

        Piece blackPawn1  = new Piece(TeamColor.BLACK, new PawnPowers());
        pieceHashMap.put(new Pair<>(7,'a'), blackPawn1);

        Piece blackPawn2  = new Piece(TeamColor.BLACK, new PawnPowers());
        pieceHashMap.put(new Pair<>(7,'b'), blackPawn2);

        Piece blackPawn3  = new Piece(TeamColor.BLACK, new PawnPowers());
        pieceHashMap.put(new Pair<>(7,'c'), blackPawn3);

        Piece blackPawn4  = new Piece(TeamColor.BLACK, new PawnPowers());
        pieceHashMap.put(new Pair<>(7,'d'), blackPawn4);

        Piece blackPawn5  = new Piece(TeamColor.BLACK, new PawnPowers());
        pieceHashMap.put(new Pair<>(7,'e'), blackPawn5);

        Piece blackPawn6  = new Piece(TeamColor.BLACK, new PawnPowers());
        pieceHashMap.put(new Pair<>(7,'f'), blackPawn6);

        Piece blackPawn7  = new Piece(TeamColor.BLACK, new PawnPowers());
        pieceHashMap.put(new Pair<>(7,'g'), blackPawn7);

        Piece blackPawn8  = new Piece(TeamColor.BLACK, new PawnPowers());
        pieceHashMap.put(new Pair<>(7,'h'), blackPawn8);

    }

    public TeamColor changeCurrentTurnColor() {
        if (this.currentTurnColor == TeamColor.WHITE) {
            this.currentTurnColor = TeamColor.BLACK;
        }
        else {
            this.currentTurnColor = TeamColor.BLACK;
        }
        return this.currentTurnColor;
    }

    public Piece getPieceByLocation(Pair<Integer, Character> location) {
        if(pieceHashMap.containsKey(location))
            return pieceHashMap.get(location);
        return null;
    }

    public Piece setPieceByLocation(Piece p, Pair<Integer, Character> location) {
        if(p == null)
            return null;
        pieceHashMap.put(location, p);
        return p;
    }

    public Piece removePieceAtLocation(Pair<Integer, Character> location) {
        Piece temp = pieceHashMap.remove(location);
        return temp;
    }

    public HashMap<Pair<Integer, Character>, Piece> getHashMap() {
        return this.pieceHashMap;
    }

    public static Integer getEndRow() {
        return endRow;
    }

    public static Character getStartColumn() {
        return startColumn;
    }

    public static Character getEndColumn() {
        return endColumn;
    }

    public static boolean isDestinationInsideChessBoard(Pair<Integer, Character> to) {
        if (to.getKey() >= ChessBoard.getStartRow() && to.getKey() <= ChessBoard.getEndRow() && to.getValue() >= ChessBoard.getStartColumn() && to.getValue() <= ChessBoard.getEndColumn()) {
            return true;
        }
        return false;
    }

    public boolean isDestinationSameColor(Pair<Integer, Character> from, Pair<Integer, Character> to) {
        if(this.getPieceByLocation(from) != null && this.getPieceByLocation(to) != null) {
            return this.getPieceByLocation(from).getTeamColor() == this.getPieceByLocation(to).getTeamColor();
        }
        return false;
    }

    public boolean isItCheck(TeamColor teamColor) {
        Piece king = null;
        Pair<Integer, Character> kingLocation = null;
        Iterator hmIterator = pieceHashMap.entrySet().iterator();
        while (hmIterator.hasNext()) {
            Map.Entry currentEntry = (Map.Entry) hmIterator.next();
            Piece currentPiece = (Piece)currentEntry.getValue();
            if(currentPiece.getTeamColor() == teamColor && currentPiece.getCurrentPowers().getName().equalsIgnoreCase("King")) {
                king = currentPiece;
                kingLocation = (Pair<Integer, Character>) currentEntry.getKey();
                break;
            }
        }

        if(king != null) {
            while (hmIterator.hasNext()) {
                Map.Entry currentEntry = (Map.Entry) hmIterator.next();
                Piece currentPiece = (Piece)currentEntry.getValue();
                Pair<Integer, Character> currentLocation = (Pair<Integer, Character>) currentEntry.getKey();
                if(currentPiece.getCurrentPowers().isValidMove(this, currentLocation, kingLocation)) {
                    System.out.println("hi"+currentLocation.getKey() +" : "+ currentLocation.getValue() +" :"+kingLocation.getKey()+" : "+kingLocation.getValue());
                    return true;
                }
            }
        }
        return false;
    }

    public boolean move(Player currentPlayer, Pair<Integer, Character> from, Pair<Integer, Character> to) {
        System.out.println("this is called");
        if(checkIfValidMove(currentPlayer, from, to)) {
            Piece originalPieceAtToLocation = this.getPieceByLocation(to);
            Piece originalPieceAtFromLocation = this.getPieceByLocation(from);
            this.setPieceByLocation(originalPieceAtFromLocation, to);
            this.removePieceAtLocation(from);
            this.changeCurrentTurnColor();
            return true;
        }
        return false;
    }

    public boolean checkIfValidMove(Player currentPlayer, Pair<Integer, Character> from, Pair<Integer, Character> to) {
        System.out.printf("checkifvalidmove is called");
        if(currentPlayer.getTeamColor() != this.currentTurnColor) {
            System.out.printf("current turn is of:"+ this.currentTurnColor+", and the request comes from the color:"+currentPlayer.getTeamColor());
            return false;
        }

        if(this.getPieceByLocation(from) != null && this.getPieceByLocation(from).getTeamColor() == currentTurnColor && isDestinationInsideChessBoard(to) && !isDestinationSameColor(from, to)) {
            Piece pieceToMove = this.getPieceByLocation(from);
            if(pieceToMove.getCurrentPowers().isValidMove(this, from, to)) {
                Piece originalPieceAtToLocation = this.getPieceByLocation(to);
                Piece originalPieceAtFromLocation = this.getPieceByLocation(from);
                this.setPieceByLocation(originalPieceAtFromLocation, to);
                this.removePieceAtLocation(from);
                if (this.isItCheck(this.currentTurnColor)) {
                    this.setPieceByLocation(originalPieceAtFromLocation, from);
                    this.setPieceByLocation(originalPieceAtToLocation, to);
                    System.out.printf("Not valid because it will be check after this move");
                    return false;
                }
                this.setPieceByLocation(originalPieceAtFromLocation, from);
                this.setPieceByLocation(originalPieceAtToLocation, to);
                System.out.printf("Valid move!!!!!!!!!!bsdk");
                return true;
            }
            System.out.printf("Not valid because the powers of this piece are not enough");
            return false;
        }
        System.out.printf("Either the location is empty or the destination is not inside the chess board or the destination has the same colored piece");
        return false;
    }

}
