package com.assignment.fyleassignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.assignment.fyleassignment.entity.Banks;

public interface BanksRepository extends JpaRepository<Banks, String> {
	Banks findByName(String name);
}
