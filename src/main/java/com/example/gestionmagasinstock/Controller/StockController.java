package com.example.gestionmagasinstock.Controller;

import com.example.gestionmagasinstock.Entity.Stock;
import com.example.gestionmagasinstock.Service.StockService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class StockController {


    private final StockService stockService;


   @GetMapping("/allstock")
    public List<Stock> retrieveAllStocks(){

       return stockService.retrieveAllStocks();
   }
    @GetMapping("/addstock")
    public Stock addStock(Stock s){

        return stockService.addStock(s);
    }
    @GetMapping("/updatestock")
   public Stock updateStock(Stock s){
       return stockService.updateStock(s);
    }
    @GetMapping("/findstock")
   public Stock retrieveStock(Long id){
       return stockService.retrieveStock(id);

    }
    @GetMapping("/deletestock")
  public  void removeStock(Long id){
        stockService.removeStock(id);
    }
}
