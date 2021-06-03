<%--
  Created by IntelliJ IDEA.
  User: forestbaba
  Date: 03/06/2021
  Time: 12:52
  To change this template use File | Settings | File Templates.
--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
<head>
    <title>List Customers</title>

    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>

<div id="wrapper">
    <div id="header">
        <h2>CRM - Customer Relationship Manager</h2>
    </div>
</div>

<div id="container">
    <div id="content"></div>

    <input type="button" value="Add Customer" onclick="window.location.href= 'showFormAdd'; return false;" class="add-button" >

    <table>
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>

            <c:forEach var="tempCustomer" items="${customers}">

        <tr>
            <td>${tempCustomer.firstName}</td>
            <td>${tempCustomer.lastName}</td>
            <td>${tempCustomer.email}</td>
        </tr>
        </c:forEach>
        </tr>
    </table>

</div>
</body>
</html>
