package server.program;

import nc.rmi.sample.Hello;
import nc.rmi.sample.HelloImpl;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends HelloImpl {
    public Server(){
        //Constructor
    }
    public static void main(String args[]){
        try{
            HelloImpl obj = new HelloImpl();
            Hello stub = (Hello)UnicastRemoteObject.exportObject(obj,0);
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("Hello",stub);
            System.err.println("Server is ready to work");
        } catch(Exception e){
            System.err.println("Server exception: "+e.toString());
            e.printStackTrace();
        }
    }
    public Server server = new Server();
}
