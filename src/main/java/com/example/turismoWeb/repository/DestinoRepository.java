package com.example.turismoWeb.repository;

import com.example.turismoWeb.model.DestinoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DestinoRepository extends JpaRepository<DestinoModel, Long> {
    List<DestinoModel> findAll();
    Optional<DestinoModel> findById(Long id);
    void deleteById(Long id);
    DestinoModel findByNomeAndValor(String nome, float valor);
    List<DestinoModel> findByNome(String nome);
    List<DestinoModel> findByValor(float valor);
//    List<DestinoModel> findByDiaIsNotNullOrderByValor();
//    List<DestinoModel> findByDiaIsNotNullOrderById();
    void deleteByNomeAndValor(String nome, float valor);
}