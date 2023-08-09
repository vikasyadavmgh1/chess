package com.vikasky.parkinglot.chesspiece;

import com.vikasky.parkinglot.powers.Powers;
import com.vikasky.parkinglot.powers.TeamColor;
import javafx.util.Pair;

public class Piece {
    private Powers currentPowers;
    private TeamColor teamColor;
//    private Pair<Integer, Character> location;
    public Piece(TeamColor teamColor, Powers powers) {
        this.teamColor = teamColor;
        this.currentPowers = powers;
//        this.location = location;
    }

    public Powers getCurrentPowers() {
        return currentPowers;
    }

    public TeamColor getTeamColor() {
        return this.teamColor;
    }

//    public Pair<Integer, Character> getLocation() {
//        return location;
//    }

}
