package com.max3d.api;

import java.awt.*;

public class API {
    public static double kzx = 0;
    public static double kzy = 0;
    public static double dx = 1.0;
    public static double[] get3Dto2D(double x, double y, double z){
        double x2d = ((Math.cos(kzx) * x) - (Math.sin(kzx) * y)) * dx;
        double y2d = (((Math.cos(kzy) * ((Math.cos(kzx) * y) + (Math.sin(kzx) * x))) + (Math.sin(kzy) * z)) * dx);
        return new double[] {x2d, y2d};
    }
    public static void draw3Dline(Graphics2D g, double x, double y, double z, double x1, double y1, double z1){
        g.drawLine((int) get3Dto2D(x ,y, z)[0] + 100, (int) get3Dto2D(x ,y, z)[1] + 100, (int) get3Dto2D(x1 ,y1, z1)[0] + 100, (int) get3Dto2D(x1 ,y1, z1)[1] + 100);
    }
}
