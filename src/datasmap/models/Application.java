package datasmap.models;

import java.util.ArrayList;
import java.util.List;

public class Application {
	
	public static Application instance;
	private List<Place> places;
	
	public Application() {
		super();
		this.places = new ArrayList<Place>();
	}
	
	//Retourne un endroit à partir d'une adresse
	public Place getPlaceByAddress(String address) {	
		for (Place place : instance.places) {
			if (place.getAdress().equals(address)) {
				return place;
			}
		}
		return null;	
	}
	
	//Retourne un endroit à partir de coordonées.
	public Place getPlaceByGPS(double latitude,double longitude) {
		for (Place place : instance.places) {
			if (place.getLatitude() == latitude && place.getLongitude() == longitude) {
				return place;
			}
		}
		return null;	
	}
	
	
	public static Application loadDefaultPlaces() {
			instance =new Application();
			Place place0 =new Place("France", 0.001, -0.0031);
			Place place1 =new Place("Caen", 0.0011, -0.0032, place0);
			Place place2 =new Place("Place Wurzburg", 0.00111, -0.0033, place1);
			Place place3 =new Place("1", 0.0011, -0.0030, place2);

			instance.places.add(place0);
			instance.places.add(place1);
			instance.places.add(place2);
			instance.places.add(place3);
			instance.places.add(new Place("59 Avenue de Tourville", 49.1846, -0.34772799999996096));
			instance.places.add(new Place("9 Rue de Geôle", 49.1845, -0.36199599999997645));
			
			return instance;
		
	}
	
}
