package com.vikasky.parkinglot.Game_Related;

import com.vikasky.parkinglot.chesspiece.Piece;
import com.vikasky.parkinglot.powers.TeamColor;
import com.vikasky.parkinglot.time_factory.TimeFormat;
import javafx.util.Pair;

import java.util.HashMap;

public class OnlineGame implements Game{
    @Override
    public void startGame() {

    }

    @Override
    public TimeFormat getTimeFormat() {
        return null;
    }

    @Override
    public Boolean makeMove(Pair<Integer, Character> from, Pair<Integer, Character> to, TeamColor teamColor) {
        return null;
    }

    @Override
    public int endGame(TeamColor winnerTeamColor, String reason) {
        return 0;
    }


    @Override
    public void getTimeLeft(TeamColor teamColor) {

    }

    @Override
    public HashMap<Pair<Integer, Character>, Piece> getPiecesAndTheirLocations() {
        return null;
    }

}
