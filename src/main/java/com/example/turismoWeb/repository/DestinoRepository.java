package com.example.TurismoWeb.repository;

import com.example.TurismoWeb.model.DestinoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface DestinoRepository extends JpaRepository<DestinoModel, Long> {
}