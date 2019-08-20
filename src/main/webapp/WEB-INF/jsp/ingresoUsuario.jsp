<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
    <script type="text/javascript">
<%@ include file="/js/funciones.js"%>
</script>
  <title>Problema</title>
</head>
<body>
 <h1>Vote esta foto</h1>
<form modelAttribute="usuario" id="forma">
 
  Cedula:<input type="number" id="cedula" name="cedula" size="20">
   Nombre:<input type="text" id="nombre" name="nombre" size="20">

 
  <br>
  <input type="button" onclick="loadDoc(forma)" id="boton1" value="votar">
  </form>
 
</body>
</html>