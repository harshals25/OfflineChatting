
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;


public class Client {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ip add to chat:");
        String ipAdd = sc.next();
        Socket socket = new Socket (ipAdd,1750);
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        PrintStream ps = new PrintStream(socket.getOutputStream());
        while(true)
        {
            String data = br.readLine();
            if(data == null)
                break;
            ps.println(data);
        }
        
    }
}
