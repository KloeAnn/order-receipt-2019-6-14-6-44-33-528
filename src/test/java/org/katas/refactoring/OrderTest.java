package org.katas.refactoring;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {


    @Test
    void should_return_customer_name_when_get_customer_name() {
        //given
        LineItem lineItem=new LineItem("Some description",1.22,1);
        List<LineItem> list=new ArrayList<LineItem>();
        list.add(lineItem);
        Order order=new Order("Kloe","Beijing",list);
        //when
        String name=order.getCustomerName();
        //then
        assertSame("Kloe",name);
    }

    @Test
    public void should_return_customer_address_when_get_customer_address() {
        //given
        LineItem lineItem=new LineItem("Some description",1.22,1);
        List<LineItem> list=new ArrayList<LineItem>();
        list.add(lineItem);
        Order order=new Order("Kloe","Beijing",list);
        //when
        String address=order.getCustomerAddress();
        //then
        assertSame("Beijing",address);
    }

    @Test
    public void should_return_line_item_when_get__line_item() {
        //given
        LineItem lineItem=new LineItem("Some description",1.22,1);
        List<LineItem> list=new ArrayList<LineItem>();
        list.add(lineItem);
        Order order=new Order("Kloe","Beijing",list);
        //when
        List res=order.getCustemorLineItems();
        //then
        assertSame(list,res);
    }
}