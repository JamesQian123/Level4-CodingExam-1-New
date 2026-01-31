package scheduler;

public enum Days {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	
	LinkedList<Event> eventList = new LinkedList();
	LinkedList<Time> timeList = new LinkedList();
	
		
	public void addEvent(Event event) {
		eventList.add(event);
		
	}
	public void viewEvent() {
		
	}
	
	public static Event getEvent() {
		return null;
		
	}
	public void removeEvent() {
		
	}

}

