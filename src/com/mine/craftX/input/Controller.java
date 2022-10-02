package com.mine.craftX.input;

public class Controller {
    public double x, z, rotation, xa, za, rotationA, y;

    public void tick(boolean forward, boolean back, boolean left, boolean right, boolean turnLeft, boolean turnRight, boolean up) {
        double rotationSpeed = 0.025;
        double walkSpeed = 1;
        double xMove = 0;
        double zMove = 0;
        double yMove = 0;

        if (forward) {
            zMove++;
        }
        if (back) {
            zMove--;
        }
        if (left) {
            xMove--;
        }
        if (right) {
            xMove++;
        }
        if (turnLeft) {
            rotationA -= rotationSpeed;
        }
        if (turnRight) {
            rotationA += rotationSpeed;
        }
        if (up) {
            yMove++;
        }
        xa += (xMove * Math.cos(rotation) + zMove * Math.sin(rotation)) * walkSpeed;
        za += (zMove * Math.cos(rotation) - xMove * Math.sin(rotation)) * walkSpeed;
        y = yMove;
        x += xa;
        z += za;
        xa *= 0.1;
        za *= 0.1;
        rotation += rotationA;
        rotationA *= 0.3;

    }

}
