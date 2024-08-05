<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Danh sách Sinh Viên</title>
    <meta charset="UTF-8">
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid #dddddd;
            text-align: center;
            padding: 8px;
        }
        th {
            background-color: #f2f2f2;
        }
        tr:nth-child(even) {
            background-color: #f9f9f9;
        }
    </style>
</head>
<body>
    <h1>Danh sách Sinh Viên</h1>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Lớp Học</th>
                <th>Khoa</th>
                <th>Ngành Đào Tạo</th>
            </tr>
        </thead>
        <tbody>
               <c:forEach var="sinhVien" items="${sinhVienList}">
                <tr>
                    <td>${sinhVien.id}</td>
                    <td>${sinhVien.name}</td>
                    <td>${sinhVien.lopHoc.id}</td> <!-- Truy cập id của đối tượng LopHoc -->
                    <td>${sinhVien.khoa.id}</td>    <!-- Truy cập id của đối tượng Khoa -->
                    <td>${sinhVien.nganhDaoTao.id}</td> <!-- Truy cập id của đối tượng NganhDaoTao -->
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
