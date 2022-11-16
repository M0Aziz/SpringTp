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
public class Facture implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFacture;


    private float montantRemise;

    private float montantFacture;

    private Date dateCreationFacture;

    private Date dateDerniereModification;

    private boolean archivee;

    @OneToMany(mappedBy = "facture")
    private List<Reglement> reglements;

    @OneToMany(mappedBy = "facture")
    private List<DetailFacture> detailFactures ;

    @ManyToOne
    @JsonIgnore
    private Fournisseur fournisseur;


}
