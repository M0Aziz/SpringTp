package com.example.gestionmagasinstock.Service;

import com.example.gestionmagasinstock.Entity.CategorieProduit;

import java.util.List;

public interface CategorieProduitService {

    List<CategorieProduit> retrieveAllCategorieProduits();

    CategorieProduit addCategorieProduit(CategorieProduit cp);

    CategorieProduit updateCategorieProduit(CategorieProduit cp);

    CategorieProduit retrieveCategorieProduit(Long id);

    void removeCategorieProduit(Long id);
}
