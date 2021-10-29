import java.io.*;
import java.util.Scanner;  
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Main {
    String command = "notepad.exe";
    static Scanner scan = new Scanner(System.in);

    public static void runTheSpaceBar() throws AWTException, InterruptedException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_SPACE);
    }

    public static void main(String[] args) throws IOException, AWTException, InterruptedException {
        String command = "notepad.exe";
        Runtime run = Runtime.getRuntime();
        run.exec(command);

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        boolean stillRunning = true;

        while (stillRunning) {
            runTheSpaceBar();
            Thread.sleep(500);
        }
    }
}
