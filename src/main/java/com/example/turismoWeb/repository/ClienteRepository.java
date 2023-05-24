package com.example.TurismoWeb.repository;

import com.example.TurismoWeb.model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ClienteRepository extends JpaRepository<ClienteModel, Long> {
}