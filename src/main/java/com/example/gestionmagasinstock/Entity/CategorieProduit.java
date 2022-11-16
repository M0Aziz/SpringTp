package com.example.gestionmagasinstock.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
public class CategorieProduit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategorieProduit;


    private String codeProduit;

    private String libelleCategorieProduit;

    @OneToMany(mappedBy = "categorieproduit")
    private List<Produit> produits ;
}
