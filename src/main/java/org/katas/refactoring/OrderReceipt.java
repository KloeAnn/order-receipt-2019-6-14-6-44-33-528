package org.katas.refactoring;

import java.util.List;
import java.util.stream.Collectors;

/**
 * OrderReceipt prints the details of order including customer name, address, description, quantity,
 * price and amount. It also calculates the sales tax @ 10% and prints as part
 * of order. It computes the total order amount (amount of individual lineItems +
 * total sales tax) and prints it.
 */
public class OrderReceipt {
    private Order o;

    public OrderReceipt(Order o) {
        this.o = o;
    }

    public String printReceipt() {
        double taxRate = 0.10;
        double totalSalesTax = calculateLineItemsTotalSalesTax(taxRate, o.getCustemorLineItems());
        double total = calculateLineItemsTotal(taxRate, o.getCustemorLineItems());

        StringBuilder output = new StringBuilder();
         output.append("======Printing Orders======\n")
                .append(o.getCustomerName())
                .append(o.getCustomerAddress())
                .append(o.getCustemorLineItems().stream().map(
                        i -> i.getDescription() + "\t" + i.getPrice() + "\t" + i.getQuantity() + "\t" + i.caculateTotalAmount() + "\n"
                ).collect(Collectors.joining()))
                .append("Sales Tax\t" + totalSalesTax)
                .append("Total Amount\t" + total);
         return output.toString();
    }
    public double calculateLineItemsTotalSalesTax(double taxRate,List<LineItem>list){
        return list.stream().mapToDouble(i->i.caculateTotalAmount()).sum()*taxRate;
    }

    public double calculateLineItemsTotal(double taxRate,List<LineItem>list){
        return list.stream().mapToDouble(i->i.caculateTotalAmount()).sum()*(taxRate+1);
    }
}