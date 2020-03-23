package rmi;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {

	public static void main(String args[]) throws RemoteException, AlreadyBoundException {
		Registry registry = LocateRegistry.createRegistry(5090);
		System.out.println(" le produit est :");
		registry.rebind("mat", (Remote) new ApplicationServer());
	}
}
