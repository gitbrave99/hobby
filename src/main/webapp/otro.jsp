<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>

<h:outputLabel value="Hello, wo ssrld"/>
<h:form>
    <p:inputText value="#{peliculaBean.nombre}" />
    <h:commandButton action="#{peliculaBean.saludar()}" value="enviar"/>
    <h:outputLabel value="#{peliculaBean.mensaje}"/>
</h:form>
</body>
</html>