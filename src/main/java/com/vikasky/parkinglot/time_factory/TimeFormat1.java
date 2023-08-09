package com.vikasky.parkinglot.time_factory;

import com.vikasky.parkinglot.Game_Related.Game;
import com.vikasky.parkinglot.powers.TeamColor;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TimeFormat1 implements TimeFormat {

    Stack<LocalDateTime> timeStampsOfWhiteTeamMoves;
    Stack<LocalDateTime> timeStampsOfBlackTeamMoves;

    private Game game;

    public TimeFormat1(Game game, TotalTimeAndTimePerMove totalTimeAndTimePerMove) {
        this.game = game;
    }

    @Override
    public int timeLeft(TeamColor teamColor) {
        return 0;
    }

    @Override
    public int getTotalTime() {
        return 10;
    }

    @Override
    public int TimeIsOver(TeamColor teamColor) {
        game.endGame(teamColor, "Time is over");
        return 0;
    }
}
