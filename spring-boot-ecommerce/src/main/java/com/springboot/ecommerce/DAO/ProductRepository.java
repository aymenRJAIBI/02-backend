package com.springboot.ecommerce.DAO;

import com.springboot.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "Products",path="product")
public interface ProductRepository extends JpaRepository<Product,Long> {

}
