package com.max3d.test;

import com.max3d.api.API;

public class TestAPI {

    public static void main(String[] args) {
        double[] zb = API.get3Dto2D(10, 20, 30);
        System.out.println(zb[0]);
        System.out.println(zb[1]);
    }
}
