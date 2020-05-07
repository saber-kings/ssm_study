<%--
  Created by IntelliJ IDEA.
  User: luanz
  Date: 2020/3/27
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>表单2</title>
</head>
<body>
    <form method="post" action="/showUserList.do">
        用户名1<input type="text" name="users[0].name"/> <br/>
        用户名2<input type="text" name="users[1].name"/> <br/>
        用户名3<input type="text" name="users[2].name"/> <br/>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>