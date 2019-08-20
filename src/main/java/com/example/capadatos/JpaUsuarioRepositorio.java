package com.example.capadatos;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.io.Serializable;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



@Repository("jpaUsuarioRepositorio")
public interface JpaUsuarioRepositorio extends JpaRepository<Usuario, Serializable> {

	
	 @Query("from Usuario c where c.cedula = :usuario_cedula")
	 List<Usuario> encontrarCedulaUsuario(@Param("usuario_cedula") int usuario_cedula);
	 
	 @Query("from Usuario c where c.cedula = :usuario_cedula and c.id = :id_cedula")
	 List<Usuario> encontrarCedulaIDUsuario(@Param("usuario_cedula") int usuario_cedula, 
			 @Param("id_cedula") int id_cedula);
	 
	/* @Query("from Usuario c where c.cedula = :usuario_cedula and c.id = :id_cedula")
	 List<Usuario> deleteUsuarioconParametroCedula(@Param("usuario_cedula") int usuario_cedula, 
			 @Param("id_cedula") int id_cedula);*/
	
	
}
