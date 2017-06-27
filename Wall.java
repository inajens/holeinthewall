package com.company;

import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.terminal.Terminal;
import com.sun.xml.internal.stream.util.ThreadLocalBufferAllocator;

import java.lang.reflect.GenericArrayType;
import java.util.Random;

public class Wall implements Runnable {
    Terminal board;
    int y;
    int playerY;

    public void setPlayerY(int playerY) {
        this.playerY = playerY;
    }

    Wall(Terminal board, int y) {
        this.board = board;
        this.y = y;
    }

    public void run() {
        Random ran = new Random();
        int hole;
        int score=0;
        boolean gameover = false;
        //Player endgame = new Player(3,y,board);
        while (true) {
            hole = ran.nextInt(16);
            //hole=0;
            String scoreOutput="Score: " + score;
            Output.ScreenPrint(3,25,scoreOutput,board);
            for (int x = 90; x > 2; x--) {
                System.out.println(playerY);
                if((!(playerY == hole || playerY == hole+1 || playerY == hole+2)) && x == 3) {
                    gameover = true;
                    break;
                }
                for (int counter = 0; counter <= 20; counter++) {
                    if (!(hole == counter || hole + 1 == counter || hole + 2 == counter)) {
                        board.moveCursor(x, counter);
                        board.putCharacter('\u2588');
                    }
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int counter = 0; counter <= 20; counter++) {
                    if (!(hole == counter || hole + 1 == counter || hole + 2 == counter)) {
                        board.moveCursor(x, counter);
                        board.putCharacter(' ');
                    }
                }
            }
            if(gameover)
                break;
            score++;
        }
        //endgame.setIsdead(2);
        GameOver.EndGame(board);
    }
}