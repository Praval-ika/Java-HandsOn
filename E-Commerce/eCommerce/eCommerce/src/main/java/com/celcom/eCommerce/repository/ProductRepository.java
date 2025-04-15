package com.celcom.eCommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.celcom.eCommerce.model.Product64;
import com.celcom.eCommerce.model.ProductDetails;

public interface ProductRepository extends JpaRepository<Product64,Integer>{
   
	@Query(value="SELECT DISTINCT Category FROM Product_66",nativeQuery=true)
	List<String> findDistinctCategories();
	
	@Query(value="SELECT id,name,price FROM Product_66 WHERE category = ?1",nativeQuery=true)
	List<ProductDetails> findCategoryDetails(String category);
}
