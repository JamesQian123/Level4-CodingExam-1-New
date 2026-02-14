package scheduler;

public class Event {
	private String event;
	private Integer time;
	
	Event(String event, Integer time){
		this.event = event;
		this.time = time;
	}
	Event(String event){
		this.event = event;
	}
	public String getEvent() {
		
		return event;
	}
	
	public int getTime() {
		return time;
	}
	@Override
	public String toString() {
		return "Event [event=" + event + ", time=" + time + "]";
	}

	
	
}
