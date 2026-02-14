package scheduler;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public enum Days {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

	TreeMap<Integer, Event> map = new TreeMap<Integer, Event>();
	public void addEvent(Event event, int time) throws SchedulingConflictException{
		
		if(map.containsKey(time)) {
			throw new SchedulingConflictException();
		}
		map.put(time, event);
	}
	public void viewEvent() {
		for(int i: map.keySet()) {
			System.out.println(map.get(i));
		}
	}
	
	public Event getEvent() {
		Event event = null;
		for(int time: map.keySet()) {
			event = map.get(time);
		}
		return event;
	}
	public void removeEvent(int time) {
		map.remove(time);
	}
	
	}
//	@SuppressWarnings("unlikely-arg-type")
//	public int getTime(Event event) {
//		for(int i =0; i < planner.size(); i++) {
//			if(planner.get(i).equals(event.getEvent())) {
//				return planner.get(event);
//			}
//		}
//		return 0;
//	}



