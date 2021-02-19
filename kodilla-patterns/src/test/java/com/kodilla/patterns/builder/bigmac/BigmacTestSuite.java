package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testNewBigmac() {

        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("sesame seed")
                .burgers(3)
                .sauce("barbecue")
                .ingredient("salad")
                .ingredient("onion")
                .ingredient("bacon")
                .ingredient("cucumber")
                .ingredient("chili")
                .ingredient("cheese")
                .ingredient("prawns")
                .ingredient("mushrooms")
                .build();
        System.out.println(bigmac);

        //When
        int ingredientsQuantity = bigmac.getIngredients().size();

        //Then
        assertEquals(8, ingredientsQuantity);
    }
}
