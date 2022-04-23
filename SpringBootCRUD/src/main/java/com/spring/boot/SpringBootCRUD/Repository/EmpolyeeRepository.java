package com.spring.boot.SpringBootCRUD.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.SpringBootCRUD.Entity.Empolyee;

@Repository
public interface EmpolyeeRepository extends JpaRepository<Empolyee, Long> {
	
}
