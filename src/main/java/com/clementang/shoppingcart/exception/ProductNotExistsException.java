package com.clementang.shoppingcart.exception;

public class ProductNotExistsException extends RuntimeException {

    public ProductNotExistsException(String message) {
        super(message);
    }
}
