package com.example.colaboraCityApi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cidadao")
@Getter
@Setter
public class Citizen extends User{


    private String cpf;
    private String phone;
    private String email;

    
}
