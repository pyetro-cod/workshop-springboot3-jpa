package com.ppc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ppc.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	

}
