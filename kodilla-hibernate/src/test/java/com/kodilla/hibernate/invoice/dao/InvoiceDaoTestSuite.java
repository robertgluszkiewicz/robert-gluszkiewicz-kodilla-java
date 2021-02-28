package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.math.BigDecimal;

import static org.junit.Assert.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired
    private ProductDao productDao;

    @Test
    void testInvoiceDaoSave() {

        //Given
        Product chocolate = new Product("Czekolada mleczna");
        Product milk = new Product("Mleko białe 2%");
        Product roll = new Product("Bułka graham z ziarnami");

        Item item1 = new Item(chocolate, new BigDecimal("4.92"), 2);
        Item item2 = new Item(milk, new BigDecimal("2.81"), 3);
        Item item3 = new Item(roll, new BigDecimal("0.81"), 10);

        Invoice invoice1 = new Invoice("2021/02/28/101");

        item1.setProduct(chocolate);
        item2.setProduct(milk);
        item3.setProduct(roll);

        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        item3.setInvoice(invoice1);

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice1.getItems().add(item3);

        //When
        productDao.save(chocolate);
        productDao.save(milk);
        productDao.save(roll);
        invoiceDao.save(invoice1);
        int invoice1Id = invoice1.getId();

        //Then
        assertNotEquals(0, invoice1Id);

        //CleanUp
        int chocolateId = chocolate.getId();
        int milkId = milk.getId();
        int rollId = roll.getId();

        try {
            invoiceDao.deleteById(invoice1Id);
            productDao.deleteById(chocolateId);
            productDao.deleteById(milkId);
            productDao.deleteById(rollId);
        } catch (Exception e) {
            //do nothing
        }
    }
}