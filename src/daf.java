import java.awt.*;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

public class daf {
    public static void click(int x, int y) throws AWTException{
        Robot bot = new Robot();
        bot.mouseMove(x, y);
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        bot.mousePress(InputEvent.BUTTON1_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_MASK);
    }

    public static void main(String[] args) throws InterruptedException {

        //get cords of mouse code, outputs to console every 1/2 second
        //make sure to import and include the "throws in the main method"

        while(true == true)
        {
            TimeUnit.SECONDS.sleep(2);
            int mouseX = (int) MouseInfo.getPointerInfo().getLocation().getX();
            int mouseY = (int) MouseInfo.getPointerInfo().getLocation().getY();
            System.out.println("X:" + mouseX);
            System.out.println("Y:" + mouseY);
            //make sure to import

            try {
                Robot robot = new Robot();

                //
                /*
X:1784
Y:946
Red   = 31
Green = 31
Blue  = 31
X:1784
Y:946
Red   = 31
Green = 31
Blue  = 31
X:1738
Y:790
Red   = 255
Green = 255
Blue  = 255
X:1738
Y:789
Red   = 255
Green = 255
Blue  = 255


X:1597
Y:1004
Red   = 31
Green = 31
Blue  = 31
X:1594
Y:1001
Red   = 31
Green = 31
Blue  = 31
X:1414
Y:963
Red   = 43
Green = 43
Blue  = 43

Process finished with exit code 1


Process finished with exit code 1

                 */
                // The the pixel color information at 20, 20
                //


                Color color = robot.getPixelColor(1594, 1001);

                //
                // Print the RGB information of the pixel color
                //
                System.out.println("Red   = " + color.getRed());
                System.out.println("Green = " + color.getGreen());
                System.out.println("Blue  = " + color.getBlue());
if (color.getRed()==31 && color.getBlue()==31 && color.getGreen()==31) {
    click(1812, 939);
}




            } catch (AWTException e) {
                e.printStackTrace();

            }
            }



    }

}