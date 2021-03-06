package com.insi.homeshop;

import com.insi.homeshop.Delivery;
import com.insi.homeshop.ExpressDelivery;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ExpressDeliveryTest {

    @Test
    public  void Given_RegionCityAsLocation_WhenGettingDeliveryPrice_ThenGet9e99(){
        Delivery delivery = new ExpressDelivery("Bordeau");
        assertEquals(9.99, delivery.getPrice(), 0.01);
    }
    @Test
    public void Given_ParisAsLoaction_WhenGettingDeliveryPrice_ThenGet6e99(){
        Delivery delivery = new ExpressDelivery("Paris");
        assertEquals(6.99, delivery.getPrice(), 0.01);
    }

}
