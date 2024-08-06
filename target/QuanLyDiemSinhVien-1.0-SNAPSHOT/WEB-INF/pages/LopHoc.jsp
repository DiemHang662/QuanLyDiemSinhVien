<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Th�ng tin l?p h?c</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
    <h2>Th�ng tin l?p h?c</h2>

    <form action="${pageContext.request.contextPath}/lophoc" method="get">
        <label for="maLop">Nh?p m� l?p:</label>
        <input type="text" id="maLop" name="maLop" required>
        <button type="submit">T�m ki?m</button>
    </form>

    <c:if test="${not empty lopHoc}">
        <h3>Th�ng tin l?p</h3>
        <p><strong>M� l?p:</strong> ${lopHoc.id}</p>
        <p><strong>T�n l?p:</strong> ${lopHoc.name}</p>
        <p><strong>Gi?ng vi�n:</strong> ${lopHoc.giangVien.name}</p>

        <h3>Danh s�ch sinh vi�n</h3>
        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>T�n</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="sinhVien" items="${sinhVienList}">
                    <tr>
                        <td>${sinhVien.id}</td>
                        <td>${sinhVien.name}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </c:if>
</body>
</html>
