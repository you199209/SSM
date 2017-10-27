<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="common/head.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>任务列表</title>
</head>
<body>
    <div>
        <h2>任务列表</h2>
    </div>
    <div>
        <table class="table table-bordered">
            <thead>
            <tr>
                <td>用户ID</td>
                <td>用户名</td>
                <td>手机号</td>
                <td>积分</td>
                <td>创建时间</td>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="user" items="${userlist}">
                <tr>
                    <td>${user.userId}</td>
                    <td>${user.userName}</td>
                    <td>${user.userPhone}</td>
                    <td>${user.score}</td>
                    <td><fmt:formatDate value="${user.createTime}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>