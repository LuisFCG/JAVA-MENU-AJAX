package com.example.capanegocios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.capadatos.JpaUsuarioRepositorio;
import com.example.capadatos.Usuario;


@Service("usuarioServiceImpl")
public class UsuarioServiceImpl implements UsuarioService  {

	@Autowired
	@Qualifier("jpaUsuarioRepositorio")
	private JpaUsuarioRepositorio jpaUsuarioRepositorio;
	
	@Override
	public List<Usuario> findAllUsuarios() {
		// TODO Auto-generated method stub
		return jpaUsuarioRepositorio.findAll();
	}

	@Override
	public List<Usuario> encontrarCedulaUsuario(int cedula) {
		// TODO Auto-generated method stub
		return jpaUsuarioRepositorio.encontrarCedulaUsuario(cedula);
	}

	@Override
	public List<Usuario> encontrarCedulaIDUsuario(int cedula, int id) {
		// TODO Auto-generated method stub
		return jpaUsuarioRepositorio.encontrarCedulaIDUsuario(cedula, id);
	}

	@Override
	public void deleteCedula(int id) {
		jpaUsuarioRepositorio.deleteById(id);
		
	}

	@Override
	public Usuario insertarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return jpaUsuarioRepositorio.save(usuario);
	}



}
