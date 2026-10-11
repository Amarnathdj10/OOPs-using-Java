import java.io.*;
import java.net.*;

public class SimpleClient {
    public static void main(String[] args) {
        
        try (Socket client = new Socket("127.0.0.1",5000);
            DataOutputStream out = new DataOutputStream(client.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Connected to sever");
            String line;
            while (!(line = br.readLine()).equals("End")){
                out.writeUTF(line);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
