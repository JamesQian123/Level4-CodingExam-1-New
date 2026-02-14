package scheduler;

import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * Objective: Create a weekly scheduling application.
 * 
 * You may create any additional enums, classes, methods or variables needed
 * to accomplish the requirements below:
 * 
 * - You should use an array filled with enums for the days of the week and each
 *   enum should contain a LinkedList of events that includes a time and what is 
 *   happening at the event.
 * 
 * - The user should be able to to interact with your application through the
 *   console and have the option to add events, view events or remove events by
 *   day.
 *   
 * - Each day's events should be sorted by chronological order.
 *  
 * - If the user tries to add an event on the same day and time as another event
 *   throw a SchedulingConflictException(created by you) that tells the user
 *   they tried to double book a time slot.
 *   
 * - Make sure any enums or classes you create have properly encapsulated member
 *   variables.
 */
public class Scheduler {

    public static void main(String[] args) {
//    	JFrame frame = new JFrame();
//    	JPanel panel = new JPanel();
    	Days[] daysOfWeekArr = Days.values();
    	
    	Scanner scan = new Scanner(System.in);
//    	for(int i = 0; i < 7; i++) {
//    		JButton button = new JButton(daysOfWeekArr[i].toString());
//    		
//    		panel.add(button);
//    	}
//    	
//    	frame.setVisible(true);
//    	System.out.println("Do you want to add, view, or remove events?");
//    	String choice = scan.nextLine();
//    	System.out.println("What day?");
//    	String dayChoice = scan.nextLine();
    	boolean notDone = true;
	    while(notDone) {
	    	String dayChoice = JOptionPane.showInputDialog("What day do you want to edit or leave?");
	    	if(dayChoice.equals("leave")) {
	    		break;
	    	}
	    	String choice = JOptionPane.showInputDialog("What do you want to do? (add, view, or remove)");
	    	Event event = null;
	    	
	    	for(int i =0; i < daysOfWeekArr.length; i++) {
	    		if(dayChoice.equals(daysOfWeekArr[i].toString())) {
	    			if(choice.equals("add")) {
	    				String whatAdd = JOptionPane.showInputDialog("What event do you want to add?");
	    				String whatTime = JOptionPane.showInputDialog("What time?");
	    				int time = Integer.parseInt(whatTime);
	    				event = new Event(whatAdd,time);
	    				try {
							daysOfWeekArr[i].addEvent(event, time);
						} catch (SchedulingConflictException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	    			}
	    			else if(choice.equals("view")) {  
	    				
	    				daysOfWeekArr[i].viewEvent();
	    			}
	    			else if(choice.equals("remove")){
	    				String deleteWhat = JOptionPane.showInputDialog("What event did you want to delete");
	    				String whatTime = JOptionPane.showInputDialog("What time");
	    				int time = Integer.parseInt(whatTime);
	    				daysOfWeekArr[i].removeEvent(time);
	    			}
	    		}
	    		
	    	}
	    	
	
	    }
	    }
}
