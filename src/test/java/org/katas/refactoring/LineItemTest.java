package org.katas.refactoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineItemTest {

    @Test
    public void should_return_description_when_get_description(){
        //given
        LineItem lineItem=new LineItem("Some description",1.22,1);
        //when
        String description=lineItem.getDescription();
        //then
        assertSame("Some description",description);
    }

    @Test
    public void should_return_price_when_get_price(){
        //given
        LineItem lineItem=new LineItem("Some description",1.22,1);
        //when
        double price=lineItem.getPrice();
        //then
        assertEquals(1.22,price);
    }

    @Test
    public void should_return_quantity_when_get_quantity(){
        //given
        LineItem lineItem=new LineItem("Some description",1.22,1);
        //when
        int quantity=lineItem.getQuantity();
        //then
        assertEquals(1,quantity);
    }
    @Test
    public void should_return_total_when_get_total_amount(){
        //given
        LineItem lineItem=new LineItem("Some description",1.22,1);
        //when
        double totalAmount=lineItem.totalAmount();
        //then
        assertEquals(1.22,totalAmount);
    }

}