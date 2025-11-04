package com.sergiubarsa.myfancypdfinvoices.springboot.repository;

import com.sergiubarsa.myfancypdfinvoices.springboot.model.Invoice;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface InvoiceRepository extends CrudRepository<Invoice, String> {

    List<Invoice> findByUserId(String userId);
}
