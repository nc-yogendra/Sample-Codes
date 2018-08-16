package client;

import nc.rmi.sample.Hello;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    private Client(){

    }
    public static void main(String args[]){
        try{
            Registry registry = LocateRegistry.getRegistry(null);
            Hello stub = (Hello) registry.lookup("Hello");
            stub.printMessage();
        } catch(Exception e){
            System.out.println("Exception raised in client program: "+ e.toString());
            e.printStackTrace();
        }
    }

}
