package com.example.gestionmagasinstock.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
public class DetailFournisseur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailFournisseur;


    private Date dateDebutCollaboration;

    private String adresse;

    private String matricule;

@OneToOne (mappedBy = "detailFacture")
    private Fournisseur fournisseur;
}
