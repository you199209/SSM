<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="../common/head.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>用户列表</title>
</head>
<body>
    <div>
        <h2>用户列表</h2>
    </div>
    <div style="width: 800px">
        <table class="table table-bordered">
            <thead>
            <tr>
                <td>用户ID</td>
                <td>用户名</td>
                <td>手机号</td>
                <td>创建时间</td>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="user" items="${userlist}">
                <tr>
                    <td>${user.userId}</td>
                    <td>${user.userName}</td>
                    <td>${user.userPhone}</td>
                    <td><fmt:formatDate value="${user.createTime}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <nav aria-label="Page navigation">
            <ul class="pagination">
                <li>
                    <a href="/user/list" aria-label="Previous">
                        <span aria-hidden="true">&laquo;</span>
                    </a>
                </li>
                <li><a href="/pretty_ssm_master/user/list?pageNo=1&pageSize=10">1</a></li>
                <li><a href="/pretty_ssm_master/user/list?pageNo=2&pageSize=10">2</a></li>
                <li><a href="/pretty_ssm_master/user/list?pageNo=3&pageSize=10">3</a></li>
                <li><a href="/pretty_ssm_master/user/list?pageNo=4&pageSize=10">4</a></li>
                <li><a href="/pretty_ssm_master/user/list?pageNo=5&pageSize=10">5</a></li>
                <li>
                    <a href="#" aria-label="Next">
                        <span aria-hidden="true">&raquo;</span>
                    </a>
                </li>
            </ul>
        </nav>
    </div>
</body>
</html>