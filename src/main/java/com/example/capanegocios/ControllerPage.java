package com.example.capanegocios;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.capadatos.Usuario;

@Controller
public class ControllerPage {
	
	@Value("${pagina.ingreso.jsp}")
    private String pagina_ingreso;
	
	@Value("${pagina.consulta.jsp}")
    private String pagina_consulta;
	
	@Value("${pagina.index.jsp}")
    private String index;
	
	@Value("${pagina.ingresoUsuario.jsp}")
    private String pagina_Ingreso_Usuario;
	
	
	//Se llama desde internet http://localhost:8080/
	 @RequestMapping("/")
	 public ModelAndView listTodo() {
			ModelAndView mav = new ModelAndView(index);
        return mav;
	    }
	 
	 @RequestMapping("/controladorConsulta")
	 public ModelAndView irConsulta() {
			ModelAndView mav = new ModelAndView(pagina_consulta);
        return mav;
	    }
	 
	 @RequestMapping("/controladorIngreso")
	 public ModelAndView irIngreso() {
			ModelAndView mav = new ModelAndView(pagina_ingreso);
        return mav;
	    }
	 
	 @RequestMapping("/controladorIngresoUsuario")
	 public ModelAndView irPrueba() {
			ModelAndView mav = new ModelAndView(pagina_Ingreso_Usuario);
        return mav;
	    }
	 
		
		@ModelAttribute("usuario")
		public void ingresarUsuario(@ModelAttribute("usuario") Usuario usuario){
		//	 model.addAttribute("cedula", usuario.getCedula());
		//	 LOG.info("mostrarJSONIDUsuarios nombreRecibido: "+nombreRecibido);
		//	 int cedula = Integer.parseInt(cedulaRecibido);	
			
				}
	 
	
}
