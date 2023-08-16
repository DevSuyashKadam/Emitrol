package com.spring.emitrol.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.emitrol.entity.Emitec;
@Repository
public interface EmiRepo extends JpaRepository<Emitec, Long>{

	Emitec save(Long partNo);

	Emitec findBypartNo(Long partNo);


	
	
	
}
