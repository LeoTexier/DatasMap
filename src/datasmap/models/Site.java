package datasmap.models;

public class Site {
	String name;
	String description;

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

	public Site(String name,String description, String address) {
		
		this.name=name;
		this.description=description;
		
	}
	

}
