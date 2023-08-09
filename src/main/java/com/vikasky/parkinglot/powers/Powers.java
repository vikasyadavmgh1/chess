package com.vikasky.parkinglot.powers;

import com.vikasky.parkinglot.chesspiece.ChessBoard;

import javafx.util.Pair;

public interface Powers {
    public String getName();

    public boolean isValidMove(ChessBoard chessBoard, Pair<Integer, Character> from, Pair<Integer, Character> to);
}