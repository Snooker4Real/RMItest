package fr.snooker4real.test.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Information extends Remote {

    public String getInformation() throws RemoteException;
}
