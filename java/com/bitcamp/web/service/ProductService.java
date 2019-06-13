package com.bitcamp.web.service;

import java.util.List;

import com.bitcamp.web.domain.ProductDTO;

import org.springframework.stereotype.Component;

/**
 * ProductService
 */
@Component
public interface ProductService {

     //create 추가
     public void addProduct(ProductDTO product);
     //read 종류 3가지
     public List<ProductDTO> findProducts();
     public List<ProductDTO> findProductsByWord(ProductDTO product);
     public ProductDTO findProductByProductId(ProductDTO product);
 
     //update
     public void updateProduct(ProductDTO product);
     //delete
     public void deleteProduct(ProductDTO product);
}