package com.example.turismoWeb.repository;


import com.example.turismoWeb.model.TelefoneModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TelefoneRepository extends JpaRepository<TelefoneModel, Long> {
    List<TelefoneModel> findAll();
    List<TelefoneModel> findByIdIsNullOrDddNullOrNumeroIsNullOrderById();
    Optional<TelefoneModel> findById(Long id);
    List<TelefoneModel> findByDdd(int ddd);
    long count();
    void deleteById(Long id);
    void deleteByDddAndNumero(int ddd, int numero);
}