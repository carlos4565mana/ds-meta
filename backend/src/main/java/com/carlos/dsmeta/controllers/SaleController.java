package com.carlos.dsmeta.controllers;

import com.carlos.dsmeta.entities.Sale;
import com.carlos.dsmeta.services.SaleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
    private SaleService service;
    public SaleController(SaleService service) {
        this.service = service;
    }

    @GetMapping
    public List<Sale> findSales(){
        return  service.findSales();

    }
}
