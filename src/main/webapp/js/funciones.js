alert("Ingresa a funciones.js");

function verContenido(id){
	//alert("Ingresa a ver contenido");
	//alert("Valor de variable ID: "+id);
	
	//XMLHttpRequest: interfaz para realizar peticiones HTTP mediante tecnologia AJAX, 
	//generando contenido dinamico y asincrono
	 var xhttp = new XMLHttpRequest();
	  xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	      document.getElementById("demo").innerHTML = this.responseText;
	    }
	  };
	  xhttp.open("GET", id, true);
	  xhttp.send();
  // alert("Valor value: "+document.getElementById(id).value);
}


function loadDoc(forma) {
	alert("formdata.cedula.value: "+forma.cedula.value);
	alert("formdata.nombre.value: "+forma.nombre.value);
	alert("forma: "+forma);
	  var xhttp = new XMLHttpRequest();
	  var usuario = new FormData(forma);
	  alert("valor formdata: "+usuario);
	  xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	    	alert("this.responseText: "+this.responseText);
	    //	if(this.responseText=="Procesado"){
	    		document.getElementById("demo").innerHTML = this.responseText;
	    //	}
	      
	    }
	  };
	  xhttp.open("POST", "ingresarUsuario", true);
	  xhttp.send(usuario);
	
	//  return false;
	}
