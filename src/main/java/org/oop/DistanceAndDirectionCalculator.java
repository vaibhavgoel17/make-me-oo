package org.oop;

public class DistanceAndDirectionCalculator {
    public static double distance(Point point1, Point point2) {
        return point1.distanceFromPoint(point2);
    }

    public static double direction(Point point1, Point point2) {
        return point1.angleFromPoint(point2);
    }
}
