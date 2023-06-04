package com.example.TurismoWeb.repository;

import com.example.TurismoWeb.model.LocalModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocalRepository extends JpaRepository<LocalModel, Long> {
    LocalModel findByDistanciaAndCidade(int distancia,String cidade);
    List<LocalModel> findByEstado(String estado);
    List<LocalModel> findByCidade(String cidade);
    List<LocalModel> findByEstadoIsNotNullOrderByDistancia();
    List<LocalModel> findByCidadeIsNotNullOrderById();
    void deleteByDistanciaAndCidade(int distancia,String cidade);
}