package com.mine.craftX;

import com.mine.craftX.input.Controller;

import java.awt.event.KeyEvent;

public class Game {
    public static int time;
    public Controller controls;

    public Game(){
        controls=new Controller();

    }

    public void tick(boolean[]key) {
        time++;
        boolean forward = key[KeyEvent.VK_W];
        boolean back = key[KeyEvent.VK_S];
        boolean left = key[KeyEvent.VK_A];
        boolean right = key[KeyEvent.VK_D];
        boolean turnLeft = key[KeyEvent.VK_LEFT];
        boolean turnRight = key[KeyEvent.VK_RIGHT];
        boolean up = key[KeyEvent.VK_SPACE];
        if (up){
            System.out.println("Space pressed");
        }
        controls.tick(forward,back,left,right,turnLeft,turnRight,up);

    }


}
