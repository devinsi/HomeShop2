package com.insi.homeshop;

import org.junit.jupiter.api.Test;

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
    private Fridge frigo = new Fridge(" Proline", "Réfrigérateur à froid statique 81 L", 99.90, 81, true);
    private Television tv = new Television("TV LED Samsung", "Ecran de 140 cm - 100% UHD/4K", 449.99, 140, "LED");
    private Customer customer = new Customer("Juste Leblanc", "19 rue Germain Pilon, Paris");
    private Delivery lowCostRelayDelivery = new RelayDelivery(27);

    @Test
    public void ljtfglkvcdfkjglvytvolyn(){

    }
}
