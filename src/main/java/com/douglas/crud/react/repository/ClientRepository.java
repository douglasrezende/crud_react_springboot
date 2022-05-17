package com.douglas.crud.react.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglas.crud.react.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
	
}
