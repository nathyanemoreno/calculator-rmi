package main;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;


public class CalculatorServer {

	// Implement the constructor of the class
	public CalculatorServer() {
		try {
			// Create a object reference for the interface
			CalculatorImpl obj = new CalculatorImpl();

			// Bind the remote object (stub) in the registry
			Registry registry = LocateRegistry.createRegistry(3000);
			// Export the object of implementation class
			// (exportation of remote object to the stub)
			ICalculator stub = (ICalculator) UnicastRemoteObject.exportObject(obj, 3000);

			// Bind the localhost with the service
			registry.rebind("CalculatorService", stub);
			System.out.println("Calculator Server is ready.");
		} catch (Exception e) {
			// Case any error
			System.out.println("ERROR: " + e);
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// Create an object
		new CalculatorServer();
	}
}
