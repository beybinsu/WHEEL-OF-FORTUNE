
import java.sql.Timestamp;
import java.util.TimerTask;

public class TimeKeeper extends TimerTask {
    public static int ticksRemaining;
    public static boolean timerCheck;

    public TimeKeeper(){
        timerCheck = true;
        ticksRemaining = 30;
    }

    public void run(){
        switch (ticksRemaining){
            case 20:{
                System.out.println("You have 20 seconds.");
                ticksRemaining--;
                break;
            }

            case 10:{
                System.out.println("You have 10 seconds.");
                ticksRemaining--;
                break;
            }

            case 5:{
                System.out.println("You have 5 seconds left !");
                ticksRemaining--;
                break;
            }
            case 0:{
                System.out.println("You are out of time !");
                cancel();
                break;
            }
            default:{
                ticksRemaining--;
                break;
            }


        }
    }

    }

