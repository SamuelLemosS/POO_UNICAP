package com.example.TurismoWeb.repository;

import com.example.TurismoWeb.model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteModel, Long> {
    ClienteModel findByNomeAndEmail(String nome, String email);
    long countByNome(String nome);
    List<ClienteModel> findByNomeIsNotNullOrdederById();
    List<ClienteModel> findByNomeOrEmailIsNullOrdederById();
    void deleteByNomeAndEmail(String nome, String email);
}