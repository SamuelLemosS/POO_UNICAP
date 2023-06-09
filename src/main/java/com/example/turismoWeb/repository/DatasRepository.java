package com.example.turismoWeb.repository;

import com.example.turismoWeb.model.DatasModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DatasRepository extends JpaRepository<DatasModel, Long> {
    List<DatasModel> findAll();
    List<DatasModel> findByDiaIsNullOrderById();
    Optional<DatasModel> findById(Long id);
    List<DatasModel> findByMes(int mes);
    List<DatasModel> findByAno(int ano);
    long count();
    void deleteById(Long id);
    void deleteByDiaAndMesAndAno(int dia, int mes, int ano);
}