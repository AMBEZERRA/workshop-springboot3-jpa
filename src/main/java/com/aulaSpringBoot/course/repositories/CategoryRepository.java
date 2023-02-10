package com.aulaSpringBoot.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaSpringBoot.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}