package datasmap.models;

public class Place {
	String address;
	double Latitude;
	double Longitude;
	
	
	public Place(String address,double Latitude,double Longitude) {
		this.address = address;
		this.Latitude = Latitude;
		this.Longitude = Longitude;
		
		
	}
	
	// Retourne l'adresse complète du lieu
	public String getAdresse() {
		
		
		return address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	public void setLatitude(Float latitude) {
		Latitude = latitude;
	}

	public void setLongitude(Float longitude) {
		Longitude = longitude;
	}
	
	
}
