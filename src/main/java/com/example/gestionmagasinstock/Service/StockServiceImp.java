package com.example.gestionmagasinstock.Service;

import com.example.gestionmagasinstock.Entity.Stock;
import com.example.gestionmagasinstock.Repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockServiceImp implements StockService{
    @Autowired
    StockRepository stockRepository;

    @Override
    public List<Stock> retrieveAllStocks() {
        return stockRepository.findAll();
    }

    @Override
    public Stock addStock(Stock s) {
        return stockRepository.save(s);
    }

    @Override
    public Stock updateStock(Stock s) {


        Stock up = stockRepository.findById(s.getIdStock()).get();

        return  stockRepository.save(up);
    }

    @Override
    public Stock retrieveStock(Long id) {
        return stockRepository.findById(id).get();
    }

    @Override
    public void removeStock(Long id) {
stockRepository.deleteById(id);
    }
}
