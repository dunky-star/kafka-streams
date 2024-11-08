package com.dunky.ws.products.service;

import com.dunky.ws.products.entity.CreateProductRestModel;

public interface ProductService {
    String createProduct(CreateProductRestModel product);
}
