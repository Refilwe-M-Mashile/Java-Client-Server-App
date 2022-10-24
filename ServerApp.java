
//import java.io.BufferedReader;
import java.io.BufferedWriter;
//import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import services.Calculator;

public class ServerApp {
    static int num1, num2;

    public static String sendRandomNumbers(int num1, int num2) {
        return "Your Numbers Are:\nNum1: " + num1 + "\n" + "Num2: " + num2;
    }

    public static void main(String[] args) {
        ServerSocket ss;
        Socket socket;
        num1 = Calculator.generateRandomNumber();
        num2 = Calculator.generateRandomNumber();

        try {
            System.out.println("Waiting for incoming connections!!!");
            ss = new ServerSocket(3400);
            // Let connection begin
            socket = ss.accept();
            System.out.println("Connection established!" + socket);

            // Send App Instructions
            OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw);

            String serverInstructions = sendRandomNumbers(num1, num2);

            pw.write(serverInstructions);
            pw.flush();
            pw.close();
            socket.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
