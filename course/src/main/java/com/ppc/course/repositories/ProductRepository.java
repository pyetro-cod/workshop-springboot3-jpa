package com.ppc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ppc.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	

}
