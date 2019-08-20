package com.example.capanegocios;

import java.util.List;
import java.util.Optional;

import com.example.capadatos.Usuario;



public interface UsuarioService {

	
	List<Usuario> findAllUsuarios(); //Encontrar todos los registros
	
	List<Usuario> encontrarCedulaUsuario(int cedula); //Encontrar registro por cedula
	
	List<Usuario> encontrarCedulaIDUsuario(int cedula, int id); //Encontrar registro por cedula y ID)
	
	void deleteCedula(int id);
	
	Usuario insertarUsuario(Usuario usuario);
	
	
	
}
