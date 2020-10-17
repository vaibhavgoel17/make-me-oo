package org.oop;

public class Point {
    final private double x;
    final private double y;

    public double distanceFromPoint(Point point) {
        double xDistance = this.x - point.x;
        double yDistance = this.y - point.y;
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public double angleFromPoint(Point point) {
        double xDistance = point.x - this.x;
        double yDistance = point.y - this.y;
        return Math.atan2(yDistance, xDistance);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
