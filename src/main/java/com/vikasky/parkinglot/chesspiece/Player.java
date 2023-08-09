package com.vikasky.parkinglot.chesspiece;

import com.vikasky.parkinglot.powers.TeamColor;

import java.time.Duration;

public interface Player {
    public TeamColor getTeamColor();

    public Duration getTimeLeft();
}
