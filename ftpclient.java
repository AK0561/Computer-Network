import java.io.*;
import java.net.*;

public class ftpclient {
    public static void main(String[] args) throws IOException {
        String serverAddress = "localhost"; // Change to the server's IP or hostname
        int serverPort = 12345;

        try (Socket socket = new Socket(serverAddress, serverPort)) {
            File fileToSend = new File("hello.txt");
            FileInputStream fileInputStream = new FileInputStream(fileToSend);
            OutputStream outputStream = socket.getOutputStream();

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("File sent to the server: " + fileToSend.getName());

            // Close resources
            fileInputStream.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
