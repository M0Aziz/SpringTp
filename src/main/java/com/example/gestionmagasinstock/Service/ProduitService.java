package com.example.gestionmagasinstock.Service;

import com.example.gestionmagasinstock.Entity.Produit;

import java.util.List;

public interface ProduitService {

    List<Produit> retrieveAllProduits();

    Produit addProduit (Produit p, Long idCategorieProduit, Long idStock);

    Produit updateProduit (Produit p, Long idCategorieProduit, Long idStock);

    Produit retrieveProduit(Long id);

    void assignProduitToStock(Long idProduit, Long idStock);
}
