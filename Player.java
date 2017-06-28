package com.company;

import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.terminal.Terminal;

/**
 * Created by Tullduvan on 2017-06-27.
 */
public class Player implements Runnable {
    int x;
    int y;
    Terminal board;
    boolean running = true;

    Player(int x, int y, Terminal board) {
        this.x = x;
        this.y = y;
        this.board = board;
    }

    public void die() {
        board.moveCursor(x, y);
        board.putCharacter(' ');
        this.running = false;
    }

    public int getY() {
        return y;
    }

    public void run() {
        int tempY;
        board.applyForegroundColor(89,89,89);
        board.moveCursor(x, y);
        board.putCharacter('\u265A');
        boolean otherkeypress;
        while (running) {
            otherkeypress = false;
            Key key = board.readInput();
            if (key != null) {
                tempY = y;
                switch (key.getKind()) {
                    case ArrowDown:
                        if (y < 20)
                            y++;
                        break;
                    case ArrowUp:
                        if (y > 0)
                            y--;
                        break;
                    default:
                        otherkeypress = true;
                }
                board.applyForegroundColor(89,89,89);
                board.moveCursor(x, y);
                board.putCharacter('\u265A');
                if(!otherkeypress) {
                    board.moveCursor(x, tempY);
                    board.putCharacter(' ');
                }
            }
        }
    }
}
