<%--
  Created by IntelliJ IDEA.
  User: son
  Date: 04/12/2021
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>index</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>
<p></p>
<button onclick="location.href='add'" type="button" class="btn btn-info">Create New Employee</button>
<p></p>
<table>
    <tr>
        <th>ID</th>
        <th>Full Name</th>
        <th>Birthday</th>
        <th>Address</th>
        <th>Position</th>
        <th>Department</th>
    </tr>
    <c:forEach var="e" items="${employees}">
        <tr>
            <td>${e.id}</td>
            <td>${e.fullname}</td>
            <td>${e.bday}</td>
            <td>${e.address}</td>
            <td>${e.position}</td>
            <td>${e.department}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>

