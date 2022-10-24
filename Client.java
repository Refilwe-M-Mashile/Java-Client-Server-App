import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        InetAddress objInetAddress;
        Socket socket;
        Scanner sc = new Scanner(System.in);

        try {
            objInetAddress = InetAddress.getByName("127.0.0.1");
            socket = new Socket(objInetAddress, 3400);
            System.out.println("Connected to " + socket);

            InputStreamReader isr = new InputStreamReader(socket.getInputStream());
            BufferedReader br = new BufferedReader(isr);
            String line = new String();
            String instructions = "";
            while ((line = br.readLine()) != null) {
                instructions += line + "\n";
            }

            System.out.println(instructions);
            /*
             * // Define the message to send to the server
             * System.out.println("Please enter 2 values: ");
             * int num1 = sc.nextInt();
             * int num2 = sc.nextInt();
             * // Send the message
             * OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
             * BufferedWriter bw = new BufferedWriter(osw);
             * PrintWriter pw = new PrintWriter(bw);
             */

            // Start writing
            /*
             * pw.write(num1);
             * pw.write(num2);
             */
            socket.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void getAPI() {
        System.out.println("****************\nChoose The Following Operators:\n");
    }

    public void postAPI() {

    }
}