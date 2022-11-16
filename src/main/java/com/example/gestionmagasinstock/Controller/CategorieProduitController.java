package com.example.gestionmagasinstock.Controller;

import com.example.gestionmagasinstock.Entity.CategorieProduit;
import com.example.gestionmagasinstock.Service.CategorieProduitService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class CategorieProduitController {


    private final CategorieProduitService categorieProduitService;

@GetMapping("/allcategorieproduit")
   public List<CategorieProduit> retrieveAllCategorieProduits(){
    return categorieProduitService.retrieveAllCategorieProduits();
}
    @GetMapping("/addcategorieproduit")
    public CategorieProduit addCategorieProduit(CategorieProduit cp){
      return   categorieProduitService.addCategorieProduit(cp);

    }
    @GetMapping("/updatecategorieproduit")
    public CategorieProduit updateCategorieProduit(CategorieProduit cp){
    return categorieProduitService.updateCategorieProduit(cp);

    }
    @GetMapping("/findcategorieproduit")
    public CategorieProduit retrieveCategorieProduit(Long id){
       return categorieProduitService.retrieveCategorieProduit(id);
    }
    @GetMapping("/deletecategorieproduit")
    public void removeCategorieProduit(Long id){
        categorieProduitService.removeCategorieProduit(id);
    }
}
