
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(1750);
        System.out.println("server is ready ");
        Socket socket = ss.accept();
        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        BufferedReader br= new BufferedReader(isr);
        while(true)
        {
            String data = br.readLine();
            if(data.length()==0)
                break;
            System.out.println(data);
        }
    }
   
}
