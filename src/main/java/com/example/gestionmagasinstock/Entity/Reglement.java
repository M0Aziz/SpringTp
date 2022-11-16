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
public class Reglement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReglement;


    private float montantPaye;

    private float montantRestant;

    private boolean payee;

    private Date  dateReglement;
    @ManyToOne
    @JsonIgnore
    private Facture facture;
}
