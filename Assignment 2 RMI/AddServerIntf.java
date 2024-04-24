import java.rmi.*; 
public interface AddServerIntf extends Remote { 
public int add(int d1, int d2) throws RemoteException; 
} 
