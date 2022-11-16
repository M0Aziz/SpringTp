package com.example.gestionmagasinstock.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
public class DetailFacture implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailFacture;


    private Integer  qteCommandee;

    private float prixTotalDetail;

    private Integer pourcentageRemise;

    private float montantRemise;

    @ManyToOne
    @JsonIgnore
    private Facture facture;


    @ManyToOne
    @JsonIgnore
    private Produit produit;
}
