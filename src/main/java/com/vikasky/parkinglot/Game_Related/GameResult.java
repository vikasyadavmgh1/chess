package com.vikasky.parkinglot.Game_Related;

import com.vikasky.parkinglot.powers.TeamColor;

public class GameResult {
    private TeamColor winnerTeam;
    private String reason;

    public GameResult(TeamColor winnerTeam, String reason) {
        this.winnerTeam = winnerTeam;
        this.reason = reason;
    }
}
