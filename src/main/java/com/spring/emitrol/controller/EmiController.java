package com.spring.emitrol.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.emitrol.entity.Emitec;
import com.spring.emitrol.service.EmiSevice;

@RestController
@RequestMapping("/")
public class EmiController {

	@Autowired
	EmiSevice es;
	
	@PostMapping("/emitec/")
	public Emitec savedata(@RequestBody Emitec et){
		return es.savedata(et);
		
	}
	
	@GetMapping("/emitec/{partNo}")
	public Emitec findpart(@PathVariable Long partNo) {
		return es.findpart(partNo);
		
	}
	
	
	@PutMapping("/emitec/{partNo}")
	public Emitec updatepartdata(@PathVariable Long partNo) {
		return es.updatepartdata(partNo);
		
		
	}
	
	
}
