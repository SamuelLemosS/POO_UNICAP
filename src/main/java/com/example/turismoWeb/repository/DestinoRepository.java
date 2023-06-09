package com.example.turismoWeb.repository;

import com.example.turismoWeb.model.DestinoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DestinoRepository extends JpaRepository<DestinoModel, Long> {
    List<DestinoModel> findAll();
    List<DestinoModel> findByNomeIsNullOrderByValor();
    Optional<DestinoModel> findById(Long id);
    List<DestinoModel> findByNome(String nome);
    List<DestinoModel> findByValor(float valor);
    DestinoModel findByNomeAndValor(String nome, float valor);
    long count();
    void deleteById(Long id);
    void deleteByNomeAndValor(String nome, float valor);
}