package com.carlos.dsmeta.controllers;

import com.carlos.dsmeta.entities.Sale;
import com.carlos.dsmeta.services.SaleService;
import com.carlos.dsmeta.services.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SmsService smsService;

    private SaleService service;
    public SaleController(SaleService service) {
        this.service = service;
    }

    @GetMapping
    public Page<Sale> findSales(
            @RequestParam(value = "minDate", defaultValue = "") String minDate,
            @RequestParam(value = "maxDate", defaultValue = "") String maxDate,
            Pageable pageable){
        return  service.findSales(minDate, maxDate,pageable);

    }

    @GetMapping("/{id}/notification")
    public void notifySms(@PathVariable Long id){
        smsService.sendSms(id);

    }
}
