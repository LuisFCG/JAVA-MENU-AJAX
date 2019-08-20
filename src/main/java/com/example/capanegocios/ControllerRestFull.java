package com.example.capanegocios;

import java.util.List;
import java.util.Optional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.capadatos.Usuario;


@RestController
public class ControllerRestFull {

	private static Log LOG = LogFactory.getLog(ControllerRestFull.class);
	
	@Value("${pagina.ingresoUsuario.jsp}")
    private String pagina_Ingreso_Usuario;
	
	@Autowired
	@Qualifier("usuarioServiceImpl")
	private UsuarioServiceImpl usuarioServiceImpl;
	
	
	//Mostrar JSON - todos los registros
	@RequestMapping("/mostrarJSONUsuarios")
	public List<Usuario> mostrarJSONUsuarios(){
		
		return usuarioServiceImpl.findAllUsuarios();
		
	}

	//Mostrar JSON con 1 parametro seleccionado - URL ejemmplo: http://localhost:8080/mostrarIDJSON/454545
		@RequestMapping(value ="/mostrarIDJSON", method = RequestMethod.GET)
		public String mostrarJSONUsuariosCED(@PathVariable("cedula") int cedula){
			
			 LOG.info("mostrarJSONIDUsuarios cedula: "+cedula);
			//return usuarioServiceImpl.encontrarCedulaUsuario(cedula);
			 return "OK";
			
		}
		
	//Mostrar JSON con 2 parametros seleccionado - URL ejemmplo: http://localhost:8080/mostrarIDJSON/454545/3
		@RequestMapping(value ="/mostrarIDJSON/{cedula}/{id}", method = RequestMethod.GET)
		public List<Usuario> mostrarJSONUsuariosCEDId(@PathVariable("cedula") int cedula,
				@PathVariable("id") int id){
			 LOG.info("mostrarJSONIDUsuarios cedula: "+cedula);
			 LOG.info("mostrarJSONIDUsuarios id: "+id);
			return usuarioServiceImpl.encontrarCedulaIDUsuario(cedula, id);
					
				}
		
		//Eliminar JSON con 1 parametro seleccionado - URL ejemmplo: http://localhost:8080
		@RequestMapping(value ="/eliminarCedula/{id}", method = RequestMethod.DELETE)
		public void deleteCedula(@PathVariable("id") int id){
			 LOG.info("deleteCedula id: "+id);
			 usuarioServiceImpl.deleteCedula(id);
							
						}

		@RequestMapping(value ="/consultarUsuario", method = RequestMethod.POST)
		public List<Usuario> consultarUsuario(@RequestParam(value="cedula") int cedulaRecibido,
				@RequestParam(value="nombre") String nombreRecibido){
					
			 LOG.info("mostrarJSONIDUsuarios cedulaRecibido: "+cedulaRecibido);
			 LOG.info("mostrarJSONIDUsuarios nombreRecibido: "+nombreRecibido);
		//	 int cedula = Integer.parseInt(cedulaRecibido);	
			return usuarioServiceImpl.encontrarCedulaUsuario(cedulaRecibido);
					
				}
		
		@RequestMapping(value ="/ingresarUsuario", method = RequestMethod.POST)
		public String ingresarUsuario(@ModelAttribute("usuario") Usuario usuario,
				Model model){
		
			 LOG.info("Cedula: : "+usuario.getCedula());
			 LOG.info("Nombre: : "+usuario.getNombre());
		
 usuarioServiceImpl.insertarUsuario(usuario);
			 return "Procesado";
					
				}
		
	
}
