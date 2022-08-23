package com.springboot.ecommerce.DAO;

import com.springboot.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(collectionResourceRel = "ProductCategory",path="product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Long> {


}
