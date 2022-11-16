package com.example.gestionmagasinstock.Service;

import com.example.gestionmagasinstock.Entity.CategorieProduit;
import com.example.gestionmagasinstock.Repository.CategorieProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieProduitServiceImp implements CategorieProduitService {
    @Autowired
    CategorieProduitRepository categorieProduitRepository;

    @Override
    public List<CategorieProduit> retrieveAllCategorieProduits() {
        return categorieProduitRepository.findAll();
    }

    @Override
    public CategorieProduit addCategorieProduit(CategorieProduit cp) {
        return categorieProduitRepository.save(cp);
    }

    @Override
    public CategorieProduit updateCategorieProduit(CategorieProduit cp) {
        CategorieProduit Cat = categorieProduitRepository.findById(cp.getIdCategorieProduit()).get();
        return categorieProduitRepository.save(Cat);
    }

    @Override
    public CategorieProduit retrieveCategorieProduit(Long id) {
        return categorieProduitRepository.findById(id).get();
    }

    @Override
    public void removeCategorieProduit(Long id) {
categorieProduitRepository.deleteById(id);
    }
}
