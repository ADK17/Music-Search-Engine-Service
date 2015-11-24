package com.SearchEngine.constants;

import java.util.ArrayList;

public class Constants {

	private static ArrayList<String> searchSites = new ArrayList<>();
	
	public static ArrayList<String> getSearchSites() {
		return searchSites;
	}

	private static Constants constants = new Constants();
	
	private Constants(){
		searchSites.add("http://gaana.com/search/songs/");
		searchSites.add("http://www.saavn.com/s/");
	}
	
	public static Constants getInstance(){
		return constants;
	}
}
