package nc.rmi.sample;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote {
    void printMessage()throws RemoteException;
}
