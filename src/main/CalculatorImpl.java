package main;

public class CalculatorImpl implements ICalculator {

	public CalculatorImpl() throws java.rmi.RemoteException {
		super();
	}

	public float add(float a, float b) {
		return a + b;
	}

	public float subtract(float a, float b) throws java.rmi.RemoteException {
		return a - b;
	}

	public float divide(float a, float b) throws java.rmi.RemoteException {
		return a / b;
	}

	public float multiply(float a, float b) throws java.rmi.RemoteException {
		return a * b;
	}
}
