package sdr20;

import java.util.Scanner;

public class App {

    public void run() {
        System.out.println("Menu:");
        System.out.println("1. Host");
        System.out.println("2. Join");
        System.out.println("Or press another key to quit.");
        System.out.print("Input: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        switch (input) {
            case "1":
                Server server = new Server();
                server.run();
                break;
            case "2":
                System.out.print("Hostname: ");
                String hostname = scanner.nextLine();
                Client client = new Client();
                client.run(hostname);
                break;
        }
    }

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }
}
