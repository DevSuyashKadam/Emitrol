package com.spring.emitrol.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.emitrol.entity.Emitec;
import com.spring.emitrol.repo.EmiRepo;
@Service
public class EmiSevice {

	@Autowired
	EmiRepo er;
	
	
	
	public Emitec savedata(Emitec et) {
		// TODO Auto-generated method stub
		return er.save(et);
	}

	

//	public Emitec updatepartdata(Emitec et ) {
//		return er.save(et);
//	}



	public Emitec findpart(Long partNo) {
		// TODO Auto-generated method stub
		return er.findBypartNo(partNo);
	}



	public Emitec updatepartdata(Long partNo) {
		// TODO Auto-generated method stub
		return er.save(partNo);
	}
	
}
