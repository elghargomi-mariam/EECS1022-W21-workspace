package model;

public class Store {
	private int maxZones = 100;
	private Zone[] zones = {};
	private int[] stats = new int[2];
	
	public void addZones(Zone[] inputs) {
		if( inputs.length + zones.length <= 100) {
			int count = 0;
			Zone[] temp = new Zone[zones.length + inputs.length];
			for(int i = 0; i < temp.length; i++) {
				if(i < zones.length) {
					temp[i] = zones[i];
				}else {
					temp[i] = inputs[count];
					count += 1;
				}
			}
			zones = temp;
		}
	}
	
	public Zone[] getZones() {
		return this.zones;
	}
	
	public Zone[] getZones(int remaining) {
		int counter = 0;
		for(int i= 0; i < this.zones.length; i ++) {
			if ((this.zones[i].getMaxNumDVDs() - this.zones[i].getNumberOfMovieDVDs()) == remaining) {
				counter += 1;
			}
		}
		Zone[] temp = new Zone[counter];
		int counter2 = 0;
		for (int j = 0; j < this.zones.length; j ++) {
			if ((this.zones[j].getMaxNumDVDs() - this.zones[j].getNumberOfMovieDVDs()) == remaining) {
				temp[counter2] = this.zones[j];
				counter2 += 1;
			}
		}
		return temp;
	}
	
	public int[] getStats(String name) {
		int totalDVDs = 0;
		int totalRecords = 0;
		for (int i = 0; i < this.zones.length; i++) {
			for( int j = 0; j <this.zones[i].getMovieRecordList().length; j ++) {
				if(this.zones[i].getMovieRecordList()[j].getName() == name) {
					totalDVDs += this.zones[i].getMovieRecordList()[j].getNumberOfDVDs();
					totalRecords += 1;
				}
			}
		}
		this.stats[0] = totalRecords;
		this.stats[1] = totalDVDs;
		return this.stats;
	}
	
}
