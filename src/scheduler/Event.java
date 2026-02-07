package scheduler;

public class Event {
	private String event;
	private Integer time;
	
	Event(String event, Integer time){
		this.event = event;
		this.time = time;
	}
	public String getEvent() {
		
		return event;
	}
	
	public int getTime() {
		return time;
	}
	
	
}
