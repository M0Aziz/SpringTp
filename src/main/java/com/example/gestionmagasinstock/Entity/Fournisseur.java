package com.example.gestionmagasinstock.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
public class Fournisseur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFournisseur;


    private String codeFournisseur;

    private String libelleFournisseur;


   @Enumerated(EnumType.STRING)
   private CategorieFournisseur categorieFournisseur;


    @OneToMany(mappedBy = "fournisseur")
    private List<Facture> factures;


    @ManyToMany
    @JoinTable(name = "fournisseur_secteur",joinColumns = @JoinColumn(name="idFournisseur" ),
            inverseJoinColumns = @JoinColumn(name="idSecteurActivite"))
    private List<SecteurActivite> secteurActivites;


    @OneToOne
    @JsonIgnore
    private DetailFacture detailFacture;
}
