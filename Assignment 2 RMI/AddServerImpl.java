import java.rmi.*; 
import java.rmi.server.*; 
public class AddServerImpl extends UnicastRemoteObject 
implements AddServerIntf { 
public AddServerImpl() throws RemoteException { 
super();} 
public int add(int d1, int d2) throws RemoteException { 
return d1 + d2; 
} 
} 
