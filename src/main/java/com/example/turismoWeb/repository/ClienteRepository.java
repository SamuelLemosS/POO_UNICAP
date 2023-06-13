package com.example.turismoWeb.repository;

import com.example.turismoWeb.model.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
    List<ClienteEntity> findAll();
    Optional<ClienteEntity> findById(Long id);
    ClienteEntity findByNomeAndEmail(String nome, String email);
    long count();
    List<ClienteEntity> findByIdIsNullOrNomeIsNullOrEmailIsNullOrderById();
    void deleteByNomeAndEmail(String nome, String email);
    void deleteById(Long id);


}