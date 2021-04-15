package dvdsystem;

public class DVD {

	private String title;
	private String genre;
	private String year;
	private String director;
	private double price;
	
	
	public DVD(String theTitle, String theGenre, String theYear, String theDirector, double thePrice) {
		
		setTitle(theTitle);
		setGenre(theGenre);
		setYear(theYear);
		setDirector(theDirector);
		setPrice(thePrice);	
		
		
		
	}
	
	
	
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	} 
	
	
	
	
	
}
