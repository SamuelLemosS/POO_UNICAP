package com.example.TurismoWeb.repository;

import com.example.TurismoWeb.model.ClientePremiumModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ClientePremiumRepository extends JpaRepository<ClientePremiumModel, Long> {
}