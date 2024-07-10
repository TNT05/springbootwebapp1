<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dog Result</title>
</head>
<body>
<h2>New Dog is: ${dog} </h2>
<ul>
  <c:forEach var="color" items="${dogColors}">
    <li>${color}</li>
  </c:forEach>
</ul>
</body>
</html>
