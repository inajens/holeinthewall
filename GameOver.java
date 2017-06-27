package com.company;

import com.googlecode.lanterna.terminal.Terminal;

/**
 * Created by Administrator on 2017-06-27.
 */
public class GameOver {
    public static void EndGame (Terminal board){

        Output.ScreenPrint(5,20,"Game over!", board);
    }
}
