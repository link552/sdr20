package sdr20;

import java.util.Scanner;

public class App {

    public void run() {
        System.out.println("Menu:");
        System.out.println("1. Host");
        System.out.println("2. Join");
        System.out.println("Or press another key to quit.");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        switch (input) {
            case "1":
                Server server = new Server();
                server.run();
                break;
            case "2":
                Client client = new Client();
                client.run();
                break;
        }
    }

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }
}
