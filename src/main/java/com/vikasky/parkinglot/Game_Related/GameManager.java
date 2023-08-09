package com.vikasky.parkinglot.Game_Related;

import com.vikasky.parkinglot.time_factory.TimeFormat;
import com.vikasky.parkinglot.time_factory.TotalTimeAndTimePerMove;

public class GameManager {
    private Game offlineGame;

    public Game initializeNewGame(TotalTimeAndTimePerMove totalTimeAndTimePerMove) {
        offlineGame = new OfflineGame(totalTimeAndTimePerMove);
        return offlineGame;
    }

    public Game getOfflineGame() {
        return offlineGame;
    }
}
