package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

@Controller
@SpringBootApplication
public class Spring2Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Spring2Application.class, args);
	}

	
	String doctors[]  = {
			
			"William Hartnell",
			"Patrick Troughton",
			"Jon Pertwee",
			"Tom Baker",
			"Peter Davison",
			"Colin Baker",
			"Sylvester McCoy",
			"Paul McGann",
			"Christopher Eccleston",
			"David Tennant",
			"Matt Smith",
			"Peter Capaldi",
			"Jodie Whittaker"};
	
    
		 	
			    @RequestMapping("/doctor/{id}")
			    @ResponseBody
			    public String docteurs(@PathVariable  int id) {
			        
			        
			        if ( id < 0 || id > doctors.length ) 
			        	throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Impossible de récupérer l'incarnation " + id);
			             
			        
			        if(id <= 8) 
			        	throw new ResponseStatusException(HttpStatus.SEE_OTHER, "page introuvable");

			        return "Name : "  + doctors[id] + ", Number : "  + id ;         
			        }
			 	
	}

