package Session10;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Server {

    public static void main(String[] args) {
        ExecutorService pool = Executors.newCachedThreadPool();
        int count = 0;
        try (ServerSocket welcomingSocket = new ServerSocket(5001)) {
            System.out.println("Server started.\nWaiting for a client ... ");
            while (count < 100) {
                Socket connectionSocket = welcomingSocket.accept();
                count++;
                pool.execute(new Handler(connectionSocket, count));
            }
            System.out.print("done.\nClosing server ... ");
            pool.shutdown();
        } catch (IOException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
        System.out.println("done.");
    }
}