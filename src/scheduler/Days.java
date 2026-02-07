package scheduler;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public enum Days {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

	TreeMap<Integer, Event> map = new TreeMap();
	public void addEvent(Event event, int time) {
		map.put(time, event);
	}
	public void viewEvent() {
		
	}
	
	public Event getEvent() {
		Event event;
		for(int time: map.keySet()) {
			event = map.get(time);
		}
		return event;
	}
	public void removeEvent(Event event, int time) {
		map.rem
	}
	@SuppressWarnings("unlikely-arg-type")
	public int getTime(Event event) {
		for(int i =0; i < planner.size(); i++) {
			if(planner.get(i).equals(event.getEvent())) {
				return planner.get(event);
			}
		}
		return 0;
	}

}

