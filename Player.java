package com.company;

import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.terminal.Terminal;

public class Player implements Runnable {
    int x;
    int y;
    Terminal board;
    //int isdead;

    /*public void setIsdead(int isdead) {
        this.isdead = isdead;
    }*/

    Player(int x, int y, Terminal board) {
        this.x = x;
        this.y = y;
        this.board = board;
    }

    public void run() {
        int tempY;
        board.moveCursor(x, y);
        board.putCharacter('O');
        Wall getposition = new Wall(board, y);
        while (true) {
            /*if (isdead == 2) {
                System.out.println("Hej");
                break;
            }*/
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
                }
                getposition.setPlayerY(y);
                board.moveCursor(x, y);
                board.putCharacter('O');
                board.moveCursor(x, tempY);
                board.putCharacter(' ');
            }

        }
    }

}
