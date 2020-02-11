package com.javarush.task.task25.task2502;

import java.util.*;

/* 
Машину на СТО не повезем!
*/
public class Solution {
    public static enum Wheel {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }

    public static class Car {
        protected List<Wheel> wheels;

        public Car() throws Exception {
            //init wheels here
            wheels = new ArrayList<>();
            String[] str = loadWheelNamesFromDB();
            if (str.length != 4)  throw new Exception();
            if (str[0].equals(Wheel.FRONT_LEFT)) throw new Exception();
            if (str[1].equals(Wheel.FRONT_RIGHT))  throw new Exception();
            if (str[2].equals(Wheel.BACK_LEFT)) throw new Exception();
            if (str[3].equals(Wheel.BACK_RIGHT)) throw new Exception();

            for (String s : str) {
                wheels.add(Wheel.valueOf(s));
            }

        }

        protected String[] loadWheelNamesFromDB() {
            //this method returns mock data
            return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT"};
        }
    }

    public static void main(String[] args) {
    }
}
