package com.example.TurismoWeb.repository;

import com.example.TurismoWeb.model.ClientePremiumModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientePremiumRepository extends JpaRepository<ClientePremiumModel, Long> {
    ClientePremiumModel findByNomeAndEmail(String nome, String email);
    List<ClientePremiumModel> findByAgencia(String agencia);
    List<ClientePremiumModel> findByDiasDePremium(int DiasDePremium);
    List<ClientePremiumModel> findByNomeIsNotNullOrderById();
    List<ClientePremiumModel> findByNomeIsNotNullOrderByDiasDePremium();
    void deleteByNomeAndEmail(String nome, String email);

}