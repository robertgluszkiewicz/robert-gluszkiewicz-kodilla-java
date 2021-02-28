/**

package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import com.kodilla.hibernate.invoice.dao.InvoiceDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.Assert.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {

        //Given
        Product chocolate = new Product("Czekolada mleczna");
        Product milk = new Product("Mleko białe 2%");
        Product roll = new Product("Bułka graham z ziarnami");

        Item item1 = new Item(chocolate, new BigDecimal(4.99), 2);
        Item item2 = new Item(milk, new BigDecimal(2.85), 3);
        Item item3 = new Item(roll, new BigDecimal(0.95), 8);

        Invoice invoice = new Invoice("2021/02/28/123");

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        chocolate.getItems().add(item1);
        milk.getItems().add(item2);
        roll.getItems().add(item3);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        assertNotEquals(0, invoiceId);

        //CleanUp
        invoiceDao.deleteById(invoiceId);
    }
}
**/