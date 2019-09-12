package datasmap.models;


import java.time.LocalDate;


public class Event {
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	String name;
	String description;
	LocalDate date;
	
	public Event(String name,String description,LocalDate date) {
		
		this.name=name;
		this.description=description;
		this.date=date;
		
	}
}
