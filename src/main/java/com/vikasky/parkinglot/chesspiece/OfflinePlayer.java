package com.vikasky.parkinglot.chesspiece;

import com.vikasky.parkinglot.Game_Related.OfflineGame;
import com.vikasky.parkinglot.powers.TeamColor;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Stack;

public class OfflinePlayer implements Player {

    private TeamColor teamColor;

    private String name;

    private Duration timeLeft;

    public OfflinePlayer(TeamColor teamColor, String name, Duration totalTime) {
        this.teamColor = teamColor;
        this.name = name;
        this.timeLeft = totalTime;
    }

    public Stack<LocalDateTime> timeStampsOfMoves;

    public Stack<LocalDateTime> getTimeStamps() {
        return timeStampsOfMoves;
    }

    public LocalDateTime getLastMoveTimeStamp() {
        synchronized (timeStampsOfMoves) {
            return timeStampsOfMoves.peek();
        }
    }

    public LocalDateTime addTimeStampOfLastMove(LocalDateTime localDateTime) {
        synchronized (timeStampsOfMoves) {
            this.timeStampsOfMoves.add(localDateTime);
            return localDateTime;
        }
    }

    public Duration getTimeLeft() {
        return this.timeLeft;
    }

    @Override
    public TeamColor getTeamColor() {
        return teamColor;
    }
}
