package com.mine.craftX.graphics;

import com.mine.craftX.Game;

public class Render3D extends Render {

    public Render3D(int width, int height) {
        super(width, height);
    }


    public void floor(Game game) {

        double ceilingPosition = 8;
        double floorPosition = 8;

        double forward = game.controls.z;
        double right = game.controls.x;

        double rotation = game.controls.rotation;
        double cosine = Math.cos(rotation);
        double sine = Math.sin(rotation);


        for (int y = 0; y < height; y++) {
            double ceilling = (y - height / 2.0) / height;

            double z = floorPosition / ceilling;


            if (ceilling < 0) {
                z = ceilingPosition / -ceilling;
            }

            for (int x = 0; x < width; x++) {
                double depth = (x - width / 2.0) / height;
                depth *= z;
                double xx = depth * cosine + z * sine;
                double yy = z * cosine - depth * sine;
                int xPix = (int) (xx+right);
                int yPix = (int) (yy+forward);
                pixels[x + y * width] = ((xPix & 15) * 16) | ((yPix & 15) * 16) << 8;

            }
        }
    }
}
