package com.vikasky.parkinglot.time_factory;

import com.vikasky.parkinglot.powers.TeamColor;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeThread implements Runnable {

    private LocalDateTime startTimeOfMove;
    private Duration durationLeft;

    private TimeFormat timeFormat;

    private TeamColor teamColor;

    public TimeThread(LocalDateTime startTimeOfMove, Duration durationLeft, TimeFormat timeFormat, TeamColor teamColor) {
        this.startTimeOfMove = startTimeOfMove;
        this.durationLeft = durationLeft;
        this.timeFormat = timeFormat;
        this.teamColor = teamColor;
    }

    @Override
    public void run() {
//        try {
//            Thread.sleep(this.durationLeft.toMillis());
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        // if we reach here that means that the thread has already taken a lot of time, now this thread should stop the flow if the player is still in the same move.
//        System.out.println("latest time stamp:" + timeFormat.getTimeStampByTeamColor(teamColor));
//        System.out.println("start time of last move:" + this.startTimeOfMove);
//        if(timeFormat.getTimeStampByTeamColor(teamColor).equals(startTimeOfMove)) {
//            timeFormat.TimeIsOver(teamColor);
//        }
    }
}
