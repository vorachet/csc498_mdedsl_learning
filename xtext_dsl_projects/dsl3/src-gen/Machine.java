import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Machine {
	
	public static void main(String[] args) {
		new Machine().run();
	}
	
	protected void doClearMachineStates() {
		System.out.println("Executing command clearMachineStates");
	}
	protected void doNotifyMachineOn() {
		System.out.println("Executing command notifyMachineOn");
	}
	protected void doNotifyMachineOff() {
		System.out.println("Executing command notifyMachineOff");
	}
	protected void doPrepareResourcesForTask1() {
		System.out.println("Executing command prepareResourcesForTask1");
	}
	protected void doPrepareResourcesForTask2() {
		System.out.println("Executing command prepareResourcesForTask2");
	}
	protected void doPrepareResourcesForTask3() {
		System.out.println("Executing command prepareResourcesForTask3");
	}
	protected void doProcessTask1() {
		System.out.println("Executing command processTask1");
	}
	protected void doProcessTask2() {
		System.out.println("Executing command processTask2");
	}
	protected void doProcessTask3() {
		System.out.println("Executing command processTask3");
	}
	
	protected void run() {
		boolean executeActions = true;
		String currentState = "OFF";
		String lastEvent = null;
		while (true) {
			if (currentState.equals("OFF")) {
				if (executeActions) {
					doNotifyMachineOff();
					doClearMachineStates();
					executeActions = false;
				}
				System.out.println("Your are now in state 'OFF'. Possible events are [on].");
				lastEvent = receiveEvent();
				if ("on".equals(lastEvent)) {
					currentState = "READY";
					executeActions = true;
				}
			}
			if (currentState.equals("READY")) {
				if (executeActions) {
					doNotifyMachineOn();
					doPrepareResourcesForTask1();
					executeActions = false;
				}
				System.out.println("Your are now in state 'READY'. Possible events are [task1, off].");
				lastEvent = receiveEvent();
				if ("task1".equals(lastEvent)) {
					currentState = "TASK1_PERFORMED";
					executeActions = true;
				}
				if ("off".equals(lastEvent)) {
					currentState = "OFF";
					executeActions = true;
				}
			}
			if (currentState.equals("TASK1_PERFORMED")) {
				if (executeActions) {
					doProcessTask1();
					doPrepareResourcesForTask2();
					executeActions = false;
				}
				System.out.println("Your are now in state 'TASK1_PERFORMED'. Possible events are [task2, reset, off].");
				lastEvent = receiveEvent();
				if ("task2".equals(lastEvent)) {
					currentState = "TASK2_PERFORMED";
					executeActions = true;
				}
				if ("reset".equals(lastEvent)) {
					currentState = "READY";
					executeActions = true;
				}
				if ("off".equals(lastEvent)) {
					currentState = "OFF";
					executeActions = true;
				}
			}
			if (currentState.equals("TASK2_PERFORMED")) {
				if (executeActions) {
					doProcessTask2();
					doPrepareResourcesForTask3();
					executeActions = false;
				}
				System.out.println("Your are now in state 'TASK2_PERFORMED'. Possible events are [task3, reset, off].");
				lastEvent = receiveEvent();
				if ("task3".equals(lastEvent)) {
					currentState = "TASK3_PERFORMED";
					executeActions = true;
				}
				if ("reset".equals(lastEvent)) {
					currentState = "READY";
					executeActions = true;
				}
				if ("off".equals(lastEvent)) {
					currentState = "OFF";
					executeActions = true;
				}
			}
			if (currentState.equals("TASK3_PERFORMED")) {
				if (executeActions) {
					doProcessTask3();
					executeActions = false;
				}
				System.out.println("Your are now in state 'TASK3_PERFORMED'. Possible events are [reset, off].");
				lastEvent = receiveEvent();
				if ("reset".equals(lastEvent)) {
					currentState = "READY";
					executeActions = true;
				}
				if ("off".equals(lastEvent)) {
					currentState = "OFF";
					executeActions = true;
				}
			}
			
		}
	}
	
	private String receiveEvent() {
		System.out.flush();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			return br.readLine();
		} catch (IOException ioe) {
			System.out.println("Problem reading input");
			return "";
		}
	}
}
