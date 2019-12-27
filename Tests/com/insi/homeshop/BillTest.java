package com.insi.homeshop;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BillTest {
    private String output;
    private Writer writerMock = new Writer() {
        @Override
        public void start() {
            output = "";
        }

        @Override
        public void writeLine(String line) {
            output += line + "%n";
        }

        @Override
        public void stop() {

        }
    };

    private Product cafe = new Product("philips HD", "Senseo n&b", 79.99);
    private Fridge fridge = new Fridge(" Proline", "Réfrigérateur à froid statique 81 L", 99.90, 81, true);
    private Television tv = new Television("TV LED Samsung", "Ecran de 140 cm - 100% UHD/4K", 449.99, 140, "LED");
    private Customer customer = new Customer("Juste Leblanc", "19 rue Germain Pilon, Paris");
    private Delivery lowCostRelayDelivery = new RelayDelivery(27);

    @Test
    public void Given_2productsAndDelivery_When_generatingBill_Then_getGoodLineNumber(){
        Bill bill = new Bill(customer, lowCostRelayDelivery);
        bill.addProduct(cafe,1);
        bill.addProduct(tv,1);
        bill.generate(writerMock);
        int lineNumber = output.split("\n").length;
        assertEquals(20, lineNumber);
    }
    @Test
    public void Given_3productsAndDelivery_When_generatingBill_Then_getGoodTotal() {
        Bill bill = new Bill(customer, lowCostRelayDelivery);
        bill.addProduct(cafe, 1);
        bill.addProduct(tv, 1);
        bill.addProduct(fridge, 1);
        assertEquals(870.98, bill.getTotal(), 0.01);
    }

    @Test
    public void Given_emptyProductList_generatingBill_Then_throwsException() {
        Bill bill = new Bill(customer, lowCostRelayDelivery);
        assertThrows(NoProductInBillException.class, () -> bill.generate(writerMock));
    }

}
