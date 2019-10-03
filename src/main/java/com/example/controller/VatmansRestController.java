package com.example.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Vatman;

@RestController
public class VatmansRestController {
	
	@RequestMapping(value="/vatmanAPI", method=RequestMethod.GET)
	public List<Vatman> getVatmans() {
		//VatmansDAO.getAll();
		
		List<Vatman> vatmans = 
				Arrays.asList(new Vatman("Pesho", 20), new Vatman("Ginka", 30), new Vatman("Gosho", 40));
		return vatmans;
	}
	
	@RequestMapping(value="/albums/album-{album_id}/songs/{song_id}", method=RequestMethod.GET)
	public Vatman getVatmans(@PathVariable("album_id") Integer vatmanID,@PathVariable("song_id") Integer ads) {
		//VatmansDAO.getVatmanById(vatmanId);
		
		return new Vatman("Pesho", 20);
	}
	
	
}
