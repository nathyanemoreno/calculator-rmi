package main;

import java.rmi.Remote;

public interface ICalculator extends Remote {
	public float add(float a, float b) throws java.rmi.RemoteException;

	public float subtract(float a, float b) throws java.rmi.RemoteException;

	public float divide(float a, float b) throws java.rmi.RemoteException;

	public float multiply(float a, float b) throws java.rmi.RemoteException;
}
