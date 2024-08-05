<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<table>
    <thead>
        <tr>
            <th>ID Vai Tro</th>
            <th>Ten Vai Tro</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="vaitro" items="${vaitroList}">
            <tr>
                <td>${vaitro.id}</td>
                <td>${vaitro.name}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>
