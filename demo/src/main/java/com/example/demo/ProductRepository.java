package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import objects.Productos;

public interface ProductRepository extends JpaRepository <Productos , Long>{
	
	Productos findByNombre(String Nombre);
	Productos findByIdProducto(int idProducto);

}
