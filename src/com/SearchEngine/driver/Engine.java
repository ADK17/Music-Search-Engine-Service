package com.SearchEngine.driver;

import java.util.ArrayList;

import com.SearchEngine.constants.Constants;


public class Engine {
	
	private static Engine searchEngine = new Engine();
	
	public static Engine getInstance()
	{
		return searchEngine;
	}
	
	public ArrayList<String> getSearchResults(String input){
		
		Constants constants = Constants.getInstance();
		ArrayList<String> urls = new ArrayList<>();
		ArrayList<String> searchSites = constants.getSearchSites();
		
		input = input.replaceAll(" ", "%20");
		String searchString;
		for(String site : searchSites){
			searchString = site+input;
			urls.add(searchString);
		}
		return urls;
	}
	
}
