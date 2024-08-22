package com.deandres.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deandres.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
