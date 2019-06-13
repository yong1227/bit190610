package com.bitcamp.web.mapper;

import java.util.List;

import com.bitcamp.web.domain.ProductDTO;

import org.springframework.stereotype.Repository;

/**
 * ProductMapper
 */
@Repository
public interface ProductMapper {

     //create 추가
     public void insertProduct(ProductDTO product);
     //read 종류 3가지
     public List<ProductDTO> selectProducts();
     public List<ProductDTO> selectProductsByWord(ProductDTO product);
     public ProductDTO selectProductByProductId(String product);
 
     //update
     public void updateProduct(ProductDTO product);
     //delete
     public void deleteProduct(ProductDTO product);
    
}