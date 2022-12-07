import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;

public interface BalancerInterface extends Remote {
    public ArrayList<String> SendRequest(String script, String IDFile) throws RemoteException;
    public HashMap<String, String> getProcessStates() throws RemoteException;
    public void addProcessor(String processor, String queue) throws RemoteException;
    public void removeProcessor(String processor) throws RemoteException;
}
