package com.dunky.ws.products.service;

import com.dunky.ws.products.entity.CreateProductRestModel;

import java.util.concurrent.ExecutionException;

public interface ProductService {
    String createProduct(CreateProductRestModel product) throws ExecutionException, InterruptedException;
}
