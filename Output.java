package com.company;

import com.googlecode.lanterna.terminal.Terminal;

/**
 * Created by Tullduvan on 2017-06-27.
 */
public class Output {
    public static void ScreenPrint(int x, int y, String message, Terminal board) {
        for (int i = 0; i < message.length(); i++) {
            board.moveCursor(x++, y);
            board.putCharacter(message.charAt(i));
        }
    }
}
