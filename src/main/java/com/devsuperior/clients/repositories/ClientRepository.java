package com.devsuperior.clients.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.clients.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
