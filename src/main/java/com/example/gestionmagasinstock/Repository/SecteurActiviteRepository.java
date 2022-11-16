package com.example.gestionmagasinstock.Repository;

import com.example.gestionmagasinstock.Entity.SecteurActivite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecteurActiviteRepository extends JpaRepository<SecteurActivite,Long> {
}
