package com.tenjava.entries.messageofdeath.t3.Utils.RandomEventsManager;

import java.util.ArrayList;

public class RandomEventManager {

	private ArrayList<RandomEvent> events;
	
	public RandomEventManager() {
		this.events = new ArrayList<RandomEvent>();
	}
	
	public void addEvent(RandomEvent event) {
		if(!this.hasEvent(event.getId())) {
			this.events.add(event);
		}
	}
	
	public void removeEvent(RandomEvent event) {
		if(this.hasEvent(event.getId())) {
			this.removeEvent(event.getId());
		}
	}
	
	public void removeEvent(int id) {
		if(this.hasEvent(id)) {
			this.removeEvent(this.getEvent(id));
		}
	}
	
	public boolean hasEvent(int id) {
		return this.getEvent(id) != null;
	}
	
	public RandomEvent getEvent(int id) {
		for(RandomEvent event : this.events) {
			if(event.getId() == id) {
				return event;
			}
		}
		return null;
	}
	
	public ArrayList<RandomEvent> getEvents() {
		ArrayList<RandomEvent> events = new ArrayList<RandomEvent>();
		events.addAll(this.events);
		return events;
	}
}
