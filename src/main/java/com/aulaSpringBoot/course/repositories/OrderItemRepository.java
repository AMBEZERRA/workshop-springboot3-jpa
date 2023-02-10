package com.aulaSpringBoot.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaSpringBoot.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}