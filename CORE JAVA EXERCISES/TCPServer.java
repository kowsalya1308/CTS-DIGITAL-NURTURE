import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws Exception {
        try (ServerSocket server = new ServerSocket(5000)) {
            System.out.println("Server listening on 5000...");
            Socket client = server.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println("Client: " + line);
                out.println("Echo: " + line);
            }
        }
    }
}
