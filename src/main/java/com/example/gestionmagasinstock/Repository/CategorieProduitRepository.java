package com.example.gestionmagasinstock.Repository;

import com.example.gestionmagasinstock.Entity.CategorieFournisseur;
import com.example.gestionmagasinstock.Entity.CategorieProduit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieProduitRepository extends JpaRepository<CategorieProduit,Long> {
}
