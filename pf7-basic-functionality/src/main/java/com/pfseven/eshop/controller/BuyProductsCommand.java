package com.pfseven.eshop.controller;

public class BuyProductsCommand implements Command{

    @Override
    public void execute() {
        String customerID = EshopController.askAdministratorForCustomerID();
        String productID = EshopController.askAdministratorForProductID();
        System.out.println("Hello from BuyProductsCommand");//TODO replace and add functionality
    }
}
