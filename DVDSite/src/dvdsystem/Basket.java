package dvdsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.LinkedHashSet;



public class Basket {

	List<DVD> dvdList = new ArrayList<DVD>();
	
	
	public void addDvd(DVD theDvd) {
		dvdList.add(theDvd);
	}
	
	public void basketContents() {
		for (DVD dvd:dvdList) {
			System.out.println(dvd.getTitle()+ "   ---   £" + dvd.getPrice());
			
		}
		
		
	}
	
	public void basketRemove(String dvdTitle) {
		dvdList.removeIf(title -> title.getTitle().equals(dvdTitle));
		
		
	}
	
	
	public void basketClear() {
		dvdList.clear();
		
	}
	
	/*
	public boolean uniqueCheck() {
		Set<DVD> dvdSet = new LinkedHashSet<DVD>();
		for (DVD dvd:dvdList) {
			dvdSet.add(dvd);
		}
		
		if (dvdSet.size() == dvdList.size()) {
			return true;
		
		} else {
			return false;
		}
		
	}
	*/
	
	public boolean uniqueCheck2() {
		List<String> titleList = new ArrayList<String>();
		
		for (DVD dvd:dvdList) {
			if (titleList.contains(dvd.getTitle())) {
				return false;
			} else {
				titleList.add(dvd.getTitle());
			}
		}
		
		return true;
	}
	
	
	
	
	
	
}
