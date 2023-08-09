package com.vikasky.parkinglot.time_factory;

import com.vikasky.parkinglot.powers.TeamColor;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Stack;

public interface TimeFormat {
    public int timeLeft(TeamColor teamColor);
    public int getTotalTime();

    public int TimeIsOver(TeamColor teamColor);

//    public LocalDateTime getTimeStampByTeamColor(TeamColor teamColor);
}
