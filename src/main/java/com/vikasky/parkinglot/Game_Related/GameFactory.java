package com.vikasky.parkinglot.Game_Related;

import com.vikasky.parkinglot.time_factory.TimeFormat;
import com.vikasky.parkinglot.time_factory.TotalTimeAndTimePerMove;

public class GameFactory {
    public Game getGame(String type, TotalTimeAndTimePerMove totalTimeAndTimePerMove) {
        if(type.equals("offline")) {
            return new OfflineGame(totalTimeAndTimePerMove);
        }
        else if(type.equals("online")) {
            return new OnlineGame();
        }
        return null;
    }
}
