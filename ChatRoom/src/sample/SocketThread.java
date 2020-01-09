package sample;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public class SocketThread extends Thread {
        private Socket soc ;
        ArrayList<Socket> Clients;


        public SocketThread(Socket soc ,ArrayList<Socket> Clients){
            this.Clients=Clients;
            this.soc=soc;

        }
        public void run(){
            DataInputStream dis=null;
            try{


                while(true){
                    DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
                    dos.writeUTF("");

                    dis= new DataInputStream(soc.getInputStream());
                    String str;
                    str=dis.readUTF();

                    respond(str,Clients);

                    System.out.println(str);





                }
            } catch(Exception e){
                e.printStackTrace();
            }
        }
        public synchronized void respond( String str,ArrayList<Socket> Clients){
            Iterator i =Clients.iterator();
            while(i.hasNext()){
                Socket s= (Socket)i.next();
                try {
                    DataOutputStream d = new DataOutputStream(s.getOutputStream());
                    d.writeUTF(str);
                }catch (Exception e){e.printStackTrace();}
            }
        }
}
