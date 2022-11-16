package com.example.gestionmagasinstock.Repository;

import com.example.gestionmagasinstock.Entity.Operateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperateurRepository extends JpaRepository<Operateur,Long> {
}
