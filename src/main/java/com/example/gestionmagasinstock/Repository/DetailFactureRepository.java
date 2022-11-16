package com.example.gestionmagasinstock.Repository;

import com.example.gestionmagasinstock.Entity.DetailFacture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailFactureRepository extends JpaRepository<DetailFacture,Long> {
}
