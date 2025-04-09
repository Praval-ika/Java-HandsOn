package com.celcom.eCommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.celcom.eCommerce.model.Product;
import com.celcom.eCommerce.model.ProductDetails;

public interface ProductRepository extends JpaRepository<Product,Integer>{
   
	@Query(value="SELECT DISTINCT Category FROM Product",nativeQuery=true)
	List<String> findDistinctCategories();
	
	@Query(value="SELECT id,name,price FROM Product WHERE category = ?1",nativeQuery=true)
	List<ProductDetails> findCategoryDetails(String category);
}
