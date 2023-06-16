package com.example.turismoWeb.repository;

import com.example.turismoWeb.model.LocalModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LocalRepository extends JpaRepository<LocalModel, Long> {
    List<LocalModel> findAll();
    List<LocalModel> findByIdIsNullOrEstadoIsNullOrCidadeIsNullOrDistanciaIsNullOrderById();
    Optional<LocalModel> findById(Long id);
    List<LocalModel> findByEstadoOrderByDistancia(String estado);
    List<LocalModel> findByCidadeOrderByDistancia(String cidade);
    long count();
    void deleteById(Long id);
    void deleteByDistanciaAndCidade(int distancia,String cidade);
}