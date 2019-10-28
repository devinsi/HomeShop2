package com.insi.homeshop;

import org.junit.jupiter.api.Test;

public class RelayDeliveryTest {

    @Test
    public  void Given_FreeRelay_WhenGettingDeliveyPrice_ThenGet0e(){
        Delivery delivery = new RElayDelivery(5);
        assertEquals(0.0, delivery.getPrice(), 0.01);
    }

    @Test
    public  void Given_LowPriceRelay_WhenGettingDeliveryPrice_ThenGet2e99(){
        Delivery delvery = new RelayDelivery(27);
        assertEquals(2.99, delivery.getPrice(), 0.01);
    }

    @Test
    public void Given_HightPriceRelay_WhenGettingDeliveryPrice_ThenGet4e99(){
        Delivery delivery = new RelayDelivery(52);
        assertEquals(4.99, delivery.getPrice(), 0.01);
    }
}
