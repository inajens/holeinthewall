package com.company;

import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.terminal.Terminal;



public class GameOver {
    public static void endGame(Terminal board, int y, int x, int score){
        //Output.ScreenPrint(5,20,"Game over!", board);
        try {
            Explosion(x, y, board);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        board.applyForegroundColor(255, 255, 255);
        PrintBoardGameOver(board);
        String myscore = "Your score is " + score;
        Output.ScreenPrint(5, 16, "Press q to quit!", board);
        Output.ScreenPrint(13, 19, myscore, board);
        board.applyForegroundColor(250, 40, 108);
        printGameOver(board);
        Key key = null;
        do{
            key = board.readInput();
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        while(key == null);

        if(key.getCharacter() == 'q' || key.getCharacter() == 'Q') {
            board.clearScreen();
            board.applyForegroundColor(255, 255, 255);
            Output.ScreenPrint(10,10,"THANK YOU FOR PLAYING", board);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.exit(0);
        }
    }
    public static void printGameOver (Terminal board){
        board.moveCursor(7, 3);
        board.putCharacter('\u2587');
        board.moveCursor(5, 3);
        board.putCharacter('\u2587');
        board.moveCursor(6, 3);
        board.putCharacter('\u2587');
        board.moveCursor(4, 4);
        board.putCharacter('\u2587');
        board.moveCursor(4, 5);
        board.putCharacter('\u2587');
        board.moveCursor(4, 6);
        board.putCharacter('\u2587');
        board.moveCursor(5, 7);
        board.putCharacter('\u2587');
        board.moveCursor(6, 7);
        board.putCharacter('\u2587');
        board.moveCursor(7, 7);
        board.putCharacter('\u2587');
        board.moveCursor(8, 7);
        board.putCharacter('\u2587');
        board.moveCursor(8, 5);
        board.putCharacter('\u2587');
        board.moveCursor(9, 6);
        board.putCharacter('\u2587');
        board.moveCursor(7, 5);
        board.putCharacter('\u2587');
        //A
        board.moveCursor(13, 7);
        board.putCharacter('\u2587');
        board.moveCursor(13, 6);
        board.putCharacter('\u2587');
        board.moveCursor(13, 5);
        board.putCharacter('\u2587');
        board.moveCursor(14, 4);
        board.putCharacter('\u2587');
        board.moveCursor(15, 3);
        board.putCharacter('\u2587');
        board.moveCursor(16, 3);
        board.putCharacter('\u2587');
        board.moveCursor(17, 4);
        board.putCharacter('\u2587');
        board.moveCursor(18, 5);
        board.putCharacter('\u2587');
        board.moveCursor(18, 6);
        board.putCharacter('\u2587');
        board.moveCursor(18, 7);
        board.putCharacter('\u2587');
        board.moveCursor(17, 6);
        board.putCharacter('\u2587');
        board.moveCursor(16, 6);
        board.putCharacter('\u2587');
        board.moveCursor(15, 6);
        board.putCharacter('\u2587');
        board.moveCursor(14, 6);
        board.putCharacter('\u2587');
        //M
        board.moveCursor(22, 7);
        board.putCharacter('\u2587');
        board.moveCursor(22, 6);
        board.putCharacter('\u2587');
        board.moveCursor(22, 5);
        board.putCharacter('\u2587');
        board.moveCursor(22, 4);
        board.putCharacter('\u2587');
        board.moveCursor(23, 3);
        board.putCharacter('\u2587');
        board.moveCursor(24, 4);
        board.putCharacter('\u2587');
        board.moveCursor(25, 5);
        board.putCharacter('\u2587');
        board.moveCursor(26, 5);
        board.putCharacter('\u2587');
        board.moveCursor(27, 4);
        board.putCharacter('\u2587');
        board.moveCursor(28, 3);
        board.putCharacter('\u2587');
        board.moveCursor(29, 4);
        board.putCharacter('\u2587');
        board.moveCursor(29, 5);
        board.putCharacter('\u2587');
        board.moveCursor(29, 6);
        board.putCharacter('\u2587');
        board.moveCursor(29, 7);
        board.putCharacter('\u2587');
        //E
        board.moveCursor(33, 7);
        board.putCharacter('\u2587');
        board.moveCursor(33, 6);
        board.putCharacter('\u2587');
        board.moveCursor(33, 5);
        board.putCharacter('\u2587');
        board.moveCursor(33, 4);
        board.putCharacter('\u2587');
        board.moveCursor(33, 3);
        board.putCharacter('\u2587');
        board.moveCursor(34, 3);
        board.putCharacter('\u2587');
        board.moveCursor(35, 3);
        board.putCharacter('\u2587');
        board.moveCursor(36, 3);
        board.putCharacter('\u2587');
        board.moveCursor(34, 5);
        board.putCharacter('\u2587');
        board.moveCursor(35, 5);
        board.putCharacter('\u2587');
        board.moveCursor(34, 7);
        board.putCharacter('\u2587');
        board.moveCursor(35, 7);
        board.putCharacter('\u2587');
        board.moveCursor(36, 7);
        board.putCharacter('\u2587');
        //O
        board.moveCursor(8, 9);
        board.putCharacter('\u2587');
        board.moveCursor(7, 9);
        board.putCharacter('\u2587');
        board.moveCursor(6, 10);
        board.putCharacter('\u2587');
        board.moveCursor(5, 11);
        board.putCharacter('\u2587');
        board.moveCursor(6, 12);
        board.putCharacter('\u2587');
        board.moveCursor(7, 13);
        board.putCharacter('\u2587');
        board.moveCursor(8, 13);
        board.putCharacter('\u2587');
        board.moveCursor(9, 12);
        board.putCharacter('\u2587');
        board.moveCursor(10, 11);
        board.putCharacter('\u2587');
        board.moveCursor(9, 10);
        board.putCharacter('\u2587');
        //V
        board.moveCursor(14, 9);
        board.putCharacter('\u2587');
        board.moveCursor(14, 10);
        board.putCharacter('\u2587');
        board.moveCursor(15, 11);
        board.putCharacter('\u2587');
        board.moveCursor(16, 12);
        board.putCharacter('\u2587');
        board.moveCursor(17, 13);
        board.putCharacter('\u2587');
        board.moveCursor(18, 12);
        board.putCharacter('\u2587');
        board.moveCursor(19, 11);
        board.putCharacter('\u2587');
        board.moveCursor(20, 10);
        board.putCharacter('\u2587');
        board.moveCursor(20, 9);
        board.putCharacter('\u2587');
        //E
        board.moveCursor(24, 9);
        board.putCharacter('\u2587');
        board.moveCursor(24, 10);
        board.putCharacter('\u2587');
        board.moveCursor(24, 11);
        board.putCharacter('\u2587');
        board.moveCursor(24, 12);
        board.putCharacter('\u2587');
        board.moveCursor(24, 13);
        board.putCharacter('\u2587');
        board.moveCursor(25, 9);
        board.putCharacter('\u2587');
        board.moveCursor(26, 9);
        board.putCharacter('\u2587');
        board.moveCursor(27, 9);
        board.putCharacter('\u2587');
        board.moveCursor(25, 11);
        board.putCharacter('\u2587');
        board.moveCursor(26, 11);
        board.putCharacter('\u2587');
        board.moveCursor(25, 13);
        board.putCharacter('\u2587');
        board.moveCursor(26, 13);
        board.putCharacter('\u2587');
        board.moveCursor(27, 13);
        board.putCharacter('\u2587');
        //R
        board.moveCursor(31, 9);
        board.putCharacter('\u2587');
        board.moveCursor(31, 10);
        board.putCharacter('\u2587');
        board.moveCursor(31, 11);
        board.putCharacter('\u2587');
        board.moveCursor(31, 12);
        board.putCharacter('\u2587');
        board.moveCursor(31, 13);
        board.putCharacter('\u2587');
        board.moveCursor(32, 9);
        board.putCharacter('\u2587');
        board.moveCursor(33, 9);
        board.putCharacter('\u2587');
        board.moveCursor(34, 10);
        board.putCharacter('\u2587');
        board.moveCursor(33, 11);
        board.putCharacter('\u2587');
        board.moveCursor(32, 11);
        board.putCharacter('\u2587');
        board.moveCursor(33, 12);
        board.putCharacter('\u2587');
        board.moveCursor(34, 13);
        board.putCharacter('\u2587');
    }
    public static void Explosion (int x, int y, Terminal board)throws InterruptedException{
        board.applyForegroundColor(255,0,0);
        board.moveCursor(x, y);
        board.putCharacter('*');
        Thread.sleep(500);
        board.clearScreen();
        board.moveCursor(x+1,y+1);
        board.putCharacter('*');
        board.moveCursor(x-1, y-1);
        board.putCharacter('*');
        board.moveCursor(x, y-1);
        board.putCharacter('*');
        board.moveCursor(x-1, y);
        board.putCharacter('*');
        board.moveCursor(x+1, y);
        board.putCharacter('*');
        board.moveCursor(x, y+1);
        board.putCharacter('*');
        Thread.sleep(500);
        board.clearScreen();
        board.moveCursor(x+2,y+2);
        board.putCharacter('*');
        board.moveCursor(x-2, y-2);
        board.putCharacter('*');
        board.moveCursor(x, y-2);
        board.putCharacter('*');
        board.moveCursor(x-2, y);
        board.putCharacter('*');
        board.moveCursor(x+2, y);
        board.putCharacter('*');
        board.moveCursor(x, y+2);
        board.putCharacter('*');
        Thread.sleep(500);
        board.clearScreen();
        board.moveCursor(x+3,y+3);
        board.putCharacter('*');
        board.moveCursor(x-3, y-3);
        board.putCharacter('*');
        board.moveCursor(x, y-3);
        board.putCharacter('*');
        board.moveCursor(x-3, y);
        board.putCharacter('*');
        board.moveCursor(x+3, y);
        board.putCharacter('*');
        board.moveCursor(x, y+3);
        board.putCharacter('*');
        Thread.sleep(500);
        board.clearScreen();
        board.moveCursor(x+4,y+4);
        board.putCharacter('*');
        board.moveCursor(x-4, y-4);
        board.putCharacter('*');
        board.moveCursor(x, y-4);
        board.putCharacter('*');
        board.moveCursor(x-4, y);
        board.putCharacter('*');
        board.moveCursor(x+4, y);
        board.putCharacter('*');
        board.moveCursor(x, y+4);
        board.putCharacter('*');
        board.moveCursor(x-1,y+1);
        board.putCharacter('*');
        board.moveCursor(x-1, y+1);
        board.putCharacter('*');
        board.moveCursor(x, y-1);
        board.putCharacter('*');
        board.moveCursor(x-1, y);
        board.putCharacter('*');
        board.moveCursor(x+1, y);
        board.putCharacter('*');
        board.moveCursor(x, y+1);
        board.putCharacter('*');
        Thread.sleep(500);
        board.clearScreen();
        board.moveCursor(x-2,y+2);
        board.putCharacter('*');
        board.moveCursor(x-2, y+2);
        board.putCharacter('*');
        board.moveCursor(x, y-2);
        board.putCharacter('*');
        board.moveCursor(x-2, y);
        board.putCharacter('*');
        board.moveCursor(x+2, y);
        board.putCharacter('*');
        board.moveCursor(x, y+2);
        board.putCharacter('*');
        Thread.sleep(500);
        board.clearScreen();
        board.moveCursor(x-3,y+3);
        board.putCharacter('*');
        board.moveCursor(x-3, y+3);
        board.putCharacter('*');
        board.moveCursor(x, y-3);
        board.putCharacter('*');
        board.moveCursor(x-3, y);
        board.putCharacter('*');
        board.moveCursor(x+3, y);
        board.putCharacter('*');
        board.moveCursor(x, y+3);
        board.putCharacter('*');
        Thread.sleep(500);
        board.clearScreen();

    }
    public static void PrintBoardGameOver(Terminal terminal){
        for(int i=2;i<39;i++){
            terminal.moveCursor(i,1);
            terminal.putCharacter('_');
            terminal.moveCursor(i,20);
            terminal.putCharacter('_');

        }
        for(int i=2;i<39;i++) {
            terminal.moveCursor(i, 17);
            terminal.putCharacter('-');
            terminal.moveCursor(i, 15);
            terminal.putCharacter('-');
        }
        for(int i=2;i<21;i++){
            terminal.moveCursor(1,i);
            terminal.putCharacter('|');
            terminal.moveCursor(39,i);
            terminal.putCharacter('|');
        }
    }
}
