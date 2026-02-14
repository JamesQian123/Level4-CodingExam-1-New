package scheduler;

import javax.swing.JOptionPane;

public class SchedulingConflictException extends Exception{

	
	public static void exisistingEvent() {
		JOptionPane.showMessageDialog(null, "Event exists");
	}
}
