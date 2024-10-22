import java.text.DecimalFormat;

public class BasketballPlayer {
    // ** please don't change instance variables ** //
    private String firstName;
    private String lastName;
    
    private Ball ball;
    private Boolean hasBall;
    
    private Integer freeThrowCount;
    private Integer freeThrowMade;
    private Double freeThrowPercentage;
    //////////////////////////////////////////////////
    
    // default constructor
    public BasketballPlayer() {

    }
    
    // constructor with name
    public BasketballPlayer(String first, String last) {
        firstName = first;
        lastName = last;
        
        Ball b = new Ball();
        ball = b;
        hasBall = false;
    
        freeThrowCount = 0;
        freeThrowMade = 0;
        freeThrowPercentage = 0;
    }
    
    // add constructors as you see fit
    
    // returns formatted version of first and last name
    public String getName() {
        return getFirstName() + " " + getLastName();
    }
    
    // return first name
    public String getFirstName() {

    }
    
    // returns last name
    public String getLastName() {

    }
    
    public void setBall(Ball b) {
        ball = b;
        hasBall = true;
    }
    
    public String throwBallIntoAir(Double heightInFeet, Boolean hasSpin) {
        String summaryOfThrow = firstName + " throws the ball into the air " + heightInFeet + " feet.";
        if (hasSpin) {
            summaryOfThrow += "\nWith a flick of the wrist, the ball spins away from the basket.";
        }
        return summaryOfThrow;
    }
    
    public void spinBall() {
        System.out.println(firstName + " spins the ball backwards.");
    }
    
    // print description of ball spinning on players finger
    public void spinBallOnFinger(String fingerName, Integer durationSec) {

    }
    
    // print description of player wiping sweat from body part
    public void wipeSweat(String sweatyPart, String wipeWith) {
        System.out.println(firstName + " wipes the sweat off of the " + sweatyPart + " with " + wipeWith + ".");
    }
    
    // print description of player blowing a kiss to someone
    public void blowKiss(String kissToWhom) {
        
    }
    
    // print description of player blowing a kiss
    public void blowKiss() {

    }
    
    public void scold(Referee ref) {
        System.out.println(firstName + " eyes " + ref.getName() + " menacingly.");
    }
    
    // print description of player looking at another player in a mean way
    public void scold(BasketballPlayer player) {
        
    }
    
    public void crouch() {
        System.out.println(firstName + " crouches to the ground.");
    }
    
        
    public void printStats() {
        /**
         *    **** EXAMPLE ****
         *  ~~~~~~~~~~~~~~~~~~~~~~
         *   Statistics for Shaq O'Neal:
         *   Attempts - 1
         *   Attempts Made - 0
         *
         *   Made Percentage - 0%
         *  ~~~~~~~~~~~~~~~~~~~~~~
         * 
         * - How to make a Double look good -
         * DecimalFormat f = new DecimalFormat("##.##%");
         * System.out.println(f.format(freeThrowPercentage));
         **/
    }
    
    //////////////////////////////////////////////////////////////////
    // dont change the methods in this section :)
    //////////////////////////////////////////////////////////////////
 
    public void spinBallAroundBody(Integer amount) {
        if (amount > 10) {
            amount = 10;   
        }
        
        for(int i = 0; i < amount; i++) {
            if (i == 0) {
                System.out.println(firstName + " spins the ball around his body.");
            } else {
                System.out.println("...and again..."); 
            }
            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void bounceBall(int amount) {
        System.out.println(firstName + " dribbles the ball.");
        if (amount > 10) {
            amount = 10;   
        }
        
        for(int i = 0; i < amount; i++) {
            System.out.println("Bounce...");
            try
            {
                Thread.sleep(1500);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
        }
    }
    
    // if you read this, comment how you day is going underneath this
    // comment and I'll give you an extra point
    
    public void shootBall(double successChance) {
        if (!hasBall) {
            System.out.println(firstName + " can't shoot a ball they don't have. :D");
        } else {
            System.out.print(firstName + " shoots the ball and ");
            boolean shotMade = ShotLibrary.shoot(ball, successChance);
            freeThrowCount += 1;
            //freeThrowCount = freeThrowCount + 1;
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            if (shotMade) {
                System.out.println("makes the shot!");
                freeThrowMade += 1;
            } else {
                System.out.println("misses the shot...");
            }
            freeThrowPercentage = ((double)freeThrowMade / freeThrowCount) * 100;
        }
    }
}