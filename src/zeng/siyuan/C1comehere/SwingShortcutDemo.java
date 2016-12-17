package zeng.siyuan.C1comehere;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

/**
 * This Swing program demonstrates setting shortcut key and hotkey for menu
 * and button.
 * @author www.codejava.net
 *
 */
public class SwingShortcutDemo extends JFrame {
    private JButton button = new JButton();

    public SwingShortcutDemo() throws HeadlessException {
        super("Swing Shortcuts Demo");

        makeMenu();
        makeButton();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(640, 480);
        setLocationRelativeTo(null);

    }

    private void makeMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu("File");
        menuFile.setMnemonic(KeyEvent.VK_F);

        JMenuItem menuItemOpen = new JMenuItem("Open");
        menuItemOpen.setMnemonic(KeyEvent.VK_O);

        KeyStroke keyStrokeToOpen = KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK);
        menuItemOpen.setAccelerator(keyStrokeToOpen);

        menuItemOpen.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                System.out.println("Opening File...");
            }
        });

        JMenuItem menuItemSave = new JMenuItem();

        Action saveAction = new AbstractAction("Save") {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Saving...");
            }
        };
        saveAction.putValue(Action.MNEMONIC_KEY, KeyEvent.VK_S);
        saveAction.putValue(Action.ACCELERATOR_KEY,
                KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK));

        menuItemSave.setAction(saveAction);

        JMenuItem menuItemExit = new JMenuItem("Exit");
        menuItemExit.setMnemonic('X');

        menuFile.add(menuItemOpen);
        menuFile.add(menuItemSave);
        menuFile.add(menuItemExit);

        menuBar.add(menuFile);

        setJMenuBar(menuBar);
    }

    private void makeButton() {
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(button);

        Action buttonAction = new AbstractAction("Refresh") {

            @Override
            public void actionPerformed(ActionEvent evt) {
                System.out.println("Refreshing...");
            }
        };

        String key = "Refresh";

        button.setAction(buttonAction);

        buttonAction.putValue(Action.MNEMONIC_KEY, KeyEvent.VK_R);

        button.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0), key);

        button.getActionMap().put(key, buttonAction);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                new SwingShortcutDemo().setVisible(true);
            }
        });
    }

    public static class daf {
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

    public void d(int x, int y) throws AWTException{
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
        public void ac()throws InterruptedException {

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
        d(1812, 939);
    }




                } catch (AWTException e) {
                    e.printStackTrace();

                }
                }



        }

    }
}
