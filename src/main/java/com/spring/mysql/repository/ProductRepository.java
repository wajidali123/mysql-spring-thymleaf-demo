/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.mysql.repository;

/**
 *
 * @author etisalat
 */
import com.spring.mysql.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
 
public interface ProductRepository extends JpaRepository<Product, Long> {
 
}
