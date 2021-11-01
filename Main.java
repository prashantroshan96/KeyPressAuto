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
            System.out.println(
                    "\n ██╗░░██╗██╗░░██╗░█████╗░████████╗██████╗░░█████╗░\n ██║░██╔╝██║░░██║██╔══██╗╚══██╔══╝██╔══██╗██╔══██╗\n █████═╝░███████║███████║░░░██║░░░██████╔╝███████║\n ██╔═██╗░██╔══██║██╔══██║░░░██║░░░██╔══██╗██╔══██║\n ██║░╚██╗██║░░██║██║░░██║░░░██║░░░██║░░██║██║░░██║\n ╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░░╚═╝░░░╚═╝░░░╚═╝░░╚═╝╚═╝░░╚═╝\n");
            System.out.println("\n Starting in 5 seconds");
            Thread.sleep(5000);
            System.out.println("\n Windows log off prevention started !!! \n Enjoy :D \n");
            System.out.println("\n Press 'CTRL+C' -> 'Y' -> 'ENTER' in the console to quit.\n");
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
