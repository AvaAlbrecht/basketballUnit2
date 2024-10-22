public class Referee {
    String firstName;
    String lastName;
    
    Ball ball;
    Boolean hasBall;
    
    public Referee () {
        firstName = "FirstName";
        lastName = "LastName";
    }
    
    public Referee(String first, String last, Ball b) {
        firstName = first;
        lastName = last;
        ball = b;
    }
    
    public void passToPlayer(BasketballPlayer player) {
        System.out.println(firstName + " passes the ball to " + player.getName());
        hasBall = false;
        player.setBall(ball);
    }
    
    public void blowWhistle() {
        System.out.println(firstName + " blows a whistle.");
        System.out.println("\n********\n FWEET!\n********\n");
    }
    
    public void setBall(Ball b) {
        ball = b;
        hasBall = true;
    } 
    
    public String getName() {
        return firstName + " " + lastName;
    }
}