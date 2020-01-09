package sample;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket Ssoc= new ServerSocket(5000);

        ArrayList<Socket> Clients= new ArrayList<>();

        while(true){
            Socket soc = Ssoc.accept();


            Clients.add(soc);
            String s="" ;
            SocketThread st= new SocketThread(soc,Clients);
            st.start();



        }
    }
}
