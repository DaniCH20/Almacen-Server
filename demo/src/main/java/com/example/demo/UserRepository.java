package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import objects.Usuarios;

public interface UserRepository extends JpaRepository<Usuarios, Long> {
	Usuarios findByEmail(String email);

	Usuarios findByNombre(String nombre);
}
