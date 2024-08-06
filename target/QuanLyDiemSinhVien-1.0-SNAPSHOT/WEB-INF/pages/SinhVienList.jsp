<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Danh sách Sinh Viên</title>
    <meta charset="UTF-8">
    <!-- Thêm liên kết đến Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
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
    <!-- Navbar Bootstrap -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <a class="navbar-brand" href="#">Quản Lý Điểm Sinh Viên</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
               <ul class="navbar-nav">
                <li class="nav-item active">
                    <a class="nav-link" href="http://localhost:8080/QuanLyDiemSinhVien/">Trang chủ <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="http://localhost:8080/QuanLyDiemSinhVien/dssv">Sinh viên</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Lớp</a>
                </li> <li class="nav-item">
                    <a class="nav-link" href="#">Môn học</a>
                </li>
                 <li class="nav-item">
                    <a class="nav-link" href="#">Điểm</a>
                </li>
            </ul>
        </div>
    </nav>

    <div class="container mt-4">
        <h1 class="text-center mb-4">DANH SÁCH SINH VIÊN</h1>
        <table class="table table-bordered">
            <thead class="thead-dark">
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Lớp Học</th>
                    <th>Khoa</th>
                    <th>Ngành Đào Tạo</th>
                    <th>Hành Động</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="sinhVien" items="${sinhVienList}">
                    <tr>
                        <td>${sinhVien.id}</td>
                        <td>${sinhVien.name}</td>
                        <td>${sinhVien.lopHoc.name}</td> 
                        <td>${sinhVien.khoa.name}</td>
                        <td>${sinhVien.nganhDaoTao.name}</td> 
                        <td>
                            <a href="thaoTacSinhVien.jsp?id=${sinhVien.id}" class="btn btn-primary btn-sm">Chi tiết</a>
                            <a href="xoaSinhVien.jsp?id=${sinhVien.id}" class="btn btn-danger btn-sm">Xóa</a>
                            <a href="themSinhVien.jsp" class="btn btn-success btn-sm">Thêm</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>

    <!-- Thêm liên kết đến Bootstrap JS và các phụ thuộc -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
