package model;

public class OnlineSchool {
	
	// Attributes
	Participant[] participants = {};
	private int MAX_NUM_PART = 100;
	
	// Constructors
	public OnlineSchool() {
		// do nothing
	}
	
	// Getters
	public Participant[] getParticipants(String title) {
		int counter = 0;
		for(int i =0; i < this.participants.length; i++) {
			for(int j =0; j < this.participants[i].registrations.length; j ++) {
				if(this.participants[i].registrations[j].getTitle()== title) {
					counter += 1;
					break;
				}
			}
		}
		Participant[] temp = new Participant[counter];
		int counter2 = 0;
		for(int i =0; i < this.participants.length; i++) {
			for(int j =0; j < this.participants[i].registrations.length; j ++) {
				if(this.participants[i].registrations[j].getTitle()== title) {
					temp[counter2] = this.participants[i];
					counter2 += 1;
					break;
				}
			}
		}
		return temp;
	}
	
	// Setters
	public void addParticipant(Participant part) {
		int newLength = this.participants.length + 1;
		if(newLength <= this.MAX_NUM_PART) {
			Participant[] temp = new Participant[newLength];
			for(int i = 0; i < temp.length; i++) {
				if( i< this.participants.length) {
					temp[i] = this.participants[i];
				}else {
					temp[i] = part;
				}
			}
			this.participants = temp;
		}
	}
}
