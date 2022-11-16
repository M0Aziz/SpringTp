package com.example.gestionmagasinstock.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Produit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduit;


    private String codeProduit;

    private String libelleProduit;

    private float prix;

    private Date dateCreation;

    private Date dateDerniereModification;

    @OneToMany(mappedBy = "produit")
    private List<DetailFacture> detailFactures ;


    @ManyToOne
    @JsonIgnore
    private CategorieProduit categorieproduit;

    @ManyToOne
    @JsonIgnore
    private Stock stock;
}
