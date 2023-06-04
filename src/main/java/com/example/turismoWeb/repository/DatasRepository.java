package com.example.TurismoWeb.repository;

import com.example.TurismoWeb.model.DatasModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DatasRepository extends JpaRepository<DatasModel, Long> {
    DatasModel findByDiaAndMesAndAno(int dia, int mes, int ano);
    List<DatasModel> findByMes(int mes);
    List<DatasModel> findByAno(int ano);
    List<DatasModel> findByDiaIsNotNullOrderById();
    void deleteByDiaAndMesAndAno(int dia, int mes, int ano);
}