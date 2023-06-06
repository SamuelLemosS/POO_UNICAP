package com.example.TurismoWeb.repository;

import com.example.TurismoWeb.model.DestinoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DestinoRepository extends JpaRepository<DestinoModel, Long> {
    DestinoModel findByNomeAndValor(String nome, float valor);
    List<DestinoModel> findByNome(String nome);
    List<DestinoModel> findByValor(float valor);
//    List<DestinoModel> findByDiaIsNotNullOrderByValor();
//    List<DestinoModel> findByDiaIsNotNullOrderById();
    void deleteByNomeAndValor(String nome, float valor);
}