import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Duke {
    public static void main(String[] args) {
        /*String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);*/
        Greet();
        Detecting();
    }
    public static void Greet(){
        System.out.println("Hello! I'm Duke\nWhat can I do for you?");
    }
    public static void Detecting() {
        Scanner sc = new Scanner(System.in);
        List<String> toDo = new LinkedList<>();
        while(true) {
            String cmd = sc.nextLine();
            if (cmd.toLowerCase().equals("bye")) {
                System.out.println("Bye. Hope to see you again soon!");
                break;
            } else {
                switch (cmd.toLowerCase()) {
                    case "list":
                        for (int i = 1; i <= toDo.size(); i++) {
                            System.out.println(i + ". " + toDo.get(i-1));
                        }
                        break;
                    default:
                        toDo.add(cmd);
                        System.out.println("added: " + cmd);
                }
            }
        }
    }
}

