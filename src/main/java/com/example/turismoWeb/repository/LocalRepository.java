package com.example.turismoWeb.repository;

import com.example.turismoWeb.model.LocalModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LocalRepository extends JpaRepository<LocalModel, Long> {
    List<LocalModel> findAll();
    Optional<LocalModel> findById(Long id);
    void deleteById(Long id);
    LocalModel findByDistanciaAndCidade(int distancia,String cidade);
    List<LocalModel> findByEstado(String estado);
    List<LocalModel> findByCidade(String cidade);
    List<LocalModel> findByEstadoIsNotNullOrderByDistancia();
    List<LocalModel> findByCidadeIsNotNullOrderById();
    void deleteByDistanciaAndCidade(int distancia,String cidade);
}