package mnm_crm;

import java.util.*;

public class Meeting {
	//A meeting should have a time, description, and list of who is attending
	Date whenWeMeet;
	String whyWeMeet;
	List<Person> attendees = new ArrayList<Person>(); 
	
	
	//Constructor for Meeting with the when , why, and who
	Meeting(Date when, String why, Person who){
		setDate(when);
		setWhy(why);
		addAttendees(who);
	}
	
	//getter for date
	Date getDate() {
		return whenWeMeet;
	}
	
	//setter for date
	void setDate(Date when) {
		whenWeMeet = when;
	}
	
	//getter for why
	void setWhy(String why) {
		whyWeMeet = why;
	}
	
	//setter for why
	String getWhy() {
		return whyWeMeet;
	}
	
	//add attendees
	void addAttendees(Person who) {
		attendees.add(who);
	}
	
	//print out the attendees
	void printAttendees() {
		for(int i = 0; i < attendees.size(); i++ ) {
			System.out.println(attendees.get(i).getFirstName() + " " + attendees.get(i).getLastName());
		}
	}
	
	

}
