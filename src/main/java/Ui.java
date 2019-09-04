import java.util.Scanner;

/**
 * Represents the user interface
 * Contains a set of display messages
 */
public class Ui {
    protected Scanner input = new Scanner(System.in);
    protected String blankLines = "____________________________________________________________";

    /**
     * Prints the logo and welcome message
     *
     */
    public void showWelcome() {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";

        System.out.println("    Hello from\n" + logo);
        printBlankLine();
        System.out.println("    Hello, I'm Duke!\n    What can I do for you?");
        printBlankLine();
    }

    /**
     * Prints the farewell message
     *
     */
    public void showFarewell() {
        System.out.println("    Bye. Hope to see you again!");
    }

    /**
     * Prints a blank line
     *
     */
    public void printBlankLine() {
        System.out.println(blankLines);
    }


    /**
     * Reads system input and returns a string
     *
     * @return fullCommand The full command as input by the user
     */
    public String readCommand() {
        String fullCommand = input.nextLine();
        return fullCommand;
    }

    public void showLoadingError() {
        System.out.println("    Error occurred when loading from specified file, new task list created");
    }

}
