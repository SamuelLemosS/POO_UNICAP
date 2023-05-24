package com.example.TurismoWeb.repository;

import com.example.TurismoWeb.model.DatasModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface DatasRepository extends JpaRepository<DatasModel, Long> {
}