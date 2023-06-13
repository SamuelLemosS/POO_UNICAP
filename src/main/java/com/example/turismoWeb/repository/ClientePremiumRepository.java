package com.example.turismoWeb.repository;

import com.example.turismoWeb.model.ClienteEntity;
import com.example.turismoWeb.model.ClientePremiumModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClientePremiumRepository extends JpaRepository<ClientePremiumModel, Long> {
    List<ClientePremiumModel> findAll();
    List<ClientePremiumModel> findByNomeIsNotNullOrderByDiasDePremium();
    List<ClientePremiumModel> findByIdIsNullOrNomeIsNullOrEmailIsNullOrAgenciaIsNullOrDiasDePremiumIsNullOrderById();
    Optional<ClientePremiumModel> findById(Long id);
    ClientePremiumModel findByNomeAndEmail(String nome, String email);
    List<ClientePremiumModel> findByAgencia(String agencia);
    List<ClientePremiumModel> findByDiasDePremium(int diasDePremium);
    long count();
    void deleteById(Long id);
    void deleteByNomeAndEmail(String nome, String email);

}