package com.vikasky.parkinglot.Game_Related;

import com.vikasky.parkinglot.chesspiece.ChessBoard;
import com.vikasky.parkinglot.chesspiece.OfflinePlayer;
import com.vikasky.parkinglot.chesspiece.Piece;
import com.vikasky.parkinglot.powers.GameState;
import com.vikasky.parkinglot.powers.TeamColor;
import com.vikasky.parkinglot.time_factory.TimeFormat;
import com.vikasky.parkinglot.time_factory.TimeFormat1;
import com.vikasky.parkinglot.time_factory.TotalTimeAndTimePerMove;
import javafx.util.Pair;

import java.util.HashMap;

public class OfflineGame implements Game {

    private TeamColor winnerTeam;
    private String result;
    private GameState gameState = GameState.TO_BE_STARTED;

    private TimeFormat timeFormat;

    private ChessBoard chessBoard;

    private OfflinePlayer offlinePlayerWhite;

    private OfflinePlayer offlinePlayerBlack;

    public OfflineGame(TotalTimeAndTimePerMove totalTimeAndTimePerMove) {
        this.timeFormat = new TimeFormat1(this , totalTimeAndTimePerMove);
        this.chessBoard = new ChessBoard();

        this.offlinePlayerBlack = new OfflinePlayer(TeamColor.BLACK, "Kaalu", totalTimeAndTimePerMove.getTotalTime());
        this.offlinePlayerWhite = new OfflinePlayer(TeamColor.WHITE, "dholu", totalTimeAndTimePerMove.getTotalTime());

    }

    public OfflinePlayer getOfflinePlayerByColor(TeamColor teamColor) {
        if(teamColor == TeamColor.BLACK) {
            return offlinePlayerBlack;
        }
        return offlinePlayerWhite;
    }

    @Override
    public void startGame() {

    }

    @Override
    public TimeFormat getTimeFormat() {
        return this.timeFormat;
    }

    @Override
    public Boolean makeMove(Pair<Integer, Character> from, Pair<Integer, Character> to, TeamColor teamColor) {
        return this.chessBoard.move(getOfflinePlayerByColor(teamColor), from, to);
    }

    @Override
    public int endGame(TeamColor winnerTeamColor, String reason) {
        this.gameState = GameState.ENDED;
        this.winnerTeam = winnerTeamColor;
        this.result = reason;
        return 0;
    }

    @Override
    public void getTimeLeft(TeamColor teamColor) {

    }

    @Override
    public HashMap<Pair<Integer, Character>, Piece> getPiecesAndTheirLocations() {
        return this.chessBoard.getHashMap();
    }
}
