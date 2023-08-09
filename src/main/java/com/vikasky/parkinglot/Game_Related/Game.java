package com.vikasky.parkinglot.Game_Related;

import com.vikasky.parkinglot.chesspiece.Piece;
import com.vikasky.parkinglot.powers.TeamColor;
import com.vikasky.parkinglot.time_factory.TimeFormat;
import javafx.util.Pair;

import java.util.HashMap;

public interface Game {
    public void startGame();

    public TimeFormat getTimeFormat();

    Boolean makeMove(Pair<Integer, Character> from, Pair<Integer, Character> to, TeamColor teamColor);

    public int endGame(TeamColor winnerTeamColor, String reason);

    public void getTimeLeft(TeamColor teamColor);
    public HashMap<Pair<Integer, Character>, Piece> getPiecesAndTheirLocations();
}
