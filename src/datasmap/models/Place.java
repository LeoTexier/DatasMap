package datasmap.models;

import java.util.ArrayList;
import java.util.List;

public class Place {
	private String address;
	private double latitude;
	private double longitude;
	private Place parent;
	private List<Site> sites;
	
	
	
	
	public Place(String address,double latitude,double longitude) {
		this(address,latitude,longitude,null);
	
	}
	
	public Place(String address,double latitude,double longitude, Place parent) {
		this.address = address;
		this.latitude = latitude;
		this.longitude = longitude;
		this.parent=parent;
		sites=new ArrayList<>();
	}
	
	
	
	
	
	public double getLatitude() {return latitude;}

	public void setLatitude(double latitude) {this.latitude = latitude;}

	public double getLongitude() {return longitude;}
	
	public void setLongitude(double longitude) {this.longitude = longitude;}

	public Place getParent() {return parent;}

	public void setParent(Place parent) {this.parent = parent;}

	public List<Site> getSites() {return sites;}

	public void setSites(List<Site> sites) {this.sites = sites;}


	
	/* Getter et Setter d'Address*/
	// Retourne l'adresse complète du lieu
	public String getAdress() {
		
		String result= address;
		if(parent!=null) {
			result+=","+parent.getAdress();
		}	
		return result;
	}
	public String getAdress(int niveau) {return null;}
	public void setAddress(String address) {this.address = address;}
}


