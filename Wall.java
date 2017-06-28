package com.company;

import com.googlecode.lanterna.terminal.Terminal;

import java.util.Random;

public class Wall implements Runnable {
    Terminal board;
    int y;
    Player p;
    boolean reset;

    Wall(Terminal board, int y, Player p) {
        this.board = board;
        this.y = y;
        this.p = p;
    }

    public void run() {
        Random ran = new Random();
        int hole;
        int score=0;
        int speed = 100;
        boolean gameon = true;
        //Player endgame = new Player(3,y,board);
        while (gameon) {
            //hole=0;
            hole = ran.nextInt(16);
            board.applyForegroundColor(255, 255, 255);
            String scoreOutput="Score: " + score;
            Output.ScreenPrint(3,25,scoreOutput,board);
            for (int x = 90; x > 2; x--) {
                board.applyForegroundColor(255, 69, 0);
                if(!(p.getY() >= hole && p.getY() <= hole+2) && x == 3) {
                    gameon = false;
                    p.die();
                    break;
                }
                for (int counter = 0; counter <= 20; counter++) {
                    if (!(hole == counter || hole + 1 == counter || hole + 2 == counter)) {
                        board.moveCursor(x, counter);
                        board.putCharacter('\u2591');
                    }
                }
                try {
                    Thread.sleep(speed);
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
            if(!gameon)
                break;
            score++;
                speed *=0.9;
        }
        board.clearScreen();
        GameOver.endGame(board, p.getY(), 3, score);
    }
}
