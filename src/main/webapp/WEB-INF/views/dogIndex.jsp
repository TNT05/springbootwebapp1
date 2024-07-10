<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dog Form</title>
</head>
<body>
<h2>Simple Dog Creator</h2>
<form action="displayDog">
    <label for="dogId">Dog Id:</label>
    <input type="text" id="dogId" name="dogId"><br><br>
    <label for="dogName">Dog Name:</label>
    <input type="text" id="dogName" name="dogName"><br><br>
    <label for="dogBreed">Dog Breed</label>
    <input type="text" id="dogBreed" name="dogBreed"><br><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>