package com.example.TurismoWeb.repository;


import com.example.TurismoWeb.model.TelefoneModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TelefoneRepository extends JpaRepository<TelefoneModel, Long> {
    TelefoneModel findByDddAndNumero(int ddd, int numero);
    List<TelefoneModel> findByDdd(int ddd);
    List<TelefoneModel> findByDddIsNotNullOrdederById();
    void deleteByDddAndNumero(int ddd, int numero);
}