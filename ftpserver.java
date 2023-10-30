import java.io.*;
import java.net.*;

public class ftpserver {
    public static void main(String[] args) throws IOException {
        int port = 12345;
        try (ServerSocket Socket1 = new ServerSocket(port)) {
            System.out.println("Server listening on port " + port);

            while (true) {
                Socket clientSocket = Socket1.accept();
                System.out.println("Accepted connection from " + clientSocket.getInetAddress());

                // Create a new thread to handle the client's request
                Thread clientHandler = new Thread(new ClientHandler(clientSocket));
                clientHandler.start();
            }
        }
    }
}

class ClientHandler implements Runnable {
    private Socket clientSocket;

    public ClientHandler(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        try {
            // Input stream to read the file sent by the client
            InputStream inputStream = clientSocket.getInputStream();

            // Specify the directory where you want to save the uploaded file
            String saveDir = "server-directory/";
            File savePath = new File(saveDir);
            savePath.mkdirs();

            // Specify the file name for the uploaded file
            String fileName = "hello_uploaded.txt";
            FileOutputStream fileOutputStream = new FileOutputStream(saveDir + fileName);

            // Read and write the file data
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, bytesRead);
            }
            System.out.println("File received and saved as " + saveDir + fileName);

            // Close resources
            fileOutputStream.close();
            inputStream.close();
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
