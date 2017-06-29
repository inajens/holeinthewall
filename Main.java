package com.company;


import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.TerminalSize;

import java.nio.charset.Charset;

public class Main {

    public static void main(String[] args) {
        Terminal board = TerminalFacade.createTerminal(System.in,
                System.out, Charset.forName("UTF8"));
        board.setCursorVisible(false);
        board.applyForegroundColor(250, 40, 108);
        board.enterPrivateMode();
        Player movePlayer = new Player(3, 10, board);
        new Thread(movePlayer).start();
        Wall printWall = new Wall(board, 3, movePlayer);
        new Thread(printWall).start();
    }
}
