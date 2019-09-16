package datasmap.models;

public class Site {
	
	private String name;
	private String description;
	private Place place;
	
	
	public Site(String name, String description, Place place) {
		this.name = name;
		this.description = description;
		this.place = place;
	}
	
	public Site(String name, String description, String address) {
		this(name, description, Application.instance.getPlaceByAddress(address));
	}
	
	public Site(String name, String description, double latitude, double longitude) {
		this(name, description, Application.instance.getPlaceByGPS(latitude, longitude));
	}

	
	
	public String getName() {return name;}

	public void setName(String name) {this.name = name;}

	public String getDescription() {return description;}

	public void setDescription(String description) {this.description = description;}


	

}
