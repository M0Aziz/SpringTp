package com.example.gestionmagasinstock.Repository;

import com.example.gestionmagasinstock.Entity.DetailFournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailFournisseurRepository extends JpaRepository<DetailFournisseur,Long> {
}
