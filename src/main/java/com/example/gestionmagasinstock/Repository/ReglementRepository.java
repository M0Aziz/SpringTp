package com.example.gestionmagasinstock.Repository;

import com.example.gestionmagasinstock.Entity.Reglement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReglementRepository extends JpaRepository<Reglement,Long> {
}
