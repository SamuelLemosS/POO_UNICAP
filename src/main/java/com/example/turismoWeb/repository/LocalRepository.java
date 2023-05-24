package com.example.TurismoWeb.repository;

import com.example.TurismoWeb.model.LocalModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface LocalRepository extends JpaRepository<LocalModel, Long> {
}