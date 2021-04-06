package model;

public class Zone {
	private int maxMovieDVDs = 0;
	static int idNum = 23;
	private String id = "Zone-" + idNum;
	private int movieRecords = 0;
	private int movieDVDs = 0;
	private String[] movieNames = {};
	private String status =  "";
	private MovieRecord[] movieRecordList = {};
	static boolean flag = false;
	
	public Zone(int max) {
		this.maxMovieDVDs = max;
		idNum += 11;
	}
	
	public int getMaxNumDVDs() {
		return this.maxMovieDVDs;
	}
	
	public String getID() {
		return this.id;
	}
	
	public int getNumberOfMovieRecords() {
		return this.movieRecords;
	}
	
	public int getNumberOfMovieDVDs() {
		return this.movieDVDs;
	}
	
	public String getStatus() {
		if ( flag == false) {
			this.status =  movieRecords + " records and " + movieDVDs + " DVDs: {";
		for (int i = 0; i < this.movieNames.length ; i++) {
			this.status += this.movieNames[i];
			if (i <this.movieNames.length -1) {
				this.status += ", ";
			}
		}
		this.status += "}";
		}

		return this.status;
	}
	
	public void addMovieRecord(MovieRecord record) {
		if((this.movieDVDs + record.getNumberOfDVDs()) <= this.maxMovieDVDs) {
			flag = false;
			// check if exists
			boolean small = false;
			int spot = 0;
			for ( int n =0; n < this.movieRecordList.length; n ++) {
				if(this.movieRecordList[n].getName() == record.getName()) {
					small = true;
					spot = n;
				}
			}
			for (int h = 1; h <= this.movieNames.length; h ++) {
				if (h == spot && h < this.movieNames.length) {
					int newer = record.getNumberOfDVDs() + this.movieRecordList[h].getNumberOfDVDs();
					this.movieNames[h] = record.getName() + " (" + newer + ")";
					this.movieDVDs += record.getNumberOfDVDs();
				}
			}
			
			if (small == false) {
			String[] temp = new String[this.movieNames.length + 1];
			for(int i = 0; i < temp.length; i++) {
				if(i < this.movieNames.length) {
					temp[i] = this.movieNames[i];
				}else {
					temp[i] = record.getName() + " (" + record.getNumberOfDVDs() + ")";
					this.movieDVDs += record.getNumberOfDVDs();
				}
				// movie record list
				MovieRecord[] temp2 = new MovieRecord[this.movieRecordList.length + 1];
				for (int m = 0; m < temp2.length; m ++) {
					if (m < this.movieRecordList.length) {
						temp2[m] = this.movieRecordList[m];
					}else {
						temp2[m] = record;
					}
				}
				this.movieRecordList = temp2;
			}
			this.movieNames = temp;
			}
		}else if (this.movieDVDs == this.maxMovieDVDs){
			this.status = "Error: maximum number of movie DVDs (" + this.maxMovieDVDs + ") reached";
			flag = true;
		}else if(this.movieDVDs + record.getNumberOfDVDs() > this.maxMovieDVDs) {
			int diff = (this.movieDVDs + record.getNumberOfDVDs()) -  this.maxMovieDVDs;
			this.status = "Error: insufficient space left in the zone (" + diff +  " DVDs short)";
			flag = true;
	}
		this.movieRecords = movieNames.length;
	}
	
	public MovieRecord[] getMovieRecordList() {
		return this.movieRecordList;
	}
}
