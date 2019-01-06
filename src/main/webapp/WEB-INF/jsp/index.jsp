<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
这是商品首页<br/>
<a href="${pageContext.request.contextPath}/product/add">商品添加</a><br/>
<a href="${pageContext.request.contextPath}/product/delete">商品删除</a><br/>
<a href="${pageContext.request.contextPath}/product/update">商品修改</a><br/>
<a href="${pageContext.request.contextPath}/product/list">商品查询</a>
</body>
</html>
