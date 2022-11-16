package com.example.gestionmagasinstock.Controller;

import com.example.gestionmagasinstock.Entity.Produit;
import com.example.gestionmagasinstock.Service.ProduitService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class ProduitController {

    private final ProduitService produitService;

@GetMapping("/allproduit")
    List<Produit> retrieveAllProduits(){
    return produitService.retrieveAllProduits();
}
    @GetMapping("/addproduit")
    Produit addProduit (Produit p, Long idCategorieProduit, Long idStock){
        return produitService.addProduit(p,idCategorieProduit,idStock);
    }
    @GetMapping("/updateproduit")
    Produit updateProduit (Produit p, Long idCategorieProduit, Long idStock){

        return produitService.updateProduit(p,idCategorieProduit,idStock);
    }
    @GetMapping("/findproduit")
    Produit retrieveProduit(Long id) {
        return produitService.retrieveProduit(id);
        
    }


}
