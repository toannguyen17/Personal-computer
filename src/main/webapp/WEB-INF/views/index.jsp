<%--
  Created by IntelliJ IDEA.
  User: toanv
  Date: 07/07/2020
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Caculator</title>
  </head>
  <body>
  <form method="post">
    <input type="text" name="prefix" value='${requestScope["prefix"]}' />
    <select name="prosecution">
      <option value="+">+</option>
      <option value="-">+</option>
      <option value="*">*</option>
      <option value="/">/</option>
    </select>
    <input type="text" name="suffix" value='${requestScope["suffix"]}' />
    <input type="submit" value="Caculator" />
  </form>

  <c:if test='${requestScope["data"] != null}'>
    Result Division: ${requestScope["data"]}
  </c:if>
  </body>
</html>
