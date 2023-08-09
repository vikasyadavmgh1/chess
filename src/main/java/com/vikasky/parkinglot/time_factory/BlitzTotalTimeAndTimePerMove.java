package com.vikasky.parkinglot.time_factory;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BlitzTotalTimeAndTimePerMove {
    private static List<TotalTimeAndTimePerMove> applicableTotalTimeAndTimePerMoves;
    static {
        applicableTotalTimeAndTimePerMoves =  new ArrayList<>();
        applicableTotalTimeAndTimePerMoves.add(new TotalTimeAndTimePerMove(Duration.ofMinutes(3), Duration.ZERO));
        applicableTotalTimeAndTimePerMoves.add(new TotalTimeAndTimePerMove(Duration.ofMinutes(3), Duration.ofSeconds(2)));
        applicableTotalTimeAndTimePerMoves.add(new TotalTimeAndTimePerMove(Duration.ofMinutes(5), Duration.ZERO));
    }

    public static List<TotalTimeAndTimePerMove> getApplicableTotalTimeAndTimePerMove() {
        return applicableTotalTimeAndTimePerMoves;
    }
}
