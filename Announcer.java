public class Announcer {
    public static void announce(BasketballPlayer player) {
        System.out.println("ANNOUNCER - \"Now to shoot a free throw... " + player.getName() + "...\"");
    }
    
    public static void announce(Ball ball) {
        System.out.println("ANNOUNCER - \"The players are playing with a top of the line " + ball.getName());
    }
    
    public static void announce(Referee ref) {
        System.out.println("ANNOUNCER - \"Today's ref is " + ref.getName() + ".\"");
    }
}