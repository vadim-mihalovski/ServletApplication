<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employees</title>
    <link href="<c:url value="/resources/css/jquery.dataTables.min.css"/>" rel="stylesheet">
</head>
<body>
<table id="employees" class="display" cellspacing="0" width="100%">
    <thead>
    <tr>
        <th>Name</th>
        <th>Position</th>
        <th>Office</th>
        <th>Age</th>
        <th>Start date</th>
        <th>Salary</th>
        <th>Actions</th>
    </tr>
    </thead>
    <tfoot>
    <tr>
        <th>Name</th>
        <th>Position</th>
        <th>Office</th>
        <th>Age</th>
        <th>Start date</th>
        <th>Salary</th>
        <th>Actions</th>
    </tr>
    </tfoot>
    <tbody>
    <c:forEach items="${employees}" var="employee">
        <tr>
            <td data-name="name">${employee.name}</td>
            <td data-name="position">${employee.position}</td>
            <td data-name="office">${employee.office}</td>
            <td data-name="age">${employee.age}</td>
            <td data-name="startDate">${employee.startDate}</td>
            <td data-name="salary">${employee.salary}</td>
            <td><button class="js-action-reset-salary" data-employee-key="${employee.name}">Reset Salary</button></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a href="test" target="_blank">Test Button</a>
<script src="<c:url value="/resources/js/lib/jquery-1.12.4.js"/>"></script>
<script src="<c:url value="/resources/js/lib/jquery.dataTables.min.js"/>"></script>
<script src="<c:url value="/resources/js/employees.js"/>"></script>
</body>
</html>
