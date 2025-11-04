package com.sergiubarsa.myfancypdfinvoices.springboot.controllers;

import com.sergiubarsa.myfancypdfinvoices.springboot.dto.InvoiceDto;
import com.sergiubarsa.myfancypdfinvoices.springboot.model.Invoice;
import com.sergiubarsa.myfancypdfinvoices.springboot.service.InvoiceService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;

@RestController
public class InvoicesController {

    private final InvoiceService invoiceService;

    public InvoicesController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @GetMapping("/invoices")
    public Iterable<Invoice> findAll() {
        return invoiceService.findAll();
    }

    @GetMapping("/invoices/{userId}")
    public List<Invoice> findByUserId(@PathVariable("userId") String userId) {
        return invoiceService.findByUserId(userId);
    }

    @PostMapping("/invoices")

    public Invoice create(@Valid @RequestBody InvoiceDto invoiceDto) {
        return invoiceService.create(invoiceDto.getUserId(), invoiceDto.getAmount());
    }
}
