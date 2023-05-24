package com.example.TurismoWeb.repository;

import com.example.TurismoWeb.model.TelefoneModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TelefoneRepository extends JpaRepository<TelefoneModel, Long> {
}