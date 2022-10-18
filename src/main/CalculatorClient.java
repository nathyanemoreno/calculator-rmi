package main;

import java.rmi.NotBoundException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorClient {
    public static void main(String[] args) {

        try {
            // Get registry
            Registry registry = LocateRegistry.getRegistry(3000);

            // Look up the registry for the remote stub
            ICalculator stub = (ICalculator) registry.lookup("CalculatorService");

            // Call the remote method using returned stub
            System.out.println("\nRemote method invocation");
            System.out.println("Addition result: " + stub.add(30, 20));
            System.out.println("Subtraction result: " + stub.subtract(30, 20));
            System.out.println("Multiplication result: " + stub.multiply(30, 20));
            System.out.println("Division result: " + stub.divide(30, 20));
        }
        catch(NotBoundException e){
            System.err.println("Attempt to look up a service name that is not bound: " + e.toString());
        }

        // If any other error occur
        catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
