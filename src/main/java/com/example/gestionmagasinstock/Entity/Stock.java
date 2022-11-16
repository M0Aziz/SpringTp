package com.example.gestionmagasinstock.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
public class Stock implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStock;


    private Integer qte;

    private Integer qteMin;

    private String libelleStock;

    @OneToMany(mappedBy = "stock")
    private List<Produit> produits ;


}
