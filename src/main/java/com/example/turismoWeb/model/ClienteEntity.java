package com.example.turismoWeb.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ClienteEntity extends ClienteModel {
    private int diasSemPremium;
}
