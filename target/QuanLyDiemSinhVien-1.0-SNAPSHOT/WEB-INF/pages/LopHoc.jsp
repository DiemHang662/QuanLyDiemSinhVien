<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Thông tin l?p h?c</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
    <h2>Thông tin l?p h?c</h2>

    <form action="${pageContext.request.contextPath}/lophoc" method="get">
        <label for="maLop">Nh?p mã l?p:</label>
        <input type="text" id="maLop" name="maLop" required>
        <button type="submit">Tìm ki?m</button>
    </form>

    <c:if test="${not empty lopHoc}">
        <h3>Thông tin l?p</h3>
        <p><strong>Mã l?p:</strong> ${lopHoc.id}</p>
        <p><strong>Tên l?p:</strong> ${lopHoc.name}</p>
        <p><strong>Gi?ng viên:</strong> ${lopHoc.giangVien.name}</p>

        <h3>Danh sách sinh viên</h3>
        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Tên</th>
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
