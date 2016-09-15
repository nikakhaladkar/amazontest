package framework.amazon;

/**
 * Created by nika.khaladkar on 15/09/2016.
 */
public class Utility {

    public static void waitForSomeTime()
    {
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
