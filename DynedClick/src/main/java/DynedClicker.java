
import java.awt.*;
import java.awt.event.InputEvent;

public class DynedClicker {
    public static void main(String[] args) {
        //findPosition();
        lessonClicker(3,6,2);
    }

    public static void lessonClicker(int times,int rep,int speak){
        System.out.println("Starting in 5 secs");
        try{
            Thread.sleep(5000);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        AutoClicker ac = new AutoClicker();
        System.out.println("Started");
        for (int i = 0; i < times ; i++) {
            //Repeat
            ac.setDelay(12000);
            for (int j = 0; j < rep; j++) {
                ac.setMousePosition(736,782);
                ac.clickMouse(InputEvent.BUTTON1_DOWN_MASK);
            }

            //Speak and listening
            ac.setDelay(3000);
            for (int j = 0; j < speak; j++) {
                ac.setDelay(3000);
                ac.setMousePosition(493,758);
                ac.clickMouse(InputEvent.BUTTON1_DOWN_MASK);
                ac.setDelay(5000);
                ac.setMousePosition(566,775);
                ac.clickMouse(InputEvent.BUTTON1_DOWN_MASK);
            }

            //Final repeat
            ac.setDelay(9000);
            ac.setMousePosition(736,782);
            ac.clickMouse(InputEvent.BUTTON1_DOWN_MASK);

            //Next
            ac.setDelay(5000);
            ac.setMousePosition(798,776);
            ac.clickMouse(InputEvent.BUTTON1_DOWN_MASK);
        }
        System.out.println("Ended");
    }



    public static void findPosition(){
        try{
            Thread.sleep(3000);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Starting");
        int i=1;
        while(i<=4) {
            try{
                Thread.sleep(2000);
            }
            catch (Exception e){
                e.printStackTrace();
            }
            PointerInfo a = MouseInfo.getPointerInfo();
            int x = (int)a.getLocation().getX();
            int y = (int)a.getLocation().getY();
            System.out.println(i+": "+x + " " + y);
            i++;
        }
        System.out.println("Ended");
        /* NOTE THE POSITION HERE!
         * replay: 736 782
         * speak: 493 758
         * listen: 566 775
         * next: 798 776
         * */
    }
}