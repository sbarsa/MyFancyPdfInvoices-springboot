package com.sergiubarsa.myfancypdfinvoices.springboot.repository;

import com.sergiubarsa.myfancypdfinvoices.springboot.model.Invoice;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceRepository extends CrudRepository<Invoice, String> {
}
