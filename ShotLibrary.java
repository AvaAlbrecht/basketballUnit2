public class ShotLibrary {
    public static boolean shoot(Ball ball, double successRate) {
        if (successRate > 100) {
            successRate = 100;
        }
        int max = 100;
        int min = 0;
        int range = max - min + 1;
        int rand = (int)(Math.random() * range) + min;
        return rand <= successRate;
    } 
}