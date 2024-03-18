package com.movieapp.service;

import java.util.Arrays;
import java.util.List;

public class MovieDetails {

	    public List<String> showMovies(String language){
	    	List<String> movies=null;
	    	if(language.equals("hindi")) {	
	    		movies=Arrays.asList("sanam tere kasam","entertainment","sulthan");
	    	}
	    	if(language.equals("kannada")) {
	    		movies=Arrays.asList("bana dariyalli","sse","777 charlie","manikya");
		
	    	}
	    	if(language.equals("korean")) {
	    		movies=Arrays.asList("the daemon","legend of the blue sea","the honesty","put your head on my shoulder");
		
	    	}
			return movies;
	    }
	

}
