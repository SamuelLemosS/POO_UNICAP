package com.example.TurismoWeb.repository;

import com.example.TurismoWeb.model.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
    ClienteEntity findAll();
    ClienteEntity findById(Long id);
    ClienteEntity findByNomeAndEmail(String nome, String email);
    long countByNome(String nome);
    List<ClienteEntity> findByNomeIsNotNullOrderById();
    List<ClienteEntity> findByNomeOrEmailIsNullOrderById(String nome);
    void deleteByNomeAndEmail(String nome, String email);
}