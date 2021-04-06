package model;

public class MovieRecord {
	private String name = "";
	private int numDVD = 0;
	private Zone zone;
	private String id = "";
	static int numMovies = 1;
	
	public MovieRecord(String name, int numDVD, Zone zone) {
		this.name = name;
		this.numDVD = numDVD;
		this.zone = zone;
		this.id = zone.getID() + "-"  + name + "-"  +numMovies;
		numMovies += 1;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getNumberOfDVDs() {
		return this.numDVD;
	}
	
	public Zone getZone() {
		return this.zone;
	}
	
	public String getID() {
		return this.id;
	}
}
