package com.example.gestionmagasinstock.Service;

import com.example.gestionmagasinstock.Entity.CategorieProduit;
import com.example.gestionmagasinstock.Entity.Produit;
import com.example.gestionmagasinstock.Entity.Stock;
import com.example.gestionmagasinstock.Repository.CategorieProduitRepository;
import com.example.gestionmagasinstock.Repository.ProduitRepository;
import com.example.gestionmagasinstock.Repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProduitServiceImp implements ProduitService {

    @Autowired
    private ProduitRepository produitRepository;
    @Autowired
    private StockRepository stockRepository;





    @Override
    public List<Produit> retrieveAllProduits() {
        return produitRepository.findAll();
    }

    @Override
    public Produit addProduit(Produit p, Long idCategorieProduit, Long idStock) {

        return produitRepository.save(p)
        ;
    }

    @Override
    public Produit updateProduit(Produit p, Long idCategorieProduit, Long idStock) {

        Produit prod = produitRepository.findById(p.getIdProduit()).get();
        return produitRepository.save(prod);
    }

    @Override
    public Produit retrieveProduit(Long id) {
        return produitRepository.findById(id).get();
    }

    @Override
    public void assignProduitToStock(Long idProduit, Long idStock) {
        Stock stock = stockRepository.findById(idStock).get();
        Produit prod = produitRepository.findById(idProduit).get();

        prod.setStock(stock);
        produitRepository.save(prod);


    }
}
