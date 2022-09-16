public class Main {
    public static void main(String[] args) {
        // 三角形の面積
        double bottom = 10.0;
        double height = 5.0;
        double triangleArea = calcTriangleArea(bottom, height);
        System.out.println("三角形の底辺の長さが" + bottom + "cm、高さが" + height + "cmの場合、面積は" + triangleArea + "㎠");
        // 円の面積
        double radius = 5.0;
        double circleArea = calcCircleArea(radius);
        System.out.println("円の半径が" + radius + "cmの場合、面積は" + circleArea + "㎠");
    }
    
    public static double calcTriangleArea(double bottom, double height) {
        return bottom * height / 2;
    }
    
    public static double calcCircleArea(double radius) {
        return radius * radius * Math.PI;
    }
}
