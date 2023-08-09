package com.vikasky.parkinglot.time_factory;

import java.time.Duration;

public class TotalTimeAndTimePerMove {
    private Duration totalTime;
    private Duration timeIncreasePerMove;
    public TotalTimeAndTimePerMove(Duration totalTime, Duration timeIncreasePerMove) {
        this.totalTime = totalTime;
        this.timeIncreasePerMove = timeIncreasePerMove;
    }

    public Duration getTotalTime() {
        return this.totalTime;
    }

    public Duration getTimeIncreasePerMove() {
        return this.timeIncreasePerMove;
    }
}
