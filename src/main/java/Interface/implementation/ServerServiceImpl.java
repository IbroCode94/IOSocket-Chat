package Interface.implementation;

import Interface.ServerService;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


//public class ServerServiceImpl implements ServerService {
//    @Override
//    public void startServer() {
//        try{
//            while(!serverSocket.isClosed()){
//                Socket socket = serverSocket.accept();
//                System.out.println("A new client has connected");
//                ClientHandler clientHandler = new ClientHandler(socket);
//
//                Thread thread = new Thread(clientHandler);
//                thread.start();
//            }
//        }catch(IOException e) {
//
//        }
//    }
//}
