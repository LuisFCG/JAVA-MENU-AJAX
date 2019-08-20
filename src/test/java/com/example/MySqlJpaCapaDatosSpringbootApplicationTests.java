package com.example;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.capadatos.JpaUsuarioRepositorio;
import com.example.capadatos.Usuario;
import com.example.capanegocios.UsuarioServiceImpl;



@RunWith(SpringRunner.class)
@SpringBootTest
public class MySqlJpaCapaDatosSpringbootApplicationTests {

	@Autowired
	@Qualifier("jpaUsuarioRepositorio")
	private JpaUsuarioRepositorio jpaUsuarioRepositorio;
	
	@Autowired
	@Qualifier("usuarioServiceImpl")
	private UsuarioServiceImpl usuarioServiceImpl;
	
	@Test
	public void contextLoads() {
		
		//mostrar();
		mostrar();
		eliminarCedula();
		mostrar();
		}
	
	public void mostrar() {
		List<Usuario> listado;
		listado = new ArrayList<Usuario>();
	
	
				listado = jpaUsuarioRepositorio.findAll();
				
				System.out.println(" ");
				System.out.println("Ejecutando metodo mostrar() ");
				System.out.println("Total registros capa negocio: "+listado.size());
				System.out.println(" ");
				
		/*		System.out.println(" ");
				for(int i=0; i < listado.size(); i++){
					System.out.println("Id: "+listado.get(i).getId());
					System.out.println("Cedula: "+listado.get(i).getCedula());
					System.out.println("Nombre: "+listado.get(i).getNombre());
					System.out.println(" ");
				}
				*/
	}
	
	public void mostrarUsuarioServiceTodos() {
	
		System.out.println("usuarioServiceImpl.findAllUsuarios() "+usuarioServiceImpl.findAllUsuarios());
	}
	
	public void eliminarCedula() {
		
		//jpaUsuarioRepositorio.deleteById(3);
		usuarioServiceImpl.deleteCedula(1);
	}

}
