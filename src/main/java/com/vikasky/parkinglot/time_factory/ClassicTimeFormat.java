package com.vikasky.parkinglot.time_factory;

import com.vikasky.parkinglot.powers.TeamColor;

import java.time.LocalDateTime;
import java.util.List;

public class ClassicTimeFormat implements TimeFormat{
    @Override
    public int timeLeft(TeamColor teamColor) {
        return 0;
    }

    @Override
    public int getTotalTime() {
        return 0;
    }

    @Override
    public int TimeIsOver(TeamColor teamColor) {
        return 0;
    }

}
