package com.example.gestionmagasinstock.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
public class Operateur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOperateur;

    private String nom ;

    private String prenom;

    private String password;

    @OneToMany
    private List<Facture> factures;
}
